import java.util.*;

// Create a class ShoppingCartItem to compute the item price
public class ShoppingCartItem {
    // Variables to store details of an item
    String productName;
    double productPrice;
    int productQuantity;

    // Constructor to initialize the cart item
    public ShoppingCartItem(String productName, double productPrice, int productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    // Method to add items to the cart
    public void addItems(int quantityToAdd) {
        this.productQuantity += quantityToAdd;
        System.out.println(quantityToAdd + " items added to the cart.");
    }

    // Method to remove items from the cart
    public void removeItems(int quantityToRemove) {
        if (this.productQuantity >= quantityToRemove) {
            this.productQuantity -= quantityToRemove;
            System.out.println(quantityToRemove + " items removed from the cart.");
        } else {
            System.out.println("Insufficient quantity in the cart to remove.");
        }
    }

    // Method to display the total cost
    public void showTotalCost() {
        double totalCost = this.productPrice * this.productQuantity;
        // Print the result
        System.out.println("Total cost for " + this.productName + ": Rs " + totalCost);
    }
}

// Create a class ShoppingCartApp to use the ShoppingCartItem class
 class ShoppingCartApp {
public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take user input for product details
        System.out.print("Enter Product Name: ");
        String productName = input.nextLine();

        System.out.print("Enter Product Price in Rupees: ");
        double productPrice = input.nextDouble();

        System.out.print("Enter Product Quantity: ");
        int productQuantity = input.nextInt();

        // Create an object of ShoppingCartItem class
        ShoppingCartItem cartItem = new ShoppingCartItem(productName, productPrice, productQuantity);

        // Prompt user for an operation
        System.out.print("Enter 1 to Add Items, 2 to Remove Items, 3 to Check Total Price: ");
   
}}