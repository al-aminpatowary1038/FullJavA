import java.util.Scanner;

public class Reverse1 {
    public static void main(String[] args) {
        int num, sum = 0;
        int r;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        num = input.nextInt();
        int temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }
        System.out.println("Reverse Number= " + sum);
        input.close();
    }

}
