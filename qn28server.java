
import java.io.*;
import java.net.*;

public class qn28server {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(7000);
        Socket client = server.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
        out.println("Send your message:");
        System.out.println("Client says: " + in.readLine());
        server.close();
    }
}
