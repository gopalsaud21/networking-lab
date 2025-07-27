
import java.io.*;
import java.net.*;
import java.nio.charset.Charset; // ✅ Add this line

public class qn21 {

    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.facebook.com");
        URLConnection conn = url.openConnection();
        String contentType = conn.getContentType();
        String charset = "UTF-8"; // default

        if (contentType != null && contentType.contains("charset=")) {
            charset = contentType.substring(contentType.indexOf("charset=") + 8);
        }

        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(conn.getInputStream(), Charset.forName(charset)))) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
        }
    }
}
