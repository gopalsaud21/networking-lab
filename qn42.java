
import java.net.*;

public class qn42 {

    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        socket.setSoTimeout(5000); // 5 sec timeout
        socket.setReuseAddress(true);
        socket.setBroadcast(true);
        System.out.println("UDP Socket options set:");
        System.out.println("Timeout: " + socket.getSoTimeout());
        System.out.println("Reuse Address: " + socket.getReuseAddress());
        System.out.println("Broadcast: " + socket.getBroadcast());
        socket.close();
    }
}
