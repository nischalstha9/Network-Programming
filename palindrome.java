import java.util.Scanner;

class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text to check:");
        String name = sc.nextLine();
        sc.close();
        String newname = "";
        for (int i = 0; i < name.length(); i++) {
            newname += name.charAt(name.length() - i - 1);
        }
        System.out.println(name);
        System.out.println(newname);

        if (name.equals(newname)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}