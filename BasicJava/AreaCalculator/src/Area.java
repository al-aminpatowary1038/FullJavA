import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double height;
        double base;
        double result;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Height of Triangle: ");
        height = input.nextDouble();
        System.out.print("Enter The Base Of Triangle: ");
        base = input.nextDouble();

        result = .5 * base * height;

        System.out.println("Area Of Triangle = " + result);
        input.close();
    }
}