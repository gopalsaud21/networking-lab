
import java.net.*;
import java.util.*;

public class qn9 {

    public static void main(String[] args) {
        try {
            NetworkInterface netByName = NetworkInterface.getByName("lo");
            if (netByName != null) {
                printInterfaceDetails(netByName);
            }

            InetAddress localHost = InetAddress.getLocalHost();
            NetworkInterface netByAddress = NetworkInterface.getByInetAddress(localHost);
            if (netByAddress != null) {
                printInterfaceDetails(netByAddress);
            }

            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface ni = interfaces.nextElement();
                System.out.println(ni.getName());
                System.out.println(ni.getDisplayName());
                System.out.println(ni.isUp());
                System.out.println(ni.supportsMulticast());
                System.out.println(ni.isLoopback());
                System.out.println(getMacAddress(ni));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void printInterfaceDetails(NetworkInterface ni) throws SocketException {
        System.out.println(ni.getName());
        System.out.println(ni.getDisplayName());
        System.out.println(ni.isUp());
        System.out.println(ni.isLoopback());
        System.out.println(ni.supportsMulticast());
        System.out.println(ni.getMTU());
        System.out.println(getMacAddress(ni));
    }

    static String getMacAddress(NetworkInterface ni) throws SocketException {
        byte[] mac = ni.getHardwareAddress();
        if (mac == null) {
            return "Not Available";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mac.length; i++) {
            sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
        }
        return sb.toString();
    }
}
