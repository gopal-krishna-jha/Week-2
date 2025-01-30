// Base class Employee
class Employee {
    String name;
    int id;
    double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display details of the employee
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}

// Subclass Manager
class Manager extends Employee {
    int teamSize;

    // Constructor
    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary); // Call the constructor of the superclass (Employee)
        this.teamSize = teamSize;
    }

    // Override displayDetails to include teamSize
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

// Subclass Developer
class Developer extends Employee {
    String programmingLanguage;

    // Constructor
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary); // Call the constructor of the superclass (Employee)
        this.programmingLanguage = programmingLanguage;
    }

    // Override displayDetails to include programmingLanguage
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Subclass Intern
class Intern extends Employee {
    private String university;

    // Constructor
    public Intern(String name, int id, double salary, String university) {
        super(name, id, salary); // Call the constructor of the superclass (Employee)
        this.university = university;
    }

    // Override displayDetails to include university
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("University: " + university);
    }
}

// Main class to test the Employee Management System
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating instances of different types of employees
        Manager manager = new Manager("Ayush", 101, 80000, 10);
        Developer developer = new Developer("Rohan", 102, 70000, "Java");
        Intern intern = new Intern("Mahi", 103, 15000, "TIT University");

        // Displaying the details of each employee
        System.out.println("Manager Details:");
        manager.displayDetails();
        System.out.println();

        System.out.println("Developer Details:");
        developer.displayDetails();
        System.out.println();

        System.out.println("Intern Details:");
        intern.displayDetails();
    }
}
