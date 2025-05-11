import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The No. of Line You Want: ");
        a = input.nextInt();
        for (int row = a; row > 0; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + col);
            }
            System.out.println();
        }
        input.close();
    }

}
