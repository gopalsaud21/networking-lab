
import java.net.*;

public class q11 {

    public static void main(String[] args) {
        String[] sargs = {
            "tel:+1-800-9988-9938",
            "http://www.xml.com/pub/a/2003/09/17/stax.html#id=_hbc"
        };

        for (int i = 0; i < sargs.length; i++) {
            try {
                URI u = new URI(sargs[i]);
                System.out.println("The URI is: " + u);

                if (u.isOpaque()) {
                    // Opaque URI (no hierarchical path)
                    System.out.println("This is an opaque URI.");
                    System.out.println("Scheme: " + u.getScheme());
                    System.out.println("Scheme-specific part: " + u.getSchemeSpecificPart());
                    System.out.println("Fragment ID: " + u.getFragment());
                } else {
                    // Hierarchical URI
                    System.out.println("This is a hierarchical URI.");
                    System.out.println("Scheme: " + u.getScheme());

                    try {
                        // Parse authority components like user info, host, port
                        u = u.parseServerAuthority();
                        System.out.println("User info: " + u.getUserInfo());
                        System.out.println("Host: " + u.getHost());
                        System.out.println("Port: " + u.getPort());
                    } catch (URISyntaxException ex) {
                        // If not parseable into server authority, print authority as-is
                        System.out.println("Authority: " + u.getAuthority());
                    }

                    System.out.println("Path: " + u.getPath());
                    System.out.println("Query string: " + u.getQuery());
                    System.out.println("Fragment ID: " + u.getFragment());
                }
                System.out.println();
            } catch (URISyntaxException ex) {
                System.err.println(sargs[i] + " does not seem to be a valid URI.");
            }
        }
    }
}
