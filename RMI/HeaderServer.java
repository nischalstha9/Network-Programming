import java.rmi.*;

public class HeaderServer {
    public static void main(String args[]) {
        try {
            HeaderFieldsInterface stub = new RemoteGetHeaderFields();
            Naming.rebind("rmi://localhost:1029/nist", stub);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
