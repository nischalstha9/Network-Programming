package URL_Class;

import java.net.*;

public class WebCache {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://youtube.com");
            URLConnection uc = url.openConnection();
            uc.setDoInput(true);// allows uc.getInputStream
            uc.setDoInput(false);// restricts uc.getInputStream
            uc.setDoOutput(true);// allows uc.getOutputStream
            uc.setDoOutput(false);// restricts uc.getOutputStream
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
