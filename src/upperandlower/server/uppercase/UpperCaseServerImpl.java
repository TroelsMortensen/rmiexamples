package upperandlower.server.uppercase;

import upperandlower.shared.UpperCaseServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class UpperCaseServerImpl implements UpperCaseServer {

    public UpperCaseServerImpl() throws RemoteException {
        UnicastRemoteObject.exportObject(this, 0);
    }

    @Override
    public String toUpperCase(String str)  {
        return str.toUpperCase();
    }
}
