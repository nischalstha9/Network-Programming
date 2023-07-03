import java.rmi.*;

public class HeaderClient {
    public static void main(String[] args) {
        try {
            HeaderFieldsInterface skeleton = (HeaderFieldsInterface) Naming.lookup("rmi://localhost:1029/nist");
            System.out.println(skeleton.getHeaders("http://google.com"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
