
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class qn39server {

    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(9998);
        byte[] buffer = new byte[256];

        while (true) {
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);
            String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
            byte[] timeBytes = time.getBytes();

            packet = new DatagramPacket(timeBytes, timeBytes.length, packet.getAddress(), packet.getPort());
            socket.send(packet);
        }
    }
}
