
import java.net.*;

public class qn32 {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket();
        socket.setReuseAddress(true);
        socket.setSoTimeout(3000);  // timeout 3 sec
        socket.connect(new InetSocketAddress("example.com", 80));
        System.out.println("Connected with timeout and reuseAddress set.");
        socket.close();
    }
}
