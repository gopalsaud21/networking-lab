
import java.io.*;
import java.net.*;

public class qn29client {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8000);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader userIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number: ");
        out.println(userIn.readLine());
        System.out.println(in.readLine());
        socket.close();
    }
}
