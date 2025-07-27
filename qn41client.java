
import java.net.*;
import java.util.Scanner;

public class qn41client {

    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        Scanner scanner = new Scanner(System.in);
        InetAddress address = InetAddress.getByName("localhost");
        System.out.print("Enter number: ");
        String num = scanner.nextLine();
        byte[] sendData = num.getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, address, 8888);
        socket.send(sendPacket);
        byte[] buffer = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
        socket.receive(receivePacket);
        String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
        System.out.println("Server Response: " + response);
    }
}
