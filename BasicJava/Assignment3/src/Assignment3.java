/*
 * Assignment-3 (User Input)
 * step 1: create a class called Product
 * step 2: create a main method
 * step 3: declare variables: id, title, price, description, category
 * step 4: get user input for each variables
 * step 5: print the variables
 */

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        int id;
        String title;
        double price;
        String description;
        String category;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter product id: ");
        id = input.nextInt();
        input.nextLine(); // consume the newline character
        System.out.print("Enter product title: ");
        title = input.nextLine();
        System.out.print("Enter product price: ");
        price = input.nextDouble();
        input.nextLine(); // consume the newline character
        System.out.print("Enter product description: ");
        description = input.nextLine();
        System.out.print("Enter product category: ");
        category = input.nextLine();
        System.out.println();

        System.out.println("Product ID: " + id);
        System.out.println("Product Title: " + title);
        System.out.println("Product Price: " + price);
        System.out.println("Product Description: " + description);
        System.out.println("Product Category: " + category);
        input.close();
    }
}