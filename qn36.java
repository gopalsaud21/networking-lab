
import java.net.*;

public class qn36 {

    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        System.out.println("Local Address: " + socket.getLocalAddress());
        System.out.println("Local Port: " + socket.getLocalPort());
        socket.close();
    }
}
