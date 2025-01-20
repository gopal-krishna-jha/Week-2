// Define a class Product to store and display product details
class Product {

    // Declare variables for product name and price to store product details
    String productName;
    double price;

    // Class variable to track the total number of products created
    public static int totalProducts = 0;

    // Parameterized constructor to initialize product details
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance method to display details of the product
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

// Define a class ProductInventory to demonstrate product usage
public class ProductInventory {

    public static void main(String[] args) {

        // Create a Product instance for "Smart TV"
        Product product1 = new Product("Smart TV", 45000.0);

        // Create another Product instance for "Washing Machine"
        Product product2 = new Product("Washing Machine", 30000.0);

        // Display details of the first product
        product1.displayProductDetails();

        // Display details of the second product
        product2.displayProductDetails();

        // Display the total number of products created
        Product.displayTotalProducts();
    }
}
