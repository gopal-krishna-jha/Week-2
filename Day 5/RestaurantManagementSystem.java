// Define a Persons class to initialize person details and demonstrate hybrid inheritance
class Persons {
    // Declare variables to store the name and id of the person
    private String name;
    private int id;

    // Constructor to initialize person's name and id
    public Persons(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display the person's details
    public void displayDetails() {
        System.out.println("Person name: " + name + "\n" + name + " id is: " + id);
    }

    // Method to return the person's name
    public String getName() {
        return name;
    }
}

// Create a Worker interface to define the common duties for different roles
interface Worker {
    // Method to define the work duties of the person
    void performDuties();
}

// Define a Chef class that inherits from the Persons class and implements the
// Worker interface
class Chef extends Persons implements Worker {

    // Constructor to initialize chef details
    public Chef(String name, int id) {
        // Call the Persons class constructor to initialize name and id
        super(name, id);
    }

    // Implement the performDuties method to display the chef's duties
    public void performDuties() {
        // Call the displayDetails method from the Persons class
        super.displayDetails();
        // Print the specific duty of the chef
        System.out.println(getName() + "'s duty is: Chef");
    }
}

// Define a Waiter class that inherits from the Persons class and implements the
// Worker interface
class Waiter extends Persons implements Worker {

    // Constructor to initialize waiter details
    public Waiter(String name, int id) {
        // Call the Persons class constructor to initialize name and id
        super(name, id);
    }

    // Implement the performDuties method to display the waiter's duties
    public void performDuties() {
        // Call the displayDetails method from the Persons class
        super.displayDetails();
        // Print the specific duty of the waiter
        System.out.println(getName() + "'s duty is: Waiter");
    }
}

// Define the RestaurantManagementSystem class to demonstrate the use of Chef
// and Waiter classes
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        // Create a Chef object and initialize it with chef details
        Chef chef = new Chef("Raj", 7075);

        // Create a Waiter object and initialize it with waiter details
        Waiter waiter = new Waiter("Avinash", 1881);

        // Call the performDuties method for the Chef to display their details and
        // duties
        chef.performDuties();

        System.out.println(); // Add an empty line for separation

        // Call the performDuties method for the Waiter to display their details and
        // duties
        waiter.performDuties();
    }
}
