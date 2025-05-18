import java.util.Scanner;

public class UpperLowerTri {

    public static void main(String[] args) {
        int r, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The No. Of Row: ");
        r = input.nextInt();
        System.out.print("Enter The No. of Column: ");
        c = input.nextInt();
        int[][] m = new int[r][c];
        System.out.println("Enter the Elements of Matrix: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.printf("M[%d][%d]: ", i, j);
                m[i][j] = input.nextInt();
            }
            // System.out.println();
        }
        input.close();
        System.out.println();
        System.out.println("Matrix M = ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print("\t" + m[i][j]);

            }
            System.out.println();
        }
        System.out.println();
        int sum = 0;
        System.out.print("Elements of above the diagonal: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i < j) {
                    System.out.print(m[i][j] + " ");
                    sum = sum + m[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Sum  of above the diagonal elements= " + sum);

        System.out.println();
        int sum1 = 0;
        System.out.print("Elements of under the diagonal: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i > j) {
                    System.out.print(m[i][j] + " ");
                    sum1 = sum1 + m[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Sum  of under the diagonal elements= " + sum1);
    }

}
