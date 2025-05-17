import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args) {
        int r1, c1, r2, c2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of row for matrix A: ");
        r1 = input.nextInt();
        System.out.print("Enter the number of column for matrix A:  ");
        c1 = input.nextInt();
        int[][] A = new int[r1][c1];
        System.out.println("Enter the elements of  matrix A:  ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.printf("A[%d][%d]: ", i, j);
                A[i][j] = input.nextInt();
            }

        }
        System.out.println();
        System.out.print("Enter the number of row for matrix B: ");
        r2 = input.nextInt();
        System.out.print("Enter the number of column for matrix B:  ");
        c2 = input.nextInt();
        int[][] B = new int[r2][c2];
        System.out.println("Enter the elements of  matrix B:  ");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B.length; j++) {
                System.out.printf("B[%d][%d]: ", i, j);
                B[i][j] = input.nextInt();
            }
            // System.out.println();
        }
        input.close();

        System.out.println();

        System.out.print("A = ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.print("\t" + A[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.print("B = ");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B.length; j++) {
                System.out.print("\t" + B[i][j]);
            }
            System.out.println();
        }

        // Add A & B
        if (r1 == r2 && c1 == c2) {
            System.out.println();
            System.out.print("A+B = ");
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A.length; j++) {
                    System.out.print("\t" + (A[i][j] + B[i][j]));
                }
                System.out.println();
            }
        } else {

            System.out.println("Matrix addition not possible. Dimensions do not match ");
        }

    }

}
