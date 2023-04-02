package URL_Class;

import java.net.*;
import java.util.*;

public class ReadHeaders {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://www.youtube.com");
            URLConnection uc = u.openConnection();
            Map<String, List<String>> map_obj = uc.getHeaderFields();
            System.out.println(map_obj);
            System.out.println(map_obj.get("Permissions-Policy"));
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
