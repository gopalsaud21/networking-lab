
import java.io.*;
import java.net.*;

public class qn30server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("Server is waiting for connection...");
        Socket socket = serverSocket.accept();

        FileInputStream fileIn = new FileInputStream("sample.txt");
        OutputStream out = socket.getOutputStream();

        byte[] buffer = new byte[1024];
        int count;
        while ((count = fileIn.read(buffer)) > 0) {
            out.write(buffer, 0, count);
        }

        fileIn.close();
        socket.close();
        serverSocket.close();
        System.out.println("File sent.");
    }
}
