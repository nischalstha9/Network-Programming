package LABWorks.Lab1;

import java.net.*;
import java.io.*;

public class PrintURLContent {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://guthib.com");
            URLConnection uc = url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
            String line;
            System.out.println("Reading content from url: " + url);
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
