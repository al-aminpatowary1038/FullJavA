import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        int m, n;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Initial Position: ");
        m = input.nextInt();
        System.out.print("Enter The Last Position: ");
        n = input.nextInt();

        for (int i = m; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum = " + sum);
        input.close();
    }
}
