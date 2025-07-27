
import java.net.*;
import java.util.*;

public class qn19 {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://example.com");
        URLConnection connection = url.openConnection();
        connection.connect();

        // Header-specific methods
        System.out.println("Content Type: " + connection.getContentType());
        System.out.println("Content Length: " + connection.getContentLength());
        System.out.println("Date: " + new Date(connection.getDate()));
        System.out.println("Last Modified: " + new Date(connection.getLastModified()));
        System.out.println("Expiration: " + new Date(connection.getExpiration()));
    }
}
