
import java.net.InetAddress;
import java.net.UnknownHostException;

public class qn1 {

    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            System.out.println("Hostname: " + inetAddress.getHostName());
            System.out.println("IP Address: " + inetAddress.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("IP address could not be found.");
            e.printStackTrace();
        }
    }
}
