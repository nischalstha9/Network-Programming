import java.rmi.server.UnicastRemoteObject;

public class RemoteAdder extends UnicastRemoteObject implements AdderInterface {
    // constructor
    RemoteAdder() throws Exception {
    }

    public int add(int x, int y) {
        return x + y;
    }
}
