
import java.net.URI;

public class qn13 {

    public static void main(String[] args) {
        try {
            URI uri = new URI("https://www.example.com:8080/test/page?query=123#section");
            System.out.println("Scheme: " + uri.getScheme());
            System.out.println("Host: " + uri.getHost());
            System.out.println("Port: " + uri.getPort());
            System.out.println("Path: " + uri.getPath());
            System.out.println("Query: " + uri.getQuery());
            System.out.println("Fragment: " + uri.getFragment());
        } catch (Exception e) {
            System.out.println("Invalid URI");
        }
    }
}
