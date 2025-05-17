import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number Of row : ");
        a = input.nextInt();
        System.out.print("Enter the number of column: ");
        b = input.nextInt();
        int[][] m = new int[a][b];
        System.out.println(" Enter the elements of matrix: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.printf("M[%d][%d]: ", i, j);
                m[i][j] = input.nextInt();
            }
        }
        System.out.println();
        System.out.print("M = ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print("\t" + m[i][j]);
            }
            System.out.println();
        }

        input.close();
        int sum = 0;
        System.out.println();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i] == m[j]) {
                    sum = sum + m[i][j];
                }
            }
        }
        System.out.print("Sum of Diagonal elements= " + sum);
    }

}
