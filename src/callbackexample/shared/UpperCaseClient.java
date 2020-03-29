package callbackexample.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UpperCaseClient extends Remote {

    void uppercaseResult(String result) throws RemoteException;

}
