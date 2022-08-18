package poo.aplicationPOOestoque.program;

import java.util.Locale;
import java.util.Scanner;

import poo.aplicationPOOestoque.entity.Product;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        int quantity;

        // Insert Product
        System.out.println("Enter product data: ");
        System.out.print("Name: "); 
        product.name = sc.nextLine();
        
        System.out.print("Price: "); 
        product.price = sc.nextDouble();
        
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        // Show me product
        System.out.println("\n\nProduct data: " + product);

        // Update quantity product
        System.out.print("\n\nEnter ther number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);

        // Show me product
        System.out.println("\n\nUpdated product data: " + product);

        // Update quantity product
        System.out.print("\n\nEnter ther number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        // Show me product
        System.out.println("\n\nUpdated product data: " + product);
        
        sc.close();
    }
}