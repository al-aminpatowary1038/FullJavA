import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        year = input.nextInt();
        if (year % 400 == 0) {
            System.out.println("Leap Year");
        } else if (year % 100 == 0) {
            System.out.println("Not Leap Year");
        } else if (year % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not Leap Year");
        }
        input.close();
    }
}