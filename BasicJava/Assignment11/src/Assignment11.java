import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) {
        int n;
        int fact = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find the factorial: ");
        n = input.nextInt();
        for (int i = n; i > 0; i--) {
            fact = fact * i;
        }
        System.out.println("Factorial = " + fact);
        input.close();
    }

}
