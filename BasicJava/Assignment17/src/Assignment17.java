/*
 1
 1 0
 1 0 1
 1 0 1 0

 */

import java.util.Scanner;

public class Assignment17 {
    public static void main(String[] args) {
        int line;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number Of Line You Want: ");
        line = input.nextInt();
        for (int row = 1; row <= line; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + col % 2);
            }
            System.out.println();
        }
        input.close();
    }
}
