
import java.net.URL;

public class qn12 {

    public static void main(String[] args) {
        String[] protocols = {"http", "https", "ftp", "file", "jar"};
        for (String protocol : protocols) {
            try {
                new URL(protocol, "example.com", "");
                System.out.println("Protocol supported: " + protocol);
            } catch (Exception e) {
                System.out.println("Protocol NOT supported: " + protocol);
            }
        }
    }
}
