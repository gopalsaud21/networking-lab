
import java.net.*;

public class qn40client {

    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        byte[] buffer = "Hello from UDP client".getBytes();
        InetAddress address = InetAddress.getByName("localhost");

        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 6789);
        socket.send(packet);
        socket.close();
    }
}
