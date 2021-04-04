

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
        this.socket2 = socket2;
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

            out.println("Bienvenido a ciudadanos de 4 patas");
            out.println("1. Crear caso ----- 2. Hablar con agente");
            String message = in.nextLine();

            switch (message) {
                case "1":
                    out.println("1. Perdida---"
                            + " 2. Robo---"
                            + " 3. Abandono---"
                            + " 4. Animal peligroso---"
                            + " 5. Manejo indebido en via pública");
                    message = in.nextLine();
                    switch (message) {
                        case "1":
                            out.println("Escriba la especie del animal");
                            String species = in.nextLine();
                            out.println("Escriba el tamaño del animal");
                            String size = in.nextLine();
                            out.println("Escriba el barrio/localidad");
                            String neighborhood = in.nextLine();
                            out.println("Escriba la dirección");
                            String address = in.nextLine();
                            out.println("Escriba el nombre completo de la persona que reporta");
                            String nameReporter = in.nextLine();
                            out.println("escriba el telefono de la persona que reporta");
                            String telephoneReporter = in.nextLine();
                            out.println("escriba el email de la persona que reporta");
                            String emailReporter = in.nextLine();
                            out.println("escriba comentarios generales del caso de perdida");
                            String comments = in.nextLine();
                            out.println("Caso generado");
                            System.exit(0);

                            //perdida
                            break;
                    }
                    break;
                case "2":
                    out.println("");
                    out2.println("1. Aceptar --- 2. Denegar");
                    while (in.hasNextLine()||in2.hasNextLine()) {
                        message = in.nextLine();
                        var message2 = in2.nextLine();
                        safePrintln("The message received is: " + message);
                        var newMessage = message.toUpperCase();
                        var newMessage2 = message2.toUpperCase();
                        safePrintln("The message to be returned is: " + newMessage);
                        out2.println("Client: "+newMessage);
                        out.println("Agent: "+newMessage2);
                    }
//                    safePrintln("Escriba confirmar: ");
//                    out.println(scanner.nextLine());
//                    String confirm = in.nextLine();
//                    while (scanner.hasNextLine()) {
//                        out.println(scanner.nextLine());
//                        //mensaje transformado desde mi objeto scanner de mi socket
//                        String chat=in.nextLine();
//                        if(chat.length()>0){
//                            System.out.println("Agent: " + chat);
//                        }else{
//                        }
//                    }
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