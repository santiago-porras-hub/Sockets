

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Agent {

    public static void main(String[] args) throws Exception {

        try (var socket = new Socket("127.0.0.1", 59898)) {

            System.out.println("Connected: " + socket);

            var scanner = new Scanner(System.in);
            var in = new Scanner(socket.getInputStream());
            var out = new PrintWriter(socket.getOutputStream(), true);
            //Mensaje de confirmación para iniciar el chat, SOLO CUANDO SE ESCOGE LA OPCION
            System.out.println(in.nextLine());

            while (scanner.hasNextLine()) {
                out.println(scanner.nextLine());
                String message=in.nextLine();
                if(!message.equals("Cliente: ")){
                    System.out.println( message);
                }else{
                }
            }

        }catch(NoSuchElementException e){
            System.out.println("Desconexion...");
        }

    }
}