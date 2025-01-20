// Create a class Product to show product details
class Product {

    // Create instance variables productName and price to store product details
    String productName;
    double price;

    // Class variable to keep track of the total number of products created
    public static int totalProducts = 0;

    // Parameterized constructor to initialize product details
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment total products created
    }

    // Instance method to display the details of a product
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println();
    }

    // Class method to display the total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}

// Create a class ProductInventory to utilize the Product class
public class ProductInventory {

    public static void main(String[] args) {

        // Create an object of Product class for a Laptop
        Product product1 = new Product("Laptop", 50000.0);

        // Create another object of Product class for Mobiles
        Product product2 = new Product("Mobile Phone", 15000.0);

        // Call the method using product1 object to display details
        product1.displayProductDetails();

        // Call the method using product2 object to display details
        product2.displayProductDetails();

        // Call the method to display the total number of products created
        Product.displayTotalProducts();
    }
}
