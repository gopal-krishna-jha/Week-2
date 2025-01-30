import java.util.ArrayList;
import java.util.List;

// Represents a Product in the e-commerce platform
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Get the name of the product
    public String getName() {
        return name;
    }

    // Get the price of the product
    public double getPrice() {
        return price;
    }
}

// Represents a Customer in the e-commerce platform
class Customer {
    private String name;
    private List<Order> orders; // List of orders placed by the customer

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Get the name of the customer
    public String getName() {
        return name;
    }

    // Place an order by the customer
    public void placeOrder(Order order) {
        orders.add(order);
    }

    // Show all orders placed by the customer
    public void showOrders() {
        System.out.println("Orders placed by " + name + ":");
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }
}

// Represents an Order in the e-commerce platform
class Order {
    private int orderId;
    private List<Product> products;
    private static int orderCounter = 1; // Unique order ID generator

    public Order() {
        this.orderId = orderCounter++;
        this.products = new ArrayList<>();
    }

    // Add a product to the order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Display details of the order
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products in this order:");
        for (Product product : products) {
            System.out.println("- " + product.getName() + " ($" + product.getPrice() + ")");
        }
        System.out.println("Total Price: $" + calculateTotalPrice());
    }

    // Calculate the total price of the order
    private double calculateTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}

// Main class to demonstrate the e-commerce platform functionality
public class ECommercePlatform {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Laptop", 1200.00);
        Product product2 = new Product("Headphones", 150.00);
        Product product3 = new Product("Mouse", 25.00);
        Product product4 = new Product("Keyboard", 50.00);

        // Create a customer
        Customer customer = new Customer("Alice");

        // Create the first order and add products
        Order order1 = new Order();
        order1.addProduct(product1);
        order1.addProduct(product2);

        // Create the second order and add products
        Order order2 = new Order();
        order2.addProduct(product3);
        order2.addProduct(product4);

        // Customer places the orders
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // Display all orders placed by the customer
        customer.showOrders();
    }
