
import java.net.*;

public class qn23 {

    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.facebook.com");
        URLConnection conn = url.openConnection();
        conn.setConnectTimeout(5000); // 5 sec
        conn.setReadTimeout(5000);
        conn.setRequestProperty("User-Agent", "Mozilla/5.0");
        conn.connect();
        System.out.println("Connection configured and established.");
    }
}
