
import java.io.*;
import java.net.*;

public class qn26client {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);
        BufferedReader userIn = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String userInput;
        while ((userInput = userIn.readLine()) != null) {
            out.println(userInput);
            System.out.println(in.readLine());
        }
        socket.close();
    }
}
