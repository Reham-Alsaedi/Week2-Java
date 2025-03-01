# Week2-Java
Part 2: Java Development Task 4: Implementing Business Logic in Java

Overview

This project simulates a simple e-commerce platform (similar to Amazon) with basic functionalities such as handling products, orders, and applying discounts. It utilizes Object-Oriented Programming (OOP) principles, Java collections, and exception handling to provide a working structure for a web-based shopping system.

- Features:

Product Management
- Defines a Product class with properties: ProductID, Name, Category, Price, and StockQuantity.
 Implements specialized product types by extending the Product class into Electronics and Clothing classes, each with additional properties.
- Order Management
 The Order class holds an OrderID, UserID, and a list of OrderDetails.
 The OrderDetails class includes OrderDetailID, OrderID, ProductID, Quantity, and SubTotal.
- Polymorphism
 The calculateDiscount() method is overridden in Electronics and Clothing to provide different discount calculations for different product types.
- Java Collections
Orders are stored in an ArrayList<Order> to handle the list of placed orders.
A HashMap<Integer, Order> is used to store a user’s order history based on UserID.
- Exception Handling
A custom exception, OutOfStockException, is used to handle cases where there is insufficient stock for a product when placing an order.
Classes and Structure

- Requirements

Java 8 or higher
IDE or text editor (e.g., IntelliJ IDEA, Eclipse, or Visual Studio Code)

- Setup Instructions

- Clone the repository to your local machine.
- Open the project in your preferred IDE.
- Compile and run the Java files.
