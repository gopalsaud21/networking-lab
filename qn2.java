
import java.net.InetAddress;
import java.net.UnknownHostException;

public class qn2 {

    public static void main(String[] args) {
        try {
            InetAddress inet = InetAddress.getLocalHost();

            System.out.println("Host Name      : " + inet.getHostName());
            System.out.println("Host Address   : " + inet.getHostAddress());
            System.out.println("Canonical Host : " + inet.getCanonicalHostName());
            System.out.println("Is Reachable   : " + inet.isReachable(1000));
            System.out.println("Is Loopback    : " + inet.isLoopbackAddress());
            System.out.println("Is Site Local  : " + inet.isSiteLocalAddress());
            System.out.println("Is Multicast   : " + inet.isMulticastAddress());

        } catch (UnknownHostException e) {
            System.out.println("Host not found.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error occurred.");
            e.printStackTrace();
        }
    }
}
