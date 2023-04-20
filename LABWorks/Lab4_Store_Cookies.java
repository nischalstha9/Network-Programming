// [4] WAP in java to store and read cookies using CookieManager, CookieStore, HTTPcookie.

package LABWorks;

import java.net.*;
import java.util.*;

public class Lab4_Store_Cookies {
    public static void main(String[] args) {
        try {
            CookieManager manager = new CookieManager();
            CookieStore store = manager.getCookieStore();
            HttpCookie cookieA = new HttpCookie("Name", "Nischal Shrestha");
            HttpCookie cookieB = new HttpCookie("Address", "Kathmandu");
            URI uri1 = new URI("abc.com");
            URI uri2 = new URI("def.com");
            store.add(uri1, cookieA);
            store.add(uri2, cookieB);
            List<HttpCookie> list = store.getCookies();
            System.out.println("Store Cookies :" + list);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}