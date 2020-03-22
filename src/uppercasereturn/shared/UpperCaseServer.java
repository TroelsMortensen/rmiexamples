package uppercasereturn.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UpperCaseServer extends Remote {
    void toUpperCase(String str, UpperCaseClient client) throws RemoteException;
}
