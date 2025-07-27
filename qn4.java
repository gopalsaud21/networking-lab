
import java.net.*;

public class qn4 {

    public static int getVersion(InetAddress ia) {
        byte[] address = ia.getAddress();
        if (address.length == 4) {
            return 4;
        } else if (address.length == 16) {
            return 6;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("192.168.1.1");
            int version = getVersion(ip);
            System.out.println("IP Address: " + ip.getHostAddress());
            System.out.println("IP Version: IPv" + version);
        } catch (UnknownHostException e) {
            System.out.println("Invalid IP address.");
        }
    }
}
