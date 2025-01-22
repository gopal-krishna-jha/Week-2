//Create a class InventoryItem to represent product details and manage them
class InventoryItem {
    // Define static and instance variables for discount, product details, and
    // unique ID
    private static int currentDiscount = 10; // Discount rate common to all products
    private String itemName; // Product name
    private double itemPrice; // Product price
    private int itemQuantity; // Quantity of the product
    private final int itemId; // Unique product ID

    // Constructor to initialize product details
    public InventoryItem(String itemName, double itemPrice, int itemQuantity, int itemId) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
        this.itemId = itemId;
    }

    // Static method to update the discount value for all products
    public static void updateDiscount(int newDiscount) {
        currentDiscount = newDiscount;
    }

    // Instance method to display the details of a product
    public void showItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: ₹" + itemPrice);
        System.out.println("Quantity: " + itemQuantity);
        System.out.println("Discount: " + currentDiscount + "%");
    }
}

// Create a class ECommerceSystem to demonstrate the InventoryItem class
public class ECommerceSystem {
    public static void main(String[] args) {
        // Create objects of InventoryItem class with product details
        InventoryItem item1 = new InventoryItem("Laptop", 70000.0, 1, 12546);
        InventoryItem item2 = new InventoryItem("Smartphone", 12000.0, 2, 56040);

        // Check if item1 is an instance of InventoryItem before displaying details
        if (item1 instanceof InventoryItem) {
            // Display details of the first product
            item1.showItemDetails();
            System.out.println(); // New line for better readability

            // Update the discount value for all products
            InventoryItem.updateDiscount(20);

            // Display details of the second product after the discount update
            item2.showItemDetails();
        }
    }
}
