/*
 1
 1 2
 1 2 3
 1 2 3 4

 */

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Line Number: ");
        a = input.nextInt();
        for (int row = 1; row <= a; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + col);
            }
            System.out.println();
        }
        input.close();
    }
}
