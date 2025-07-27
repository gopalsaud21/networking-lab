
import java.net.*;

public class qn25 {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("example.com", 80);
        System.out.println("Local Port: " + socket.getLocalPort());
        System.out.println("Remote Port: " + socket.getPort());
        System.out.println("Remote Address: " + socket.getInetAddress());
        socket.close();
    }
}
