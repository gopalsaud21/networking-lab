
import java.io.*;
import java.net.*;

public class qn26server {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000);
        Socket client = server.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
        String line;
        while ((line = in.readLine()) != null) {
            out.println("Echo: " + line);
        }
        server.close();
    }
}
