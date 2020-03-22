package upperandlower.client;

import upperandlower.shared.Server;
import upperandlower.shared.UpperCaseServer;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RMIClient {

    private Server server;
    private UpperCaseServer upperCaseServer;

    public RMIClient() {
    }

    public void startClient() throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry("localhost", 1099);
        server = (Server)registry.lookup("Server");
        upperCaseServer = server.getUpperCaseServer();
    }

    public String toUpperCase(String argument) {
        try {
            return upperCaseServer.toUpperCase(argument);
        } catch (RemoteException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not contact server");
        }
    }

    public String toLowerCase(String argument) {
        try {
            return server.getLowerCaseServer().toLowerCase(argument);
        } catch (RemoteException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not contact server");
        }
    }


}
