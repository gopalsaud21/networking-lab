
import java.net.*;

public class qn31server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("Prime Server running...");

        while (true) {
            Socket socket = serverSocket.accept();
            new Thread(() -> handleClient(socket)).start();
        }
    }

    public static void handleClient(Socket socket) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            int num = Integer.parseInt(in.readLine());
            boolean isPrime = true;
            if (num < 2) {
                isPrime = false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            out.println(num + " is " + (isPrime ? "Prime" : "Not Prime"));
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
