
import java.net.*;
import java.util.*;

public class qn20 {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://example.com");
        URLConnection connection = url.openConnection();
        connection.connect();

        System.out.println("All Headers:");
        Map<String, List<String>> headerFields = connection.getHeaderFields();
        for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
            String headerName = entry.getKey();
            List<String> headerValues = entry.getValue();

            System.out.println((headerName != null ? headerName : "Status-Line") + ": " + String.join(", ", headerValues));
        }
    }
}
