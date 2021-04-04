

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws Exception {

        try (var socket = new Socket("127.0.0.1", 59897)) {


            System.out.println("Connected: " + socket);

            var scanner = new Scanner(System.in);
            var in = new Scanner(socket.getInputStream());
            var out = new PrintWriter(socket.getOutputStream(), true);

            System.out.println(in.nextLine());
            System.out.println(in.nextLine());
            while (scanner.hasNextLine()) {
                out.println(scanner.nextLine());
                String message=in.nextLine();
                if(message.length()>0){
                    System.out.println( message);
                }else{
                }

            }

        }

    }
}

