import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    public static void main (String [] args) throws IOException {
        try(ServerSocket listener = new ServerSocket(12333)){

            System.out.println("Server Connected");
            ExecutorService pool = Executors.newFixedThreadPool(10);

            while(true){
                pool.execute(new Capitalizer(listener.accept()));
            }
        }
    }
}
