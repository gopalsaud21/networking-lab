
import java.net.*;

public class qn39client {

    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        InetAddress address = InetAddress.getByName("localhost");

        byte[] send = "TIME".getBytes();
        DatagramPacket packet = new DatagramPacket(send, send.length, address, 9998);
        socket.send(packet);

        packet = new DatagramPacket(new byte[256], 256);
        socket.receive(packet);
        System.out.println("Server time: " + new String(packet.getData(), 0, packet.getLength()));
        socket.close();
    }
}
