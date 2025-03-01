/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

/**
 *
 * @author rehamalsaedi
 */
public class OrderDetails {
    //OrderDetails (OrderDetailID, OrderID, ProductID, Quantity, SubTotal).

    private int orderDetailID;
    private int orderID;
    private int productID;
    private int quantity;
    private double subTotal;

    public OrderDetails(int orderDetailID, int orderID, int productID, int quantity, double subTotal) {
        this.orderDetailID = orderDetailID;
        this.orderID = orderID;
        this.productID = productID;
        this.quantity = quantity;
        this.subTotal = subTotal;
    }

    public int getOrderDetailID() {
        return orderDetailID;
    }

    public int getOrderID() {
        return orderID;
    }

    public int getProductID() {
        return productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSubTotal() {
        return subTotal;
    }
}
