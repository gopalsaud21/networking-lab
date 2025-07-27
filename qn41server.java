
//Client and Server to Check Armstrong Number
import java.net.*;

public class qn41server {

    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(8888);
        byte[] buffer = new byte[1024];
        System.out.println("Armstrong Server started...");
        while (true) {
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);
            String numStr = new String(packet.getData(), 0, packet.getLength());
            int num = Integer.parseInt(numStr);
            int temp = num, sum = 0, digit;
            while (temp != 0) {
                digit = temp % 10;
                sum += Math.pow(digit, 3);
                temp /= 10;
            }
            String result = (sum == num) ? "Armstrong" : "Not Armstrong";
            byte[] response = result.getBytes();
            socket.send(new DatagramPacket(response, response.length, packet.getAddress(), packet.getPort()));
        }
    }
}
