import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Capitalizer implements Runnable {

    private Socket socket;

    public Capitalizer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        safePrintln("Connected: " + socket);

        try {

            Scanner in = new Scanner(socket.getInputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);


            while (in.hasNextLine()) {
                safePrintln("1. Crear caso\n"+ "2. Hablar con agente");
                String message = in.nextLine();
                safePrintln("The message received is: " + message);

                String newMessage = message.toUpperCase();
                safePrintln("The message to be returned is: " + newMessage);
                out.println(newMessage);
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

