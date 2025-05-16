import java.util.Scanner;

public class M2dArray1 {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        a = input.nextInt();
        System.out.print("Enter the number of column: ");
        b = input.nextInt();
        int[][] mat = new int[a][b];
        System.out.println("Enter Matrix Elements: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.printf("Mat[%d][%d]= ", i, j);
                mat[i][j] = input.nextInt();
            }
        }
        System.out.println();
        System.out.println("Matrix : ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(" " + mat[i][j]);
            }
            System.out.println();
        }
        input.close();
    }

}
