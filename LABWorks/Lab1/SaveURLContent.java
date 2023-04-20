package LABWorks.Lab1;

import java.net.*;
import java.io.*;

public class SaveURLContent {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://guthib.com");
            URLConnection uc = url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
            String line;
            System.out.println("Reading content from url: " + url);
            String path = "content-from-url.txt";
            File file = new File(path);
            FileWriter filewriter = new FileWriter(file);
            while ((line = br.readLine()) != null) {
                filewriter.write(line + "\n");
            }
            filewriter.close();
            System.out.println("Content from url successfully written to: " + path);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
