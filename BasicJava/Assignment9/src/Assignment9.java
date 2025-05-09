
import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {

        int choice;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1-9 to continue the process");
        System.out.println("1. Bangla");
        System.out.println("2. Hindi");
        System.out.println("3. Urdu");
        System.out.println("4-9. English");

        System.out.print("Your choice = ");
        choice = input.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("Selected language is Bengali");
                break;
            }
            case 2: {
                System.out.println("Selected language is Hindi");
                break;
            }
            case 3: {
                System.out.println("Selected language is Urdu");
                break;
            }
            case 4: {
                System.out.println(" Selected language is English");
                break;
            }
            case 5: {
                System.out.println(" Selected language is English");
                break;
            }
            case 6: {
                System.out.println(" Selected language is English");
                break;
            }
            case 7: {
                System.out.println(" Selected language is English");
                break;
            }
            case 8: {
                System.out.println(" Selected language is English");
                break;
            }
            case 9: {
                System.out.println(" Selected language is English");
                break;
            }
            default: {
                System.out.println("Enter a valid Choice");
            }

        }
        input.close();
    }
}
