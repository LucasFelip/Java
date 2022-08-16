package poo.aplicationPOOestoque.entity;

public class Product {
    public String name;
    public Double price;
    public int quantity;

    public double totalValueStock() {
        return (price * quantity);
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
}
