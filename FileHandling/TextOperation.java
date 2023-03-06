package FileHandling;

import java.io.FileOutputStream;
import java.io.FileInputStream;

public class TextOperation {
    public static int write(String text, String path) throws Exception {
        FileOutputStream writeFile = new FileOutputStream(path);
        byte writeByte[] = text.getBytes();
        writeFile.write(writeByte);
        writeFile.close();
        return 0;
    }

    public static String read(String path) throws Exception {
        String s = "";
        FileInputStream readFile = new FileInputStream(path);
        int b;
        while ((b = readFile.read()) != -1) {
            s += (char) b;
        }
        readFile.close();
        return s;
    }
}
