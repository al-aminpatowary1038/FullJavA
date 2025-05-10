import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        num = input.nextInt();
        int temp = num;
        while (temp != 0) {
            int r = temp % 10;
            temp = temp / 10;
            sum = sum + r;
        }
        System.out.println("Sum = " + sum);
        input.close();
    }

}
