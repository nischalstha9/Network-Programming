import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;

public class FileReadWriter {
    public static void main(String[] args) {
        // Write
        try {
            FileWriter file = new FileWriter("FileReadWriter.txt");
            file.write("Hello From Nischal!");
            file.close();
            System.out.println("Write File Success");
        } catch (Exception e) {
            System.out.println(e);
        }

        // Read
        try {
            FileReader file = new FileReader("FileReadWriter.txt");
            BufferedReader br = new BufferedReader(file);
            String content = br.readLine();
            System.out.println("Reading From File...");
            System.out.println("Content:");
            System.out.println(content);
            file.close();
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
