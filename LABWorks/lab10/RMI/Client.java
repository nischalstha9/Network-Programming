package RMI;

import java.rmi.*;

public class Client {
    public static void main(String[] args) {
        try {
            AdderInterface skeleton = (AdderInterface) Naming.lookup("rmi://localhost:1029/nist");
            System.out.println(skeleton.add(1, 2));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
