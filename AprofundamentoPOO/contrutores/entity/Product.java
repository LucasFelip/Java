package  AprofundamentoPOO.contrutores.entity;

public class Product {
    private String name;
    private Double price;
    private int quantity;

    // Construtor padrão da classe
    public Product (String name, Double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Construtor de sobrecarga da classe
    public Product (String name, Double price) {
        this.name = name;
        this.price = price;
    }

    // getters e setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // functions
    public double totalValueStock() {
        return (price * quantity);
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name 
            + ", R$ "
            + String.format("%.2f", price) 
            + ", " 
            + quantity 
            + " units, Total: R$ " 
            + String.format("%.2f", totalValueStock());
    }
}
