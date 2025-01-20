import java.util.*;

//Create a class Item for getting Item details
public class Item {
    // Create variable nameOfItem,codeOfItem and price to store details of Item
    String nameOfItem, codeOfItem;
    double price;

    // Constructor to initialize the variable
    Item(String nameOfItem, String codeOfItem, double price) {
        this.nameOfItem = nameOfItem;
        this.codeOfItem = codeOfItem;
        this.price = price;
    }

    // Create a method calculateTotalPrice to calculate the total price
    public double calculateTotalPrice(int quantity) {
        // Return the totalPrice
        return price * quantity;
    }

    // Create a method displayDetails to print the details of Item
    public void displayDetails(double totalPrice, int quantity) {
        // Print the result
        System.out.println("\nItem details are: ");
        System.out.println(
                "Item's nameOfItem is : " + nameOfItem + "\nItem's Code is: " + codeOfItem + "\nItem Price is: "
                        + price);
        System.out.println("The Total price of " + quantity + " Item is " + totalPrice);
    }
}

// Create a class ItemDetails to use the functionality of Item class
class ItemDetails {

    public static void main(String[] args) {
        // Create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // Create a variable nameOfItem, codeOfItem and price take input from user
        System.out.print("Enter Item Name: ");
        String nameOfItem = input.nextLine();

        System.out.print("Enter Item Code: ");
        String codeOfItem = input.next();

        System.out.print("Enter Price of Item in rupees: ");
        double price = input.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = input.nextInt();

        // Create an object of Item class
        Item getDetails = new Item(nameOfItem, codeOfItem, price);

        // Create a variable total price to store the total price
        double totalPrice = getDetails.calculateTotalPrice(quantity);

        // Call displayDetails method using object of Item class
        getDetails.displayDetails(totalPrice, quantity);

        input.close();
    }

}
