package URL_Class;

import java.net.*;
import java.io.*;

public class Data_From_URL {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://shrestha-nischal.com.np");
            URLConnection uc = url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}