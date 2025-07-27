
import java.net.*;

public class qn33 {

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.setReuseAddress(true);
        serverSocket.bind(new InetSocketAddress(8080));
        System.out.println("Server started with reuseAddress.");
        serverSocket.close();
    }
}
