
import java.util.Scanner;

public class Series2 {
    public static void main(String[] args) {
        int a, b, c, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any initial position of series: ");
        a = input.nextInt();
        System.out.print("Enter any last position of series: ");
        b = input.nextInt();
        System.out.print("Enter difference between two number of series: ");
        c = input.nextInt();

        for (int i = a; i <= b; i = i + c) {
            System.out.print(i + " + ");
            sum = sum + i;
        }
        System.out.println();
        System.out.println("Sum = " + sum);
        input.close();

    }

}
