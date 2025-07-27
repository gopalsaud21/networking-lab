
import java.rmi.Naming;

public class client {

    public static void main(String[] args) {
        try {
            GCDInterface stub = (GCDInterface) Naming.lookup("rmi://localhost/gcdService");

            int a = 36, b = 60;
            int result = stub.findGCD(a, b);
            System.out.println("GCD of " + a + " and " + b + " is: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
