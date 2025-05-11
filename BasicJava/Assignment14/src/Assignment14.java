
import java.util.Scanner;

public class Assignment14 {
    public static void main(String[] args) {
        int num1, num2, temp, r, sum, count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Start Position to check Palindrome: ");
        num1 = input.nextInt();
        System.out.print("Enter The Last Position to check Palindrome: ");
        num2 = input.nextInt();
        for (int i = num1; i <= num2; i++) {
            temp = i;
            sum = 0;
            while (temp != 0) {
                r = temp % 10;
                sum = sum * 10 + r;
                temp = temp / 10;
            }
            if (i == sum) {
                count++;
                System.out.println(sum);
            }
        }
        System.out.println("Number of Palindrome Between " + num1 + " to " + num2 + " = " + count);
        input.close();
    }
}
