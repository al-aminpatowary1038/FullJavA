import java.util.Scanner;

public class MulTable {
    public static void main(String[] args) throws Exception {
        int m, n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial position: ");
        m = input.nextInt();
        System.out.print("Enter last position: ");
        n = input.nextInt();

        for (int i = m; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println();
        }
        input.close();
    }
}
