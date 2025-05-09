import java.util.Scanner;

public class MulSeries {
    public static void main(String[] args) {
        int a, b, c, result = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial position of series: ");
        a = input.nextInt();
        System.out.print("Enter the last position of series: ");
        b = input.nextInt();
        System.out.print("Enter the difference between two number  of series: ");
        c = input.nextInt();
        for (int i = a; i <= b; i = i + c) {
            System.out.print(i + " x ");
            result = result * i;
        }
        System.out.println();
        System.out.println("Result = " + result);
        input.close();
    }

}
