import com.sun.net.httpserver.HttpServer;
import java.io.*;
import java.net.InetSocketAddress;

public class qn34 {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/", exchange -> {
            File file = new File("index.html");
            byte[] response = new byte[(int) file.length()];
            new FileInputStream(file).read(response);

            exchange.sendResponseHeaders(200, response.length);
            OutputStream os = exchange.getResponseBody();
            os.write(response);
            os.close();
        });
        server.setExecutor(null);
        server.start();
        System.out.println("HTTP File Server started at http://localhost:8080/");
    }
}
