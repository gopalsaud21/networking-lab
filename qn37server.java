
import java.net.*;
import java.nio.*;
import java.nio.channels.*;

public class qn37server {

    public static void main(String[] args) throws Exception {
        ServerSocketChannel server = ServerSocketChannel.open();
        server.socket().bind(new InetSocketAddress(5000));
        SocketChannel client = server.accept();

        ByteBuffer buffer = ByteBuffer.allocate(256);
        client.read(buffer);
        System.out.println("Received: " + new String(buffer.array()).trim());

        server.close();
    }
}
