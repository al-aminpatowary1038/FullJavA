import java.util.Scanner;

public class Assignment18 {
    public static void main(String[] args) {
        String[] weekdays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1-7: ");
        a = input.nextInt();
        for (int i = 0; i < weekdays.length; i++) {
            if (i == a - 1) {
                System.out.println(weekdays[i]);
            }
        }
        input.close();
    }

}
