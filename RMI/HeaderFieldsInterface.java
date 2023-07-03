import java.rmi.*;
import java.util.*;

public interface HeaderFieldsInterface extends Remote {
    public Map<String, List<String>> getHeaders(String url) throws Exception;
}
