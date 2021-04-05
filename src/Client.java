

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws Exception {

        try (var socket = new Socket("127.0.0.1", 59899)) {


            System.out.println("Connected: " + socket);
            var scanner = new Scanner(System.in);
            var in = new Scanner(socket.getInputStream());
            var out = new PrintWriter(socket.getOutputStream(), true);
            //Muestra el mensaje de Bienvenida por parte del servidor
            System.out.println(in.nextLine());
            //Muestra el primer mensaje del menú, crear caso o comenzar chat
            System.out.println(in.nextLine());
            while (scanner.hasNextLine()) {
                out.println(scanner.nextLine());
                String message=in.nextLine();
                if(!message.equals("Agente: ")){
                    System.out.println( message);
                }else{
                }

            }

        }catch(NoSuchElementException e){
            //Cuando se finaliza la conexion, se notifica al usuario
            System.out.println("Desconexion...");
        }

    }
}

