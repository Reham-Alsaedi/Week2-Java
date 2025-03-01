/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

/**
 *
 * @author rehamalsaedi
 */
public class Electronics extends Product {

    private String brand;
    private String model;

    public Electronics(int productID, String name, String category, double price, int stockQuantity, String brand) {
        super(productID, name, category, price, stockQuantity);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    // Override calculateDiscount() for electronics
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.1; // 10% discount on electronics
    }

}
