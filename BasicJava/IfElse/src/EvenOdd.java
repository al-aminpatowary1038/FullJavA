import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive Number: ");
        num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even Number");
        } else if (num % 2 != 0) {
            System.out.println("Odd Number");
        } else {
            System.out.println("Enter a valid positive number");
        }
        input.close();
    }

}
