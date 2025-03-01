/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rehamalsaedi
 */
//○ Order (OrderID, UserID, List of OrderDetails).
// Order class
class Order {

    private int orderID;
    private int userID;
    private ArrayList<OrderDetails> orderDetailsList;

    // Constructor initializes orderDetailsList as an empty ArrayList
    public Order(int orderID, int userID) {
        this.orderID = orderID;
        this.userID = userID;
        this.orderDetailsList = new ArrayList<>(); // Initialize the list
    }

    // Method to add OrderDetails to the order
    public void addOrderDetail(OrderDetails orderDetail) {
        orderDetailsList.add(orderDetail);
    }

    // Getter methods
    public int getOrderID() {
        return orderID;
    }

    public int getUserID() {
        return userID;
    }

    public ArrayList<OrderDetails> getOrderDetailsList() {
        return orderDetailsList;
    }

    // Method to calculate the total price of the order
    public double calculateTotal() {
        double total = 0;
        for (OrderDetails orderDetail : orderDetailsList) {
            total += orderDetail.getSubTotal();
        }
        return total;
    }
}
