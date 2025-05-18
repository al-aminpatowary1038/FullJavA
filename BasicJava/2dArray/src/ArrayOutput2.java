/*
M =     0
        1       2
        3       4       5
        6       7       8       9
        10      11      12      13      14
 */

import java.util.Scanner;

public class ArrayOutput2 {
    public static void main(String[] args) {
        int r;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Row Number: ");
        r = input.nextInt();
        int[][] m = new int[r][];
        for (int i = 0; i < r; i++) {
            m[i] = new int[i + 1];
        }
        int k;
        System.out.print("Enter The Start value of matrix: ");
        k = input.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < i + 1; j++) {
                m[i][j] = k;
                k++;
            }
        }
        System.out.println();
        System.out.print("M = ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("\t" + m[i][j]);
            }
            System.out.println();
        }
        input.close();
    }

}
