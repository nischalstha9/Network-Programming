import java.net.*;
import java.util.*;

public class RemoteGetHeaderFields implements HeaderFieldsInterface {

    @Override
    public Map<String, List<String>> getHeaders(String url) throws Exception {
        Map<String, List<String>> map_obj;
        URL u = new URL(url);
        URLConnection uc = u.openConnection();
        map_obj = uc.getHeaderFields();
        return map_obj;
    }

}
