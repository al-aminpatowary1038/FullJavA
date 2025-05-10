
import java.util.Scanner;

public class Prime2 {
    public static void main(String[] args) {
        int a;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any positive integer: ");
        a = input.nextInt();
        if (a == 0 || a == 1) {
            System.out.println("Not Prime Number");
        } else {
            for (int i = 2; i < a / 2; i++) {
                if (a % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not Prime Number");
            }
        }
        input.close();
    }

}
