
import java.io.*;
import java.net.*;
import java.util.Date;

public class qn27server {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(6000);
        Socket client = server.accept();
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
        out.println(new Date().toString());
        server.close();
    }
}
