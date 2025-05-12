/*
  1
  1 0
  1 0 1
  1 0 1 0
  
  */

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        int line;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of line you want:  ");
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