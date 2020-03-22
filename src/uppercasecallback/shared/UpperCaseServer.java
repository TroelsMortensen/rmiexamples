package uppercasecallback.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UpperCaseServer extends Remote {
    String toUpperCase(String str) throws RemoteException;
}
