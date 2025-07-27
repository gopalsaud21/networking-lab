
import java.net.*;
import java.util.*;

public class qn18 {

    public static void main(String[] args) throws Exception {
        CookieManager manager = new CookieManager();
        CookieHandler.setDefault(manager);

        URL url = new URL("http://example.com");
        URLConnection connection = url.openConnection();
        connection.getContent(); // Trigger request

        // Get cookies stored by CookieManager
        List<HttpCookie> cookies = manager.getCookieStore().getCookies();
        System.out.println("Cookies received:");
        for (HttpCookie cookie : cookies) {
            System.out.println(cookie);
        }
    }
}
