import java.util.Scanner;

public class MaxMini {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The First Number: ");
        a = input.nextInt();
        System.out.print("Enter the Second Number: ");
        b = input.nextInt();
        if (a > b) {
            System.out.println("Maximum Number = " + a);
            System.out.println("Minimum Number = " + b);
        } else if (b > a) {
            System.out.println(" Maximum Number = " + b);
            System.out.println(" Minimum Number = " + a);
        } else {
            System.out.println("Those are Equal");
        }
        input.close();
    }

}
