
import java.io.*;
import javax.net.ssl.*;

public class qn35server {

    public static void main(String[] args) throws Exception {
        System.setProperty("javax.net.ssl.keyStore", "serverkeystore.jks");
        System.setProperty("javax.net.ssl.keyStorePassword", "password");

        SSLServerSocketFactory factory = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();
        SSLServerSocket serverSocket = (SSLServerSocket) factory.createServerSocket(9999);
        SSLSocket socket = (SSLSocket) serverSocket.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println("Received: " + in.readLine());
        socket.close();
    }
}
