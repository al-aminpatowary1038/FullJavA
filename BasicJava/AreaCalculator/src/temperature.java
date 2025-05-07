import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        int Choice;
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.println();
        System.out.print("Enter Your Choice: ");
        Scanner input = new Scanner(System.in);
        Choice = input.nextInt();

        if (Choice == 1) {
            double cel;
            System.out.print("Enter Temperature in Celsius: ");
            cel = input.nextDouble();
            double fahr = 1.8 * cel + 32;
            System.out.println("Temperature in Fahrenheit: " + fahr + "f");
        } else if (Choice == 2) {
            double fahr;
            System.out.print("Enter Temperature in Fahrenheit: ");
            fahr = input.nextDouble();
            double cel = (5.0 / 9) * (fahr - 32);
            System.out.println("Temperature in Celsius: " + cel + "c");
        } else if (Choice == 3) {
            double cel;
            System.out.print("Enter Temperature in Celsius: ");
            cel = input.nextDouble();
            double kel = cel + 273.15;
            System.out.println("Temperature in Kelvin: " + kel + "k");
        } else if (Choice == 4) {
            double kel;
            System.out.print("Enter Temperature in Kelvin: ");
            kel = input.nextDouble();
            double cel = kel - 273.15;
            System.out.println("Temperature in Celsius: " + cel + "c");
        } else if (Choice == 5) {
            double fahr;
            System.out.print("Enter Temperature in Fahrenheit: ");
            fahr = input.nextDouble();
            double kel = (5.0 / 9) * (fahr - 32) + 273.15;
            System.out.println("Temperature in Kelvin: " + kel + "k");
        } else if (Choice == 6) {
            double kel;
            System.out.print("Enter Temperature in Kelvin: ");
            kel = input.nextDouble();
            double fahr = (9.0 / 5) * (kel - 273.15) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahr + "k");
        } else {
            System.out.println("You Enter Wrong Choice!!");
        }

        input.close();

    }
}