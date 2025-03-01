/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

/**
 *
 * @author rehamalsaedi
 */
//○ Product (ProductID, Name, Category, Price, StockQuantity).
public class Product {

    private int productID;
    private String name;
    private String category;
    private double price;
    private int stockQuantity;

    public Product(int productID, String name, String category, double price, int stockQuantity) {
        this.productID = productID;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public int getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    // Polymorphism
    public double calculateDiscount() {
        return 0;
    }

    public void decreaseStock(int quantity) throws OutOfStockException {
        if (quantity > stockQuantity) {
            throw new OutOfStockException("Insufficient stock for product: " + name);
        }
        stockQuantity -= quantity;
    }

}
// Custom Exception for handling out of stock scenarios

class OutOfStockException extends Exception {

    public OutOfStockException(String message) {
        super(message);
    }
}
