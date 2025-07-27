
import java.io.*;
import java.net.*;

public class qn24 {

    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.java.com");
        URLConnection conn = url.openConnection();

        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(conn.getInputStream()))) {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
        }
    }
}
