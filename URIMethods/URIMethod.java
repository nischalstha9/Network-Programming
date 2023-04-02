package URIMethods;

import java.net.*;

public class URIMethod {
    public static void main(String[] args) {
        String uri = "https://www.youtube.com";
        String uriRelative = "language/.../java";
        String query = "https://www.youtube.com?d=searchQyer" + "&address=Ktm";

        try {

            URI uriBase = new URI(uri);
            URI uri2 = uriBase.create(uriRelative);
            System.out.println("");
            System.out.println(uri2.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}