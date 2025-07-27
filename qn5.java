
import java.net.*;
import java.util.*;

public class qn5 {

    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();

            while (interfaces.hasMoreElements()) {
                NetworkInterface netIf = interfaces.nextElement();
                System.out.println("Interface Name: " + netIf.getName());
                System.out.println("Display Name: " + netIf.getDisplayName());

                Enumeration<InetAddress> addresses = netIf.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    InetAddress addr = addresses.nextElement();
                    System.out.println("IP Address: " + addr.getHostAddress());
                }
            }

        } catch (SocketException e) {
            System.out.println("Error retrieving network interfaces.");
            e.printStackTrace();
        }
    }
}
