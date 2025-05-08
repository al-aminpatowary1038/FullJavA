
import java.util.Scanner;

public class positiveNegative {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();
        if (num > 0) {
            System.out.println("You enter a positive number!!");
        } else if (num < 0) {
            System.out.println("You enter a negative number!!");
        } else if (num == 0) {
            System.out.println("You enter zero!!");
        } else {
            System.out.println("You enter somethings else\nPlease enter a number!!");
        }
        input.close();
    }
}
