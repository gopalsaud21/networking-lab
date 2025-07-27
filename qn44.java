package com.mycompany.nt;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class qn44 {
    public static void main(String[] args) {
        int port = 4446;
        String groupIP = "230.0.0.1";  // Multicast IP address

        try {
            MulticastSocket socket = new MulticastSocket(port);
            InetAddress group = InetAddress.getByName(groupIP);
            socket.joinGroup(group);

            System.out.println("Multicast Sniffer started. Listening to group " + groupIP + " on port " + port);

            byte[] buffer = new byte[1024];
            while (true) {
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                socket.receive(packet);

                String msg = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Received message: " + msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
