import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        int a;
        double n1;
        String ch;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        ch = input.nextLine();

        System.out.print("Enter a number: ");
        a = input.nextInt();
        System.out.print("Enter a double: ");
        n1 = input.nextDouble();
        System.out.println();
        System.out.println("You entered: " + a);
        System.out.println("You entered: " + n1);
        System.out.println("You entered: " + ch);
        input.close();

    }
}
