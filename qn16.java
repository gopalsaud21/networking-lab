
import java.io.IOException;
import java.net.*;
import java.util.*;

public class qn16 extends ProxySelector {

    private List<URI> failedURIs = new ArrayList<>();

    @Override
    public List<Proxy> select(URI uri) {
        List<Proxy> proxies = new ArrayList<>();
        if (failedURIs.contains(uri)) {
            System.out.println("Direct connection used for failed URI: " + uri);
            proxies.add(Proxy.NO_PROXY);
        } else {
            SocketAddress addr = new InetSocketAddress("proxy.example.com", 8000);
            Proxy proxy = new Proxy(Proxy.Type.HTTP, addr);
            System.out.println("Using proxy for: " + uri);
            proxies.add(proxy);
        }
        return proxies;
    }

    @Override
    public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
        System.out.println("Connection failed for URI: " + uri);
        failedURIs.add(uri);
    }

    public static void main(String[] args) {
        ProxySelector.setDefault(new qn16());

        try {
            URI testUri = new URI("http://example.com");
            List<Proxy> proxies = ProxySelector.getDefault().select(testUri);
            for (Proxy p : proxies) {
                System.out.println("Proxy: " + p);
            }
        } catch (Exception e) {
            System.out.println("Error handling proxy: " + e.getMessage());
        }
    }
}
