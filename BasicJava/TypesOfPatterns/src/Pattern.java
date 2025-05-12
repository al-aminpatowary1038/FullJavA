/*
 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3
 1 2
 1 
 */

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int line;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the Column: ");
        line = input.nextInt();
        for (int row = 1; row <= line; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + col);
            }
            System.out.println();
        }

        for (int row = line - 1; row > 0; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + col);
            }
            System.out.println();
        }
        input.close();
    }

}
