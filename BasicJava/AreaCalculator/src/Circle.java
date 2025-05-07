import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        double radius;
        double result;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The Radius Of Circle: ");
        radius = input.nextDouble();
        result = 3.1416 * radius * radius;
        System.out.println("Area of Circle = " + result);
        input.close();
    }
}