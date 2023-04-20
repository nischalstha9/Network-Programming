package URL_Class;

import java.net.*;
import java.util.*;

public class UCMethods {
    public static Date getReadableDate(long input) {
        return new Date(input);
    }

    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.baeldung.com/java-date-unix-timestamp");
            URLConnection uc = url.openConnection();

            Map<String, List<String>> headers = uc.getHeaderFields();
            String contentType = uc.getContentType();
            String contentEncoding = uc.getContentEncoding();
            int contentLength = uc.getContentLength();
            long date = uc.getDate();
            long lastModified = uc.getLastModified();
            long expiry = uc.getExpiration();

            System.out.println("================== URLConnection Methods ====================");
            System.out.println("Headers => " + headers);
            System.out.println("contentType => " + contentType);
            System.out.println("contentEncoding => " + contentEncoding);
            System.out.println("contentLength => " + contentLength);
            System.out.println("date => " + getReadableDate(date));
            System.out.println("lastModified => " + getReadableDate(lastModified));
            System.out.println("expiry => " + getReadableDate(expiry));
            System.out.println("=============================================================");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
