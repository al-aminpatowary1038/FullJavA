import java.util.Scanner;

public class PalindromeNum1 {
    public static void main(String[] args) {
        int num, temp, r, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check Palindrome or not: ");
        num = input.nextInt();
        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }
        if (sum == num) {
            System.out.println("Palindrome!!");
        } else {
            System.out.println("Not Palindrome!");
        }
        input.close();
    }

}
