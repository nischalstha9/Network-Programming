import FileHandling.TextOperation;

public class ReadFile {
    public static void main(String[] args) {
        try {
            String path = "java-written.txt";
            String output = TextOperation.read(path);
            System.out.println(output);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}