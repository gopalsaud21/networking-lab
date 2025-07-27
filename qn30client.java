
import java.io.*;
import java.net.*;

public class qn30client {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9999);
        InputStream in = socket.getInputStream();
        FileOutputStream fileOut = new FileOutputStream("received.txt");

        byte[] buffer = new byte[1024];
        int count;
        while ((count = in.read(buffer)) > 0) {
            fileOut.write(buffer, 0, count);
        }

        fileOut.close();
        socket.close();
        System.out.println("File received.");
    }
}
