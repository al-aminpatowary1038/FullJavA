/*1 + 2 + 3 + 4 + 5 + ..... */

import java.util.Scanner;

public class Series1 {
    public static void main(String[] args) {
        int a, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");
        a = input.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.print(i + " + ");
            sum = sum + i;
        }
        System.out.println("");
        System.out.println("Sum = " + sum);
        input.close();
    }

}
