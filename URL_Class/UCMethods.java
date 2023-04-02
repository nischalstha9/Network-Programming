package URL_Class;

import java.net.*;
import java.util.*;

public class UCMethods {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://youtube.com");
            URLConnection uc = url.openConnection();

            Map<String, List<String>> headers = uc.getHeaderFields();
            String contentType = uc.getContentType();
            String contentEncoding = uc.getContentEncoding();
            int contentLength = uc.getContentLength();
            long date = uc.getDate();
            long lastModified = uc.getLastModified();
            long expiry = uc.getExpiration();

            System.out.println("======================================");
            System.out.println("Headers => " + headers);
            System.out.println("contentType => " + contentType);
            System.out.println("contentEncoding => " + contentEncoding);
            System.out.println("contentLength => " + contentLength);
            System.out.println("date => " + date);
            System.out.println("lastModified => " + lastModified);
            System.out.println("expiry => " + expiry);
            System.out.println("======================================");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
