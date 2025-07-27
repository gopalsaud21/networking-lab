
import java.net.*;

public class qn40server {

    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(6789);
        byte[] buffer = new byte[1024];

        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        socket.receive(packet);
        String message = new String(packet.getData(), 0, packet.getLength());
        System.out.println("Received: " + message);
        socket.close();
    }
}
