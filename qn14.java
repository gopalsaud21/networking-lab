
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class qn14 {

    public static void main(String[] args) {
        try {
            String input = "Java Programming @ 2025";
            String encoded = URLEncoder.encode(input, "UTF-8");
            System.out.println("Original: " + input);
            System.out.println("Encoded : " + encoded);
        } catch (UnsupportedEncodingException e) {
            System.out.println("UTF-8 encoding not supported.");
        }
    }
}
