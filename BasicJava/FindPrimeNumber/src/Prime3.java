import java.util.Scanner;

public class Prime3 {
    public static void main(String[] args) {
        int m, n, count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Initial Position: ");
        m = input.nextInt();
        System.out.print("Enter The Last Position: ");
        n = input.nextInt();
        System.out.print("Prime Numbers are between " + m + "-" + n + ": ");
        for (int i = m; i <= n; i++) {
            if (i == 0 || i == 1) {
                continue;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {

                    System.out.print(i + " ");
                }
                count = 0;
            }
        }
        input.close();
    }
}
