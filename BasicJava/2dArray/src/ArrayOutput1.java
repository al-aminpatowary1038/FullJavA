/*
M =     0       1       2       3       4
        5       6       7       8       9
        10      11      12      13      14
        15      16      17      18      19
 */

import java.util.Scanner;

public class ArrayOutput1 {
    public static void main(String[] args) {
        int r, c, k;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no. row: ");
        r = input.nextInt();
        System.out.print("Enter the no. column: ");
        c = input.nextInt();
        System.out.print("Enter the first value matrix M: ");
        k = input.nextInt();
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = k;
                k++;
            }
        }
        System.out.println();
        input.close();
        System.out.print("M = ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf("\t" + m[i][j]);

            }
            System.out.println();
        }

    }

}
