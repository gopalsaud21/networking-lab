
import java.io.*;
import java.net.*;

public class qn31client {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8888);
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        System.out.print("Enter number to check prime: ");
        int number = Integer.parseInt(console.readLine());
        out.println(number);
        System.out.println(in.readLine());

        socket.close();
    }
}
