//Create a class Employee to represent employee details and manage them
class Employee {
    // Define static and instance variables for company and employee details
    private static String companyName = "Capgemini"; // Company name common to all employees
    private String name; // Employee name
    private String designation; // Employee designation
    private final int id; // Unique employee ID
    private static int numberOfEmployee = 0; // Counter for total employees

    // Constructor to initialize employee details
    public Employee(String name, String designation, int id) {
        this.name = name;
        this.designation = designation;
        this.id = id;
        numberOfEmployee++; // Increment employee count
    }

    // Static method to display the company name
    public static void displayCompanyName() {
        System.out.println("Company Name: " + companyName);
    }

    // Instance method to display the details of an employee
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Designation: " + designation);
    }

    // Static method to return the total number of employees
    public static int displayTotalEmployees() {
        return numberOfEmployee;
    }
}

// Create a class EmployeeManagementSystem to demonstrate the Employee class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create objects of Employee class with employee details
        Employee employee1 = new Employee("Ravi", "Software Engineer", 1);
        Employee employee2 = new Employee("Rohan", "Software Developer", 2);

        // Display the company name
        Employee.displayCompanyName();

        // Check if employee1 is an instance of Employee before displaying details
        if (employee1 instanceof Employee) {
            // Display details of the first employee
            employee1.displayDetails();
            System.out.println(); // New line for better readability

            // Display details of the second employee
            employee2.displayDetails();
        }

        // Print the total number of employees
        System.out.println("Total Number of Employees: " + Employee.displayTotalEmployees());
    }
}
