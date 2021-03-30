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
                switch (message){
                    case "1":
                        safePrintln("1. Perdida\n"
                                + "2. Robo\n"
                                + "3. Abandono\n"
                                + "4. Animal peligroso\n"
                                + "5. Manejo indebido en via pública");
                        String cases = in.nextLine();
                        safePrintln("The message received is: " + cases);
                        switch (cases){
                            case "1":
                                safePrintln("Escriba la especie del animal");
                                String species = in.nextLine();
                                safePrintln("Escriba el tamaño del animal");
                                String size = in.nextLine();
                                safePrintln("Escriba el barrio/localidad");
                                String neighborhood = in.nextLine();
                                safePrintln("Escriba la dirección");
                                String address = in.nextLine();
                                safePrintln("Escriba el nombre completo de la persona que reporta");
                                String nameReporter = in.nextLine();
                                safePrintln("escriba el telefono de la persona que reporta");
                                String telephoneReporter = in.nextLine();
                                safePrintln("escriba el email de la persona que reporta");
                                String emailReporter = in.nextLine();
                                safePrintln("escriba comentarios generales del caso");
                                String comments = in.nextLine();
                                //perdida
                                break;
                            case "2":
                                safePrintln("Escriba la especie del animal");
                                String species2 = in.nextLine();
                                safePrintln("Escriba el tamaño del animal");
                                String size2 = in.nextLine();
                                safePrintln("Escriba el barrio/localidad");
                                String neighborhood2 = in.nextLine();
                                safePrintln("Escriba la dirección");
                                String address2 = in.nextLine();
                                safePrintln("Escriba el nombre completo de la persona que reporta");
                                String nameReporter2 = in.nextLine();
                                safePrintln("escriba el telefono de la persona que reporta");
                                String telephoneReporter2 = in.nextLine();
                                safePrintln("escriba el email de la persona que reporta");
                                String emailReporter2 = in.nextLine();
                                safePrintln("escriba comentarios generales del caso");
                                String comments2 = in.nextLine();
                                //robo
                                break;
                            case "3":
                                safePrintln("Escriba la especie del animal");
                                String species3 = in.nextLine();
                                safePrintln("Escriba el tamaño del animal");
                                String size3 = in.nextLine();
                                safePrintln("Escriba el barrio/localidad");
                                String neighborhood3 = in.nextLine();
                                safePrintln("Escriba la dirección");
                                String address3 = in.nextLine();
                                safePrintln("Escriba el nombre completo de la persona que reporta");
                                String nameReporter3 = in.nextLine();
                                safePrintln("escriba el telefono de la persona que reporta");
                                String telephoneReporter3 = in.nextLine();
                                safePrintln("escriba el email de la persona que reporta");
                                String emailReporter3 = in.nextLine();
                                safePrintln("escriba comentarios generales del caso");
                                String comments3 = in.nextLine();
                                //abandono
                                break;
                            case "4":
                                safePrintln("Escriba la especie del animal");
                                String species4 = in.nextLine();
                                safePrintln("Escriba el tamaño del animal");
                                String size4 = in.nextLine();
                                safePrintln("Escriba el barrio/localidad");
                                String neighborhood4 = in.nextLine();
                                safePrintln("Escriba la dirección");
                                String address4 = in.nextLine();
                                safePrintln("Escriba el nombre completo de la persona que reporta");
                                String nameReporter4 = in.nextLine();
                                safePrintln("escriba el telefono de la persona que reporta");
                                String telephoneReporter4 = in.nextLine();
                                safePrintln("escriba el email de la persona que reporta");
                                String emailReporter4 = in.nextLine();
                                safePrintln("escriba comentarios generales del caso");
                                String comments4 = in.nextLine();
                                //animal peligroso
                                break;
                            case "5":
                                safePrintln("Escriba la especie del animal");
                                String species5 = in.nextLine();
                                safePrintln("Escriba el tamaño del animal");
                                String size5 = in.nextLine();
                                safePrintln("Escriba el barrio/localidad");
                                String neighborhood5 = in.nextLine();
                                safePrintln("Escriba la dirección");
                                String address5 = in.nextLine();
                                safePrintln("Escriba el nombre completo de la persona que reporta");
                                String nameReporter5 = in.nextLine();
                                safePrintln("escriba el telefono de la persona que reporta");
                                String telephoneReporter5 = in.nextLine();
                                safePrintln("escriba el email de la persona que reporta");
                                String emailReporter5 = in.nextLine();
                                safePrintln("escriba comentarios generales del caso");
                                String comments5 = in.nextLine();
                                //manejo indebido
                                break;
                        }
                        break;
                    case "2":
                }
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

