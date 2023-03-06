package FileHandling;

public class ReadFile {
    public static void main(String[] args) {
        try {
            String path = "C:/Users/sthan/Desktop/java_written.txt";
            String output = TextOperation.read(path);
            System.out.println(output);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}