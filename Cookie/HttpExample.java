package Cookie;

import java.net.*;
import java.util.*;

public class HttpExample {
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

            store.remove(uri1, cookieA);
            System.out.println("Store Cookies :" + list);
            store.remove(uri1, cookieA);
            store.removeAll();
            System.out.println("Store Cookies :" + list);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}