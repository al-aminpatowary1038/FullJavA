/*
 1
 2 2
 3 3 3
 4 4 4 4
 
 */

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        int line;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of line you want: ");
        line = input.nextInt();
        for (int row = 1; row <= line; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + row);
            }
            System.out.println();
        }
        input.close();
    }
}
