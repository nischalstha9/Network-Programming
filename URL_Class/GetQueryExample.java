package URL_Class;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class GetQueryExample {
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://youtube.com?id=1&name=xyz#address");
            System.out.println(uri.getScheme());
            System.out.println(uri.getHost());
            System.out.println(uri.getQuery());
            System.out.println(uri.getFragment());
            System.out.println(URI.create("https://youtube.com"));

            System.out.println(URLEncoder.encode("https://youtube.com ?id=1 &name=xyz#address", "UTF-8"));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
