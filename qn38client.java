
import java.net.*;

public class qn38client {

    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        byte[] buffer = "Hello UDP".getBytes();
        InetAddress address = InetAddress.getByName("localhost");
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 4445);
        socket.send(packet);

        packet = new DatagramPacket(new byte[256], 256);
        socket.receive(packet);
        System.out.println("Echoed: " + new String(packet.getData(), 0, packet.getLength()));
        socket.close();
    }
}
