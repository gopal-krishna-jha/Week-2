import java.util.*;

// Create a class Staff for employee details
public class Staff {
    // Create variables fullName, empId, and empSalary to store details
    String fullName;
    int empId, empSalary;

    // Constructor to initialize the variables
    Staff(String fullName, int empId, int empSalary) {
        this.fullName = fullName;
        this.empId = empId;
        this.empSalary = empSalary;
    }

    // Create a method showDetails to print the details of the employee
    public void showDetails() {
        System.out.println("Staff Details are:");
        System.out.printf("%-10s %-10s %-10s", "Name", "ID", "Salary");
        System.out.printf("\n%-10s %-10d %-10d", fullName, empId, empSalary);
    }
}

// Create a class TestStaff to use the functionality of the Staff class
 class TestStaff {

    public static void main(String[] args) {
        // Create an object of the Staff class
        Staff staffInfo = new Staff("Aman", 101, 500000);

        // Call showDetails method using the object of the class
        staffInfo.showDetails();
    }
}
