// Create a class Employee to store employee details
class Employee {
    public int employeeID;
    protected String department;
    public double salary;

    // Parameterized Constructor to initialize the employee's details
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Method to get the salary
    public double getSalary() {
        return salary;
    }

    // Method to set the salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to get the department (protected member access example)
    protected String getDepartment() {
        return department;
    }
}

// Create a Subclass Manager
class Manager extends Employee {

    // Parameterized Constructor to initialize the manager's details
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Method to display the manager's details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + getDepartment()); // Accessing protected member
        System.out.println("Salary: $" + getSalary());
    }

    public static void main(String[] args) {
        // Create an object of the Manager class
        Manager manager = new Manager(102, "Human Resources", 85000.0);

        // Call a method to display the manager's details
        manager.displayDetails();

        // Call a method to modify the salary
        manager.setSalary(90000.0);

        // Call a method to display the updated details
        System.out.println("\nUpdated Details:");
        manager.displayDetails();
    }
}
