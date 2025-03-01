/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author rehamalsaedi
 */
public class Business {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // Create products objects
            Product phone = new Electronics(103, "iPhone 14", "Electronics", 150, 200, "2023");
            Product laptopBag = new Electronics(104, "Laptop Bag", "Accessories", 50, 150, "Black");
            Product jeans = new Clothing(105, "Jeans", "Clothing", 40, 75, "M");
  

            // Create orders
            Order order1 = new Order(1, 123);
            OrderDetails orderDetail1 = new OrderDetails(1, 1, phone.getProductID(), 2, phone.getPrice() * 2);
            OrderDetails orderDetail2 = new OrderDetails(2, 1, jeans.getProductID(), 3, jeans.getPrice() * 3);

            // Add details to the order
            order1.addOrderDetail(orderDetail1);
            order1.addOrderDetail(orderDetail2);

            // Store orders in an ArrayList
            ArrayList<Order> orders = new ArrayList<>();
            orders.add(order1);

            // Use HashMap to store user order history
            Map<Integer, Order> userOrderHistory = new HashMap<>();
            userOrderHistory.put(order1.getUserID(), order1);

            //Calculate total and discount for each product
            System.out.println("Total for Order " + order1.getOrderID() + ": " + order1.calculateTotal());

            for (OrderDetails orderDetail : order1.getOrderDetailsList()) {
                Product product = orderDetail.getProductID() == phone.getProductID() ? phone : jeans;
                double discount = product.calculateDiscount();
                System.out.println("Discount on " + product.getName() + ": " + discount);
            }
            // Try to decrease stock for a product
            phone.decreaseStock(3); //-3
            System.out.println("Updated stock for Laptop: " + phone.getStockQuantity());

            //OutOfStockException
            try {
                jeans.decreaseStock(200); // to buy more than available stock
            } catch (OutOfStockException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }

}
