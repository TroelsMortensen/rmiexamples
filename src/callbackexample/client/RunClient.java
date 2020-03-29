package callbackexample.client;

import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.util.Scanner;

public class RunClient {

    public static void main(String[] args) throws RemoteException, NotBoundException {

        System.setProperty("java.security.policy", "all.policy");

        if (System.getSecurityManager() == null)
        {
            System.setSecurityManager(new RMISecurityManager());
        }

        RMIClient client = new RMIClient();
        client.startClient();

        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("Input >");
            String line = in.nextLine();

            if(line.equalsIgnoreCase("exit")) break;

            try {
                client.toUpperCase(line);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
