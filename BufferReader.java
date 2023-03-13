import java.io.*;

public class BufferReader {
    public static void main(String[] args) {
        try {
            File file = new File("java-written.txt");
            FileReader read = new FileReader(file);
            BufferedReader br = new BufferedReader(read);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
