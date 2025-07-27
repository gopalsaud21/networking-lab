
import java.net.*;
import java.nio.*;
import java.nio.channels.*;

public class qn37client {

    public static void main(String[] args) throws Exception {
        SocketChannel client = SocketChannel.open(new InetSocketAddress("localhost", 5000));
        String message = "Hello NIO Server!";
        ByteBuffer buffer = ByteBuffer.wrap(message.getBytes());
        client.write(buffer);
        client.close();
    }
}
