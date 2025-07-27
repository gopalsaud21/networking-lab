
import java.io.*;
import java.net.*;

public class qn29server {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8000);
        Socket client = server.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
        int num = Integer.parseInt(in.readLine());
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        out.println("Factorial: " + fact);
        server.close();
    }
}
