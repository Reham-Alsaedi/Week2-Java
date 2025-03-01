/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

/**
 *
 * @author rehamalsaedi
 */
public class Clothing extends Product {

    private String size;
    private String color;
    private String type;

    public Clothing(int productID, String name, String category, double price, int stockQuantity, String size) {
        super(productID, name, category, price, stockQuantity);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    // Override calculateDiscount() for clothing
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15; // 15% discount on clothing
    }

}
