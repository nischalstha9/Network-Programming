import java.util.Random;
import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {

        Random rand = new Random();

        int random_num = rand.nextInt(100);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any num between 0 - 100");

        int user_num1 = sc.nextInt();
        sc.close();

        System.out.println("Random Num is " + random_num);
        if (user_num1 == random_num) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");

        }

    }

}
