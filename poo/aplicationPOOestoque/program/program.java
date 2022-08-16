package poo.aplicationPOOestoque.program;

import java.util.Locale;
import java.util.Scanner;

import poo.aplicationPOOestoque.entity.Product;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        // Insert Product
        System.out.println("Enter product data: ");
        System.out.print("Name: "); 
        product.name = sc.nextLine();
        
        System.out.print("Price: "); 
        product.price = sc.nextDouble();
        
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println("\n--- Product ---\nName: " + product.name + "\nPrice: " + product.price + "\nQuantity: " + product.quantity);

        sc.close();
    }
}
