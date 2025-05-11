import java.util.Scanner;

public class Assignment16 {
    public static void main(String[] args) {
        String username = "Anis";
        String password = "123456789";
        String usname, pass;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Username: ");
            usname = input.nextLine();
            System.out.print("Enter Password: ");
            pass = input.nextLine();

            if (username.equals(usname) && password.equals(pass)) {
                System.out.println("welcome to the system");
                break;
            } else {
                System.out.println("username/password is incorrect. Please try again");
            }
        }
        input.close();
    }

}
