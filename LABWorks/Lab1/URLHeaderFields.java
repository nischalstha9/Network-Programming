package LABWorks.Lab1;

import java.net.*;
import java.util.*;

public class URLHeaderFields {
    public static void main(String[] args) {

        try {
            URL u = new URL("https://www.youtube.com");
            URLConnection uc = u.openConnection();
            Map<String, List<String>> map_obj = uc.getHeaderFields();
            System.out.println(map_obj);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
