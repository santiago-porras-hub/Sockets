

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Agent {

    public static void main(String[] args) throws Exception {

        //apunte hacia "" con el servidor 97
        try (var socket = new Socket("127.0.0.1", 59898)) {


            //quien se conectó
            System.out.println("Connected: " + socket);
            //mensaje que el usuario envia al servidor
            System.out.println("Enter the message to be capitalized...");

            var scanner = new Scanner(System.in);
            var in = new Scanner(socket.getInputStream());
            var out = new PrintWriter(socket.getOutputStream(), true);

            // escucha un mensaje hasta que el usuario ingreese algo y oprima enter, se espera la entrada por teclado

            while (scanner.hasNextLine()) {
                out.println(scanner.nextLine());
                //mensaje transformado desde mi objeto scanner de mi socket
                String message=in.nextLine();
                if(message.length()>0&&!message.equals("CONFIRMAR")){
                    System.out.println("Transformed message: " + message);
                }else{
                }
            }

        }

    }
}