package URL_Class;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class URLComponents {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            // System.out.println("Enter URL you want to analyze:");
            // String user_url_input = sc.nextLine();
            // sc.close();
            // URL u = new URL(user_url_input);
            URL u = new URL("https://subdomain.google.com/api/v1?search=docker&query=h1#heading");
            System.out.println("u.getProtocol() :- " + u.getProtocol());
            System.out.println("u.getHost() :- " + u.getHost());
            System.out.println("u.getPath() :- " + u.getPath());
            System.out.println("u.getQuery() :- " + u.getQuery());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
