

import java.net.ServerSocket;
import java.util.concurrent.Executors;

/**
 * Example from: https://cs.lmu.edu/~ray/notes/javanetexamples/
 *
 * A server program which accepts requests from clients to capitalize strings.
 * When a client connects, a new thread is started to handle it. Receiving
 * client data, capitalizing it, and sending the response back is all done on
 * the thread, allowing much greater throughput because more clients can be
 * handled concurrently.
 */
public class Server {

    /**
     * Runs the server. When a client connects, the server spawns a new thread to do
     * the servicing and immediately returns to listening. The application limits
     * the number of threads via a thread pool (otherwise millions of clients could
     * cause the server to run out of resources by allocating too many threads).
     */
    public static void main(String[] args) throws Exception {

        // el número es el puerto local.
        try (var listener = new ServerSocket(59899)) {
            try (var listener2 = new ServerSocket(59898)) {

                System.out.println("The server is running...");

                //máximo 20 hilos, 20 clientes.
                //20 clientes conectados al mismo tiempo.
                var pool = Executors.newFixedThreadPool(20);

                while (true) {
                    //clase que implementa runable, para implementar un hilo en java.
                    pool.execute(new Bridge(listener.accept(),listener2.accept()));
                }
            }

        }

    }

}