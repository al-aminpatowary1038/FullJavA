import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The No. of Line You Want: ");
        a = input.nextInt();
        for (int row = a; row > 0; row--) {
            for (int col = row; col > 0; col--) {
                System.out.print(" " + col);
            }
            System.out.println();
        }
        input.close();
    }

}
