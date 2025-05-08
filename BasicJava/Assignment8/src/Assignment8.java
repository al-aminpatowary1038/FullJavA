import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) throws Exception {
        char a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Have you completed your masters?");
        System.out.print("Enter Your Answer [Y/N]: ");
        a = input.next().charAt(0);
        System.out.println("Are you fulent in English?");
        System.out.print("Enter Your Answer [Y/N]: ");
        b = input.next().charAt(0);

        if ((a == 'Y' || a == 'y') && (b == 'Y' || b == 'y')) {
            System.out.println("You are eligible to for the job interview");
        } else {
            System.out.println("Sorry. you are not eligible to for the job interview");
        }
        input.close();
    }
}
