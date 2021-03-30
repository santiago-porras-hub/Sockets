import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main (String [] args) throws IOException {

        //apunte hacia "" con el servidor 97
        try (Socket socket = new Socket("127.0.0.1", 12332)) {

            //quien se conectó
            System.out.println("Connected: " + socket);
            //mensaje que el usuario envia al servidor
            System.out.println("1. Crear caso\n"+ "2. Hablar con agente");

            Scanner scanner = new Scanner(System.in);
            Scanner in = new Scanner(socket.getInputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // escucha un mensaje hasta que el usuario ingreese algo y oprima enter, se espera la entrada por teclado
            while (scanner.hasNextLine()) {
                out.println(scanner.nextLine());
                //mensaje transformado desde mi objeto scanner de mi socket
                System.out.println("Transformed message: " + in.nextLine());
            }

        }

    }


}

