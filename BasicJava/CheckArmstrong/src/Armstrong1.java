import java.util.Scanner;

public class Armstrong1 {
    public static void main(String[] args) {
        int num, temp, sum = 0, r;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Any To Check Armstrong Or Not: ");
        num = input.nextInt();
        temp = num;
        while (temp != 0) {
            r = temp % 10;
            sum = sum + r * r * r;
            temp = temp / 10;
        }
        if (num == sum) {
            System.out.println("Armstrong!!");
        } else {
            System.out.println("Not Armstrong!");
        }
        input.close();
    }
}
