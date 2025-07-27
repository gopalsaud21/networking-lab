
import java.io.*;
import java.net.*;

public class qn10 {

    public static void main(String[] args) {
        // URL to download data from
        String url1 = "https://www.google.com"; // You can replace with any URL

        InputStream in = null;
        try {
            // Create a URL object
            URL u = new URL(url1);

            // Open InputStream from the URL
            in = u.openStream();

            // Buffer the input stream for better performance
            in = new BufferedInputStream(in);
            Reader r = new InputStreamReader(in);

            int c;
            // Read each character until end of stream
            while ((c = r.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (MalformedURLException ex) {
            System.err.println(url1 + " is not a parseable URL");
        } catch (IOException ex) {
            System.err.println("I/O error: " + ex);
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    // Ignore closing exception
                }
            }
        }
    }
}
