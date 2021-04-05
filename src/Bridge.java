

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import File.Archivo;
import File.Pet;

public class Bridge implements Runnable {

    //comunicación entre el servidor y el cliente.

    //Se instancian dos sockets para lograr el funcionamiento del chat cuando sea necesario
    private Socket socket;
    private Socket socket2;
    ArrayList<Pet> list = new ArrayList<>();
    Archivo archivo = new Archivo();

    public Bridge(Socket socket, Socket socket2) {

        //La lista de mascotas se lee para que cuando se vuelva a escribir, no se pierda la informaciíon registrada con anterioridad
        list = archivo.readFile();
        this.socket = socket;
        this.socket2 = socket2;
    }

    @Override
    public void run() {

        safePrintln("Connected: " + socket);
        safePrintln("Connected: " + socket2);

        try {

            //in para leer lo que escribe el usuario, out para mandarle el mensaje a al usuario
            var in = new Scanner(socket.getInputStream());
            var out = new PrintWriter(socket.getOutputStream(), true);

            var in2 = new Scanner(socket2.getInputStream());
            var out2 = new PrintWriter(socket2.getOutputStream(), true);

            //variable message para los mensajes que ingresa el usuario durante la ejecucion
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
                        //Para cada tipo de caso, se crea un objeto Pet con los parametros ingresados, se añade dicha mascota al arreglo para finalmente poder agregarla al archivo, con la fecha precisa....
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
                            String date2 = String.valueOf(date);
                            out.println("Caso de pérdida generado..... oprima enter para finalizar.");
                            list.add(new Pet("Caso Perdida", species, size, neighborhood, address, nameReporter, telephoneReporter, emailReporter, comments, date2));
                            archivo.writeFile(list);
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
                            String date3 = String.valueOf(date1);
                            out.println("Caso de robo generado..... oprima enter para finalizar.");
                            list.add(new Pet("Caso Robo", species2, size2, neighborhood2, address2, nameReporter2, telephoneReporter2, emailReporter2, comments2, date3));
                            archivo.writeFile(list);
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
                            String date4 = String.valueOf(date5);
                            out.println("Caso de abandono generado..... oprima enter para finalizar.");
                            list.add(new Pet("Caso Abandono", species3, size3, neighborhood3, address3, nameReporter3, telephoneReporter3, emailReporter3, comments3, date4));
                            archivo.writeFile(list);
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
                            String date7 = String.valueOf(date6);
                            out.println("Caso de animal peligroso generado..... oprima enter para finalizar.");
                            list.add(new Pet("Caso Peligroso", species4, size4, neighborhood4, address4, nameReporter4, telephoneReporter4, emailReporter4, comments4, date7));
                            archivo.writeFile(list);
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
                            String date9 = String.valueOf(date8);
                            out.println("Caso de Manejo indebido en vía pública. generado..... oprima enter para finalizar.");
                            list.add(new Pet("Caso Peligroso", species5, size5, neighborhood5, address5, nameReporter5, telephoneReporter5, emailReporter5, comments5, date9));
                            archivo.writeFile(list);
                            //Manejo indebido en vía pública.
                            break;
                    }
                    break;
                case "2":
                    //Envio de mensaje para confirmar la conexion (Se le envia al agente)
                    out2.println("1. Aceptar --- 2. Denegar");
                    if (in2.nextLine().equals("1")) {
                        //Una vez aceptada la conexion, se envía un mensaje que notifica al usuario para así poder empezar el dialogo

                        //IMPORTANTE: INDEPENDIENTE MENTE DEL ROL DEL USUARIO, SE DEBE OPRIMIR ENTER PARA RECIBIR Y MOSTRAR EL MENSAJE
                        out.println("Conexion establecida...");
                        safePrintln("Iniciando chat Agente - Cliente :D");
                        out2.println("Conexion aceptada con el usuario :D");
                        while (in.hasNextLine() || in2.hasNextLine()) {
                            message = in.nextLine();
                            var message2 = in2.nextLine();
                            out2.println("Cliente: "+message);
                            out.println("Agente: "+message2);
                        }
                    } else {
                        //IMPORTANTE: SE NOTIFICA QUE NO HAY AGENTES, POSTERIORMENTE DEBE OPRIMIR ENTER PARA FINALIZAR LA CONEXION
                        out.println("");
                        out.println("No hay agentes disponibles :(");
                        out2.println("Conexion negada...");
                        safePrintln("Sin agenges disponibles :(");
                    }

            }
        } catch (Exception e) {
            safePrintln("Error:" + socket);
        } finally {
            try {
                socket.close();
                socket2.close();
            } catch (IOException e) {
            }
            safePrintln("Closed: " + socket);
            safePrintln("Closed: " + socket2);
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