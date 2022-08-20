package AprofundamentoPOO.contrutores.program;

import java.util.Locale;
import java.util.Scanner;

import AprofundamentoPOO.contrutores.entity.Product;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String name;
        Double price;
        int quantity, quantityUpdate;
        Product product;

        // Insert Product
        System.out.println("Enter product data: ");
        System.out.print("Name: "); 
        name = sc.nextLine();
        
        System.out.print("Price: "); 
        price = sc.nextDouble();
        
        System.out.print("Quantity in stock: ");
        quantity = sc.nextInt();
        
        product = new Product(name, price, quantity);

        // Show me product
        System.out.println("\n\nProduct data: " + product);

        // Update quantity product
        System.out.print("\n\nEnter ther number of products to be added in stock: ");
        quantityUpdate = sc.nextInt();
        product.addProducts(quantityUpdate);

        // Show me product
        System.out.println("\n\nUpdated product data: " + product);

        // Update quantity product
        System.out.print("\n\nEnter ther number of products to be removed from stock: ");
        quantityUpdate = sc.nextInt();
        product.removeProducts(quantityUpdate);

        // Show me product
        System.out.println("\n\nUpdated product data: " + product);


        System.out.println("\n\n\n\n\n");
        // Insert Product
        System.out.println("Enter product data: ");
        System.out.print("Name: "); 
        name = sc.nextLine();
        
        System.out.print("Price: "); 
        price = sc.nextDouble();

        product = new Product(name, price);

        // Show me product
        System.out.println("\n\nProduct data: " + product);

        // Update quantity product
        System.out.print("\n\nEnter ther number of products to be added in stock: ");
        quantityUpdate = sc.nextInt();
        product.addProducts(quantityUpdate);

        // Show me product
        System.out.println("\n\nUpdated product data: " + product);

        // Update quantity product
        System.out.print("\n\nEnter ther number of products to be removed from stock: ");
        quantityUpdate = sc.nextInt();
        product.removeProducts(quantityUpdate);

        // Show me product
        System.out.println("\n\nUpdated product data: " + product);
        
        sc.close();
    }
}