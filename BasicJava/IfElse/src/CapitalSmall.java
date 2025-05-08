import java.util.Scanner;

public class CapitalSmall {
    public static void main(String[] args) {
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        ch = input.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Capital Latter");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Small Latter");
        } else {
            System.out.println("You Enter Wrong Character!");
        }
        input.close();

    }
}
