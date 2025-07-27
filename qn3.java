
import java.net.InetAddress;
import java.net.UnknownHostException;

public class qn3 {

    public static void main(String[] args) {
        try {
            InetAddress inet = InetAddress.getLocalHost();

            System.out.println("IP Address           : " + inet.getHostAddress());
            System.out.println("Is Loopback Address  : " + inet.isLoopbackAddress());
            System.out.println("Is Link Local Address: " + inet.isLinkLocalAddress());
            System.out.println("Is Site Local Address: " + inet.isSiteLocalAddress());
            System.out.println("Is Multicast Address : " + inet.isMulticastAddress());
            System.out.println("Is Any Local Address : " + inet.isAnyLocalAddress());
            System.out.println("Is Global Address    : " + (!inet.isLoopbackAddress()
                    && !inet.isSiteLocalAddress()
                    && !inet.isAnyLocalAddress()
                    && !inet.isMulticastAddress()
                    && !inet.isLinkLocalAddress()));

        } catch (UnknownHostException e) {
            System.out.println("Unable to retrieve IP address.");
            e.printStackTrace();
        }
    }
}
