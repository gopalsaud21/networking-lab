
import java.net.*;
import java.util.Scanner;

public class qn8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter IP address: ");
        String ipAddress = sc.nextLine();

        try {
            InetAddress ip = InetAddress.getByName(ipAddress);
            NetworkInterface network = NetworkInterface.getByInetAddress(ip);

            if (network == null) {
                System.out.println("No network interface found for the given IP.");
                return;
            }

            byte[] mac = network.getHardwareAddress();

            if (mac == null) {
                System.out.println("MAC address not found.");
                return;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < mac.length; i++) {
                sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
            }

            System.out.println("MAC Address: " + sb.toString());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
