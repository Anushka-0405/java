package Assignment;

import java.util.Scanner;

class Product {
    int id;
    String name;
    double price;

    // Constructor
    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Method to display product details
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Price: " + price);
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        // Input details for 5 products
        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();  // consume newline

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();

            products[i] = new Product(id, name, price);
        }

        // Display all product details
        System.out.println("\nStored Product Information:");
        for (Product p : products) {
            p.display();
        }

        scanner.close();
    }
}

