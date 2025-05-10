import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n, fibo;
        int first = 0;
        int second = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many numbers you wants in series: ");
        n = input.nextInt();
        System.out.print(first + " " + second);
        for (int i = 3; i <= n; i++) {
            fibo = first + second;
            first = second;
            second = fibo;
            System.out.print(" " + fibo);
        }
        input.close();
    }
}
