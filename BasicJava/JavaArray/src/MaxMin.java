import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        a = input.nextInt();
        System.out.print("Enter array elements: ");
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max > arr[i]) {
                max = arr[i];
            }
            if (min < arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        input.close();
    }

}
