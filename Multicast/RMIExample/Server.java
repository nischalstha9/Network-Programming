import java.rmi.*;

public class Server {
    public static void main(String args[]) {
        try {
            AdderInterface stub = new RemoteAdder();
            Naming.rebind("rmi://localhost:1029/nist", stub);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
