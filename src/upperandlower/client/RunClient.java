package upperandlower.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class RunClient {

    public static void main(String[] args) throws RemoteException, NotBoundException {
        RMIClient client = new RMIClient();
        client.startClient();

        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println("Request? >");
            String request = in.nextLine();
            System.out.println("Input >");
            String line = in.nextLine();

            if(line.equalsIgnoreCase("exit")) break;

            try {
                String result;
                if(request.equalsIgnoreCase("lowercase")) {
                    result = client.toLowerCase(line);
                } else if(request.equalsIgnoreCase("uppercase")) {
                    result = client.toUpperCase(line);
                } else {
                    result = "Did not understand request";
                }
                System.out.println("Result > " + result);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
