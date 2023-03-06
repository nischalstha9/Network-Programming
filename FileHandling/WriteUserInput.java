// package FileHandling;

// import java.io.FileOutputStream;
// import java.util.Scanner;

// public class WriteUserInput {
//     public static void main(String[] args) {
//         try {
//             FileOutputStream writeFile = null;
//             Scanner sc = new Scanner(System.in);
//             System.out.println("Enter text to write to file:");
//             String input = sc.nextLine();
//             writeFile = new FileOutputStream("C:/Users/sthan/Desktop/java_written.txt");
//             byte writeByte[] = input.getBytes();
//             writeFile.write(writeByte);
//             System.out.println("Data successfully written to new file.");
//             writeFile.close();
//         } catch (Exception e) {
//             System.out.println(e);a
//         }
//     }
// }

package FileHandling;

import java.util.Scanner;

public class WriteUserInput {
    public static void main(String[] args) {
        String path = "C:/Users/sthan/Desktop/java_written.txt";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text to write to file:");
        String input = sc.nextLine();
        try {
            TextOperation.write(input, path);
            System.out.println("Data successfully written to new file.");
        } catch (Exception e) {
            System.out.println("Data Writing Failed");
            System.out.println(e);
        }
    }
}
