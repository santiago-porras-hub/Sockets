

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import File.Archivo;
import File.Pet;

public class Capitalizer implements Runnable {

    //comunicación entre el servidor y el cliente.
    private Socket socket;
    private Socket socket2;
    ArrayList<Pet> list = new ArrayList<>();
    Archivo archivo= new Archivo();

    public Capitalizer(Socket socket, Socket socket2) {

    	list= archivo.readFile();
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

            out.println("Bienvenido a ciudadanos de 4 patas");
//            do{
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
                                Date date = new Date();
                                String date2= String.valueOf(date);
                                out.println("Caso de pérdida generado..... oprima enter para continuar.");
                                list.add(new Pet("Caso Perdida",species,size,neighborhood,address,nameReporter,telephoneReporter,emailReporter,comments,date2));
                                archivo.writeFile(list);
//                            System.exit(0);
                                //perdida
                                break;
                            case "2":
                                out.println("Escriba la especie del animal");
                                String species2 = in.nextLine();
                                out.println("Escriba el tamaño del animal");
                                String size2 = in.nextLine();
                                out.println("Escriba el barrio/localidad");
                                String neighborhood2 = in.nextLine();
                                out.println("Escriba la dirección");
                                String address2 = in.nextLine();
                                out.println("Escriba el nombre completo de la persona que reporta");
                                String nameReporter2 = in.nextLine();
                                out.println("escriba el telefono de la persona que reporta");
                                String telephoneReporter2 = in.nextLine();
                                out.println("escriba el email de la persona que reporta");
                                String emailReporter2 = in.nextLine();
                                out.println("escriba comentarios generales del caso de robo");
                                String comments2 = in.nextLine();
                                Date date1 = new Date();
                                String date3= String.valueOf(date1);
                                out.println("Caso de robo generado..... oprima enter para continuar.");
                                list.add(new Pet("Caso Robo",species2,size2,neighborhood2,address2,nameReporter2,telephoneReporter2,emailReporter2,comments2,date3));
                                archivo.writeFile(list);
//                                System.exit(0);
                                //Robo
                                break;
                            case "3":
                                out.println("Escriba la especie del animal");
                                String species3 = in.nextLine();
                                out.println("Escriba el tamaño del animal");
                                String size3 = in.nextLine();
                                out.println("Escriba el barrio/localidad");
                                String neighborhood3 = in.nextLine();
                                out.println("Escriba la dirección");
                                String address3 = in.nextLine();
                                out.println("Escriba el nombre completo de la persona que reporta");
                                String nameReporter3 = in.nextLine();
                                out.println("escriba el telefono de la persona que reporta");
                                String telephoneReporter3 = in.nextLine();
                                out.println("escriba el email de la persona que reporta");
                                String emailReporter3 = in.nextLine();
                                out.println("escriba comentarios generales del caso de abandono");
                                String comments3 = in.nextLine();
                                Date date5 = new Date();
                                String date4= String.valueOf(date5);
                                out.println("Caso de abandono generado..... oprima enter para continuar.");
                                list.add(new Pet("Caso Abandono",species3,size3,neighborhood3,address3,nameReporter3,telephoneReporter3,emailReporter3,comments3,date4));
                                archivo.writeFile(list);
//                                System.exit(0);
                                //Abandono
                                break;
                            case "4":
                                out.println("Escriba la especie del animal");
                                String species4 = in.nextLine();
                                out.println("Escriba el tamaño del animal");
                                String size4 = in.nextLine();
                                out.println("Escriba el barrio/localidad");
                                String neighborhood4 = in.nextLine();
                                out.println("Escriba la dirección");
                                String address4 = in.nextLine();
                                out.println("Escriba el nombre completo de la persona que reporta");
                                String nameReporter4 = in.nextLine();
                                out.println("escriba el telefono de la persona que reporta");
                                String telephoneReporter4 = in.nextLine();
                                out.println("escriba el email de la persona que reporta");
                                String emailReporter4 = in.nextLine();
                                out.println("escriba comentarios generales del caso de animal peligroso");
                                String comments4 = in.nextLine();
                                Date date6 = new Date();
                                String date7= String.valueOf(date6);
                                out.println("Caso de animal peligroso generado..... oprima enter para continuar.");
                                list.add(new Pet("Caso Peligroso",species4,size4,neighborhood4,address4,nameReporter4,telephoneReporter4,emailReporter4,comments4,date7));
                                archivo.writeFile(list);
//                                System.exit(0);
                                //Animal peligroso
                                break;
                            case "5":
                                out.println("Escriba la especie del animal");
                                String species5 = in.nextLine();
                                out.println("Escriba el tamaño del animal");
                                String size5 = in.nextLine();
                                out.println("Escriba el barrio/localidad");
                                String neighborhood5 = in.nextLine();
                                out.println("Escriba la dirección");
                                String address5 = in.nextLine();
                                out.println("Escriba el nombre completo de la persona que reporta");
                                String nameReporter5 = in.nextLine();
                                out.println("escriba el telefono de la persona que reporta");
                                String telephoneReporter5 = in.nextLine();
                                out.println("escriba el email de la persona que reporta");
                                String emailReporter5 = in.nextLine();
                                out.println("escriba comentarios generales del Manejo indebido en vía pública.");
                                String comments5 = in.nextLine();
                                Date date8 = new Date();
                                String date9= String.valueOf(date8);
                                out.println("Caso de Manejo indebido en vía pública. generado..... oprima enter para continuar.");
                                list.add(new Pet("Caso Peligroso",species5,size5,neighborhood5,address5,nameReporter5,telephoneReporter5,emailReporter5,comments5,date9));
                                archivo.writeFile(list);
                                
                                System.exit(0);
                                //Manejo indebido en vía pública.
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
                }
//            }while(in.hasNextLine());





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