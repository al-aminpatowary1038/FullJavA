import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        int[] array2 = new int[5];
        int sum = 0, avg;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Array Elements: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = input.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            sum = sum + array2[i];
        }
        System.out.println("Sum of array elements: " + sum);
        avg = sum / array2.length;
        System.out.println("Average of array elements: " + avg);
        input.close();
    }
}
