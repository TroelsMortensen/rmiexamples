package upperandlower.server;

import upperandlower.server.lowercase.LowerCaseServerImpl;
import upperandlower.server.uppercase.UpperCaseServerImpl;
import upperandlower.shared.LowerCaseServer;
import upperandlower.shared.Server;
import upperandlower.shared.UpperCaseServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServerImpl implements Server {

    public ServerImpl() throws RemoteException {
        UnicastRemoteObject.exportObject(this, 0);
    }

    @Override
    public UpperCaseServer getUpperCaseServer() throws RemoteException {
        return new UpperCaseServerImpl();
    }

    @Override
    public LowerCaseServer getLowerCaseServer() throws RemoteException {
        return new LowerCaseServerImpl();
    }
}
