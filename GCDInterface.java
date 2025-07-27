
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GCDInterface extends Remote {

    int findGCD(int a, int b) throws RemoteException;
}
