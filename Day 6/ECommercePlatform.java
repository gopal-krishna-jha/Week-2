
// Interface for taxable products
interface Taxable {
    // Method to calculate the tax on the product
    double calculateTax();

    // Method to get details about the tax applied to the product
    String getTaxDetails();
}

// Abstract class representing a generic product
abstract class Product {
    // Private fields to store essential product information
    private String productId; // Unique identifier for each product
    private String name; // Name of the product
    private double price; // Price of the product

    // Constructor to initialize product attributes
    public Product(String productId, String name, double price) {
        this.productId = productId; // Assign the provided product ID
        this.name = name; // Assign the provided product name
        this.price = price; // Assign the provided product price
    }

    // Getter method for product ID
    public String getProductId() {
        return productId; // Returns the product ID
    }

    // Getter method for product name
    public String getName() {
        return name; // Returns the product name
    }

    // Getter method for product price
    public double getPrice() {
        return price; // Returns the product price
    }

    // Setter method for product price to allow updates
    public void setPrice(double price) {
        this.price = price; // Updates the product price
    }

    // Abstract method to calculate discount specific to the product type
    public abstract double calculateDiscount();

    // Method to calculate the final price after tax and discount
    public double calculateFinalPrice() {
        double discount = calculateDiscount(); // Calculate the discount for the product
        double tax = (this instanceof Taxable) ? ((Taxable) this).calculateTax() : 0; // Calculate tax if applicable
        return price + tax - discount; // Return the final price: price + tax - discount
    }
}

// Concrete class representing electronic products
class Electronics extends Product implements Taxable {
    private double discountRate; // Discount rate specific to electronics
    private double taxRate; // Tax rate for electronics

    // Constructor to initialize electronics product attributes
    public Electronics(String productId, String name, double price, double discountRate, double taxRate) {
        super(productId, name, price); // Call the constructor of the parent class
        this.discountRate = discountRate; // Set the discount rate
        this.taxRate = taxRate; // Set the tax rate
    }

    // Method to calculate the discount for electronics
    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate; // Calculate discount based on discount rate
    }

    // Method to calculate the tax on electronics
    @Override
    public double calculateTax() {
        return getPrice() * taxRate; // Calculate tax based on tax rate
    }

    // Method to get details about the tax applied to electronics
    @Override
    public String getTaxDetails() {
        return "Tax Rate: " + taxRate * 100 + "%"; // Returns the tax rate as a percentage
    }
}

// Concrete class representing clothing products
class Clothing extends Product implements Taxable {
    private double discountRate; // Discount rate specific to clothing
    private double taxRate; // Tax rate for clothing

    // Constructor to initialize clothing product attributes
    public Clothing(String productId, String name, double price, double discountRate, double taxRate) {
        super(productId, name, price); // Call the constructor of the parent class
        this.discountRate = discountRate; // Set the discount rate
        this.taxRate = taxRate; // Set the tax rate
    }

    // Method to calculate the discount for clothing
    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate; // Calculate discount based on discount rate
    }

    // Method to calculate the tax on clothing
    @Override
    public double calculateTax() {
        return getPrice() * taxRate; // Calculate tax based on tax rate
    }

    // Method to get details about the tax applied to clothing
    @Override
    public String getTaxDetails() {
        return "Tax Rate: " + taxRate * 100 + "%"; // Returns the tax rate as a percentage
    }
}

// Concrete class representing grocery products
class Groceries extends Product {
    private double discountRate; // Discount rate specific to groceries

    // Constructor to initialize grocery product attributes
    public Groceries(String productId, String name, double price, double discountRate) {
        super(productId, name, price); // Call the constructor of the parent class
        this.discountRate = discountRate; // Set the discount rate
    }

    // Method to calculate the discount for groceries
    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate; // Calculate discount based on discount rate
    }

    // Groceries are not taxable, so this method is not implemented
}

// Main class to demonstrate the functionality of the E-Commerce Platform
import java.util.ArrayList;
import java.util.List;

public class ECommercePlatform {
    public static void main(String[] args) {
        // Create a list to store various products
        List<Product> products = new ArrayList<>();

        // Create an electronics product and add it to the list
        Electronics laptop = new Electronics("E001", "Laptop", 1000.00, 0.1, 0.15); // 10% discount, 15% tax
        products.add(laptop);

        // Create a clothing product and add it to the list
        Clothing tShirt = new Clothing("C001", "T-Shirt", 20.00, 0.2, 0.05); // 20% discount, 5% tax
        products.add(tShirt);

        // Create a grocery product and add it to the list
        Groceries apple = new Groceries("G001", "Apple", 1.00, 0.1); // 10% discount
        products.add(apple);

        // Iterate over the list of products to calculate and print their final prices
        for (Product product : products) {
            // Display product details
            System.out.println("Product: " + product.getName());
            System.out.println("Final Price: " + product.calculateFinalPrice()); // Calculate and display final price
            if (product instanceof Taxable) { // Check if the product is taxable
                System.out.println(((Taxable) product).getTaxDetails()); // Display tax details if applicable
            }
            System.out.println(); // Add an empty line for better readability between products
        }
    }
}
