import java.util.Scanner;

public class foreach {

    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Array size: ");
        a = input.nextInt();
        int[] arr = new int[a];
        System.out.print("Enter array elements: ");
        int i = 0;
        for (int _ : arr) {
            arr[i] = input.nextInt();
            i++;
        }
        int sum = 0;
        for (int y : arr) {
            sum = sum + y;
        }
        System.out.println("Sum of array elements: " + sum);
        input.close();
    }
}