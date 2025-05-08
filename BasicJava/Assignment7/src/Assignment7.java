import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.println("Do You Love Java?");
        System.out.print("Enter Your Answer [Y/y]/[N/n] : ");
        ch = input.next().charAt(0);
        if (ch == 'Y' || ch == 'y') {
            System.out.println("You are a java lover");
        } else if (ch == 'N' || ch == 'n') {
            System.out.println("You are not a java lover");
        } else {
            System.out.println("Enter a valid answer!!");
        }
        input.close();
    }

}
