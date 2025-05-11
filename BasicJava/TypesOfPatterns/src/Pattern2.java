
import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter How Many Line You Want: ");
        a = input.nextInt();
        for (int row = 1; row <= a; row++) {
            for (int col = row; col > 0; col--) {
                System.out.print(" " + col);
            }
            System.out.println();
        }
        input.close();
    }
}
