

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Capitalizer implements Runnable {

    //comunicación entre el servidor y el cliente.
    private Socket socket;
    private Socket socket2;

    public Capitalizer(Socket socket, Socket socket2) {

        this.socket = socket;
        this.socket2=socket2;
    }

    @Override
    public void run() {

        safePrintln("Connected: " + socket);
        safePrintln("Connected: " + socket2);

        try {

            var in = new Scanner(socket.getInputStream());
            var out = new PrintWriter(socket.getOutputStream(), true);

            var in2 = new Scanner(socket2.getInputStream());
            var out2 = new PrintWriter(socket2.getOutputStream(), true);
            String aux = "";
            while (in.hasNextLine()||in2.hasNextLine()) {
                var message = in.nextLine();
                if(!message.equals("confirmar")&&!aux.equals("confirmar")){
                    safePrintln("The message received is: " + message);

                    String newMessage = message.toUpperCase();
                    safePrintln("The message to be returned is: " + newMessage);
                    out.println(newMessage);
                }
                else{
                    aux = "confirmar";
//                    out.println("");
                    var message2 = in2.nextLine();
//                    safePrintln("The message received is: " + message);
                    var newMessage = message.toUpperCase();
                    var newMessage2 = message2.toUpperCase();
//                    safePrintln("The message to be returned is: " + newMessage);
                    out2.println(newMessage);
                    out.println(newMessage2);
                }

            }

        } catch (Exception e) {
            safePrintln("Error:" + socket);
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
            }
            safePrintln("Closed: " + socket);
        }
    }

    public void safePrintln(String s) {
        // Coordinar, bloquear el recutso de forma temporal mientras el primer thread o cliente lo ultiliza, si llega
        //otro en ese momento lo hace esperar y después le da acceso al thread b


        // recurso compartido se tiene que sincronizar.
        synchronized (System.out) {
            System.out.println(s);
        }
    }

}