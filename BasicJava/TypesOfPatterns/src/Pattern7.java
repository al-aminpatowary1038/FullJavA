/*
 A
 A B
 A B C
 A B C D 

 */

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        int line;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of line you want: ");
        line = input.nextInt();
        for (int row = 1; row <= line; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + (char) (col + 64)); // convert integer to character
            }
            System.out.println();
        }
        input.close();
    }

}
