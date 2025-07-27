
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class qn15 {

    public static void main(String[] args) {
        try {
            String input = "Java+Programming+%40+2025";
            String decoded = URLDecoder.decode(input, "UTF-8");
            System.out.println("Encoded : " + input);
            System.out.println("Decoded : " + decoded);
        } catch (UnsupportedEncodingException e) {
            System.out.println("UTF-8 decoding not supported.");
        }
    }
}
