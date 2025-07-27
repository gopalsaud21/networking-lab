
import java.net.*;
import java.util.*;
import java.util.regex.*;

public class qn7 {

    public static void main(String[] args) throws Exception {
        // Your MAC address to search
        String input = "39-B1-DB-34-69-3B";

        NetworkInterface netIf = null;

        // Check if input is IP
        if (isIP(input)) {
            netIf = NetworkInterface.getByInetAddress(InetAddress.getByName(input));
        } // Check if input is MAC address
        else if (isMAC(input)) {
            for (NetworkInterface ni : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                byte[] mac = ni.getHardwareAddress();
                if (mac != null && macToStr(mac).equalsIgnoreCase(normMAC(input))) {
                    netIf = ni;
                    break;
                }
            }
        } // Otherwise treat input as interface name
        else {
            for (NetworkInterface ni : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (ni.getName().equalsIgnoreCase(input)
                        || (ni.getDisplayName() != null && ni.getDisplayName().equalsIgnoreCase(input))) {
                    netIf = ni;
                    break;
                }
            }
        }

        if (netIf == null) {
            System.out.println("Interface not found.");
            System.out.println("Available interfaces:");
            for (NetworkInterface ni : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                System.out.println("- Name: " + ni.getName() + ", Display: " + ni.getDisplayName());
            }
            return;
        }

        System.out.println("Name         : " + netIf.getName());
        System.out.println("Display Name : " + netIf.getDisplayName());
        System.out.println("MAC Address  : "
                + (netIf.getHardwareAddress() != null ? macToStr(netIf.getHardwareAddress()) : "N/A"));

        for (InetAddress ip : Collections.list(netIf.getInetAddresses())) {
            System.out.println("IP Address   : " + ip.getHostAddress());
        }
    }

    static boolean isIP(String s) {
        try {
            InetAddress.getByName(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    static boolean isMAC(String s) {
        return Pattern.matches("^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$", s);
    }

    static String macToStr(byte[] mac) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mac.length; i++) {
            sb.append(String.format("%02X", mac[i]));
            if (i < mac.length - 1) {
                sb.append("-");
            }
        }
        return sb.toString();
    }

    static String normMAC(String s) {
        return s.toUpperCase().replace(":", "-");
    }
}
