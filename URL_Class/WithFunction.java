package URL_Class;

import java.net.*;
import java.util.Scanner;
import java.io.*;

class URLUtilities {
    public static String getData(String url_input) throws Exception {
        URL url = new URL(url_input);
        URLConnection uc = url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
        String data = "";
        String line;
        while ((line = br.readLine()) != null) {
            data += line;
        }
        return data;
    }

    public static int writeToFile(String text, String path) throws Exception {
        File file = new File(path);
        FileWriter filewriter = new FileWriter(file);
        filewriter.write(text);
        filewriter.close();
        return 0;
    }

    public static int writeToFileWithOutputStream(String text, String path) throws Exception {
        FileOutputStream writeFile = new FileOutputStream(path);
        byte writeByte[] = text.getBytes();
        writeFile.write(writeByte);
        writeFile.close();
        return 0;
    }
}

public class WithFunction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter URL you want to scrape:");
        try {
            String user_url_input = sc.nextLine();
            String content = URLUtilities.getData(user_url_input);
            if (URLUtilities.writeToFile(content, "index.html") == 0) {
                System.out.println("Data successfully written to file.");
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            sc.close();
        }
    }
}
