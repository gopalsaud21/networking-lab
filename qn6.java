
import java.net.*;

public class qn6 {

    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("IP Address : " + ip.getHostAddress());

            NetworkInterface network = NetworkInterface.getByInetAddress(ip);

            if (network == null) {
                System.out.println("No network interface found for this IP.");
                return;
            }

            byte[] mac = network.getHardwareAddress();

            if (mac != null) {
                StringBuilder macAddress = new StringBuilder();
                for (int i = 0; i < mac.length; i++) {
                    macAddress.append(String.format("%02X", mac[i]));
                    if (i < mac.length - 1) {
                        macAddress.append("-");
                    }
                }
                System.out.println("MAC Address: " + macAddress.toString());
            } else {
                System.out.println("MAC address not found.");
            }

        } catch (Exception e) {
            System.out.println("Error occurred.");
            e.printStackTrace();
        }
    }
}
