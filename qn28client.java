
import java.io.*;
import java.net.*;

public class qn28client {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 7000);
        BufferedReader userIn = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(in.readLine());
        out.println(userIn.readLine());
        socket.close();
    }
}
