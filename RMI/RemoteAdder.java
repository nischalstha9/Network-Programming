import java.rmi.server.UnicastRemoteObject;

public class RemoteAdder extends UnicastRemoteObject implements AdderInterface {
    // constructor
    RemoteAdder() throws Exception {
    }

    public int add(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
