package URIMethods;

import java.net.*;

public class UriMethods {
    public static void main(String[] args) {
        String uri_link = "https://user:password@example.com/search?q=dogs#results";
        String uri_link2 = "https://user:password@subdomain.example.com/path/to/page/?category=books&pages_gt=200#section-2";
        try {
            URI uri = URI.create(uri_link);
            URI uri2 = URI.create(uri_link2);
            System.out.println("Full URI = " + uri);
            System.out.println("URI Scheme = " + uri.getScheme());
            System.out.println("URI Authority = " + uri.getAuthority());
            System.out.println("URI Path = " + uri.getPath());
            System.out.println("URI Query = " + uri.getQuery());
            System.out.println("URI Fragment = " + uri.getFragment());
            System.out.println("Parse Server Authority = " + uri.parseServerAuthority());
            System.out.println("normalize() = " + uri.normalize());

            // System.out.println("URI Scheme = "+uri.getScheme());
            // System.out.println("Full URI 2 = " + uri2);

            URI baseURI = new URI("https://example.com/foo/bar.html");
            URI imageURI = new URI("https://example.com/foo/images/logo.png");
            URI relative = baseURI.relativize(imageURI);
            System.out.println("Relative URI = " + relative.toString());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
