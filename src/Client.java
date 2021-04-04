package co.edu.unbosque.socketswiththreads;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws Exception {

        //apunte hacia "" con el servidor 97
        try (var socket = new Socket("127.0.0.1", 59897)) {

            //quien se conectó
            System.out.println("Connected: " + socket);
            //mensaje que el usuario envia al servidor
            System.out.println("1. Crear caso\n" + "2. Hablar con agente");

            Scanner scanner = new Scanner(System.in);

            Scanner in = new Scanner(socket.getInputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // escucha un mensaje hasta que el usuario ingreese algo y oprima enter, se espera la entrada por teclado
//            while (scanner.hasNextLine()) {
            out.println(scanner.nextLine());
            String message = in.nextLine();
            switch (message) {
                case "1":
                    safePrintln("1. Perdida\n"
                            + "2. Robo\n"
                            + "3. Abandono\n"
                            + "4. Animal peligroso\n"
                            + "5. Manejo indebido en via pública");
                    out.println(scanner.nextLine());
                    message = in.nextLine();
                    switch (message) {
                        case "1":
                            safePrintln("Escriba la especie del animal");
                            out.println(scanner.nextLine());
                            String species = in.nextLine();
                            safePrintln("Escriba el tamaño del animal");
                            out.println(scanner.nextLine());
                            String size = in.nextLine();
                            safePrintln("Escriba el barrio/localidad");
                            out.println(scanner.nextLine());
                            String neighborhood = in.nextLine();
                            safePrintln("Escriba la dirección");
                            out.println(scanner.nextLine());
                            String address = in.nextLine();
                            safePrintln("Escriba el nombre completo de la persona que reporta");
                            out.println(scanner.nextLine());
                            String nameReporter = in.nextLine();
                            safePrintln("escriba el telefono de la persona que reporta");
                            out.println(scanner.nextLine());
                            String telephoneReporter = in.nextLine();
                            safePrintln("escriba el email de la persona que reporta");
                            out.println(scanner.nextLine());
                            String emailReporter = in.nextLine();
                            safePrintln("escriba comentarios generales del caso de perdida");
                            out.println(scanner.nextLine());
                            String comments = in.nextLine();
                            //perdida
                            break;
                        case "2":
                            safePrintln("Escriba la especie del animal");
                            out.println(scanner.nextLine());
                            String species2 = in.nextLine();
                            safePrintln("Escriba el tamaño del animal");
                            out.println(scanner.nextLine());
                            String size2 = in.nextLine();
                            safePrintln("Escriba el barrio/localidad");
                            out.println(scanner.nextLine());
                            String neighborhood2 = in.nextLine();
                            safePrintln("Escriba la dirección");
                            out.println(scanner.nextLine());
                            String address2 = in.nextLine();
                            safePrintln("Escriba el nombre completo de la persona que reporta");
                            out.println(scanner.nextLine());
                            String nameReporter2 = in.nextLine();
                            safePrintln("escriba el telefono de la persona que reporta");
                            out.println(scanner.nextLine());
                            String telephoneReporter2 = in.nextLine();
                            safePrintln("escriba el email de la persona que reporta");
                            out.println(scanner.nextLine());
                            String emailReporter2 = in.nextLine();
                            safePrintln("escriba comentarios generales del caso de robo");
                            out.println(scanner.nextLine());
                            String comments2 = in.nextLine();

                            //robo
                            break;
                        case "3":
                            safePrintln("Escriba la especie del animal");
                            out.println(scanner.nextLine());
                            String species3 = in.nextLine();
                            safePrintln("Escriba el tamaño del animal");
                            out.println(scanner.nextLine());
                            String size3 = in.nextLine();
                            safePrintln("Escriba el barrio/localidad");
                            out.println(scanner.nextLine());
                            String neighborhood3 = in.nextLine();
                            safePrintln("Escriba la dirección");
                            out.println(scanner.nextLine());
                            String address3 = in.nextLine();
                            safePrintln("Escriba el nombre completo de la persona que reporta");
                            out.println(scanner.nextLine());
                            String nameReporter3 = in.nextLine();
                            safePrintln("escriba el telefono de la persona que reporta");
                            out.println(scanner.nextLine());
                            String telephoneReporter3 = in.nextLine();
                            safePrintln("escriba el email de la persona que reporta");
                            out.println(scanner.nextLine());
                            String emailReporter3 = in.nextLine();
                            safePrintln("escriba comentarios generales del caso de abandono");
                            out.println(scanner.nextLine());
                            String comments3 = in.nextLine();
                            //abandono
                            break;
                        case "4":
                            safePrintln("Escriba la especie del animal");
                            out.println(scanner.nextLine());
                            String species4 = in.nextLine();
                            safePrintln("Escriba el tamaño del animal");
                            out.println(scanner.nextLine());
                            String size4 = in.nextLine();
                            safePrintln("Escriba el barrio/localidad");
                            out.println(scanner.nextLine());
                            String neighborhood4 = in.nextLine();
                            safePrintln("Escriba la dirección");
                            out.println(scanner.nextLine());
                            String address4 = in.nextLine();
                            safePrintln("Escriba el nombre completo de la persona que reporta");
                            out.println(scanner.nextLine());
                            String nameReporter4 = in.nextLine();
                            safePrintln("escriba el telefono de la persona que reporta");
                            out.println(scanner.nextLine());
                            String telephoneReporter4 = in.nextLine();
                            safePrintln("escriba el email de la persona que reporta");
                            out.println(scanner.nextLine());
                            String emailReporter4 = in.nextLine();
                            safePrintln("escriba comentarios generales del caso de animal peligroso");
                            out.println(scanner.nextLine());
                            String comments4 = in.nextLine();
                            //animal peligroso
                            break;
                        case "5":
                            safePrintln("Escriba la especie del animal");
                            out.println(scanner.nextLine());
                            String species5 = in.nextLine();
                            safePrintln("Escriba el tamaño del animal");
                            out.println(scanner.nextLine());
                            String size5 = in.nextLine();
                            safePrintln("Escriba el barrio/localidad");
                            out.println(scanner.nextLine());
                            String neighborhood5 = in.nextLine();
                            safePrintln("Escriba la dirección");
                            out.println(scanner.nextLine());
                            String address5 = in.nextLine();
                            safePrintln("Escriba el nombre completo de la persona que reporta");
                            out.println(scanner.nextLine());
                            String nameReporter5 = in.nextLine();
                            safePrintln("escriba el telefono de la persona que reporta");
                            out.println(scanner.nextLine());
                            String telephoneReporter5 = in.nextLine();
                            safePrintln("escriba el email de la persona que reporta");
                            out.println(scanner.nextLine());
                            String emailReporter5 = in.nextLine();
                            safePrintln("escriba comentarios generales del caso de manejo indebido");
                            out.println(scanner.nextLine());
                            String comments5 = in.nextLine();
                            //manejo indebido
                            break;
                    }
                    break;
                case "2":
                    safePrintln("Escriba confirmar: ");
                    out.println(scanner.nextLine());
                    String confirm = in.nextLine();
                    while (scanner.hasNextLine()) {
                        out.println(scanner.nextLine());
                        //mensaje transformado desde mi objeto scanner de mi socket
                        String chat=in.nextLine();
                        if(chat.length()>0){
                            System.out.println("Agent: " + chat);
                        }else{
                        }
                    }
            }
//            }

        }

    }

    public static void safePrintln(String s) {
        // Coordinar, bloquear el recutso de forma temporal mientras el primer thread o cliente lo ultiliza, si llega
        //otro en ese momento lo hace esperar y después le da acceso al thread b


        // recurso compartido se tiene que sincronizar.
        synchronized (System.out) {
            System.out.println(s);
        }
    }
}

