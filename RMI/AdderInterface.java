import java.rmi.*;

public interface AdderInterface extends Remote {
    public int add(int[] nums) throws Exception;
}
