
import java.net.*;
import java.util.*;

public class qn22 {

    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.google.com");
        URLConnection conn = url.openConnection();
        conn.connect();

        Map<String, List<String>> headers = conn.getHeaderFields();
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
