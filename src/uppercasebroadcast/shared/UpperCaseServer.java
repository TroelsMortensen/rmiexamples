package uppercasebroadcast.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UpperCaseServer extends Remote {
    String toUpperCase(String str, UpperCaseClient client) throws RemoteException;
    void registerClient(UpperCaseClient clientToRegister) throws RemoteException;
}
