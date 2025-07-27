
import java.io.*;
import javax.net.ssl.*;

public class qn35client {

    public static void main(String[] args) throws Exception {
        System.setProperty("javax.net.ssl.trustStore", "clienttruststore.jks");
        System.setProperty("javax.net.ssl.trustStorePassword", "password");

        SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        SSLSocket socket = (SSLSocket) factory.createSocket("localhost", 9999);

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println("Hello Secure World");
        socket.close();
    }
}
