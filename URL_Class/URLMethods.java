package URL_Class;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class URLMethods {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter URL you want to scrape:");
            String user_url_input = sc.nextLine();
            sc.close();
            URL u = new URL(user_url_input);
            System.out.println(u.getContent());
            System.out.println(u.getFile());
            System.out.println(u.getInputStream());
            System.out.println(u.getProtocol());
            System.out.println(u.getHost());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
