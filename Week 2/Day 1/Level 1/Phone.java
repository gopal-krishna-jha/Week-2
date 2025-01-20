import java.util.*;

//Create a class Phone for getting Mobile details
public class Phone {
    // Create variable brand,model and price to store details of Phone
    String brand, model;
    double price;

    // Constructor to initialize the variable
    Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Create a method displayDetails to print the details of Phone
    public void displayDetails() {
        // Print the result
        System.out.println("\nMobile details are: ");
        System.out.println("Phone's brand name is : " + brand + "\nMobile Phone model is: " + model
                + "\nMobile Phone Price is: " + price);
    }
}

// Create a class MobileDetails to use the functionality of Phone class
 class MobileDetails {

    public static void main(String[] args) {
        // Create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // Create a variable brand, model and price take input from user
        System.out.print("Enter Mobile brand name: ");
        String brand = input.nextLine();

        System.out.print("Enter Mobile phone model : ");
        String model = input.nextLine();

        System.out.print("Enter Price of Mobile Phone in rupees: ");
        double price = input.nextDouble();

        // Create an object of Phone class
        Phone getDetails = new Phone(brand, model, price);

        // Call displayDetails method using object of Phone class object
        getDetails.displayDetails();

        input.close();
    }

}
