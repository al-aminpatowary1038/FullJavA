import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        int age;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = input.nextInt();

        if (age >= 18) {
            System.out.println("Valid Voter");
        } else {
            System.out.println("Invalid Voter");
        }
        input.close();
    }

}
