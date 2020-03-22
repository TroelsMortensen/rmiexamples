package upperandlower.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Server extends Remote {
    UpperCaseServer getUpperCaseServer() throws RemoteException;
    LowerCaseServer getLowerCaseServer() throws RemoteException;
}
