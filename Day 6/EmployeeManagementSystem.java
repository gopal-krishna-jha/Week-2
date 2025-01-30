
// Interface for department-related operations
interface Department {
    // Method to assign a department to an employee
    void assignDepartment(String departmentName);

    // Method to retrieve details of the assigned department
    String getDepartmentDetails();
}

// Abstract class representing a generic employee
abstract class Employee {
    // Private fields to store essential employee information
    private String employeeId; // Unique identifier for each employee
    private String name; // Employee's full name
    private double baseSalary; // Base salary of the employee

    // Constructor to initialize employee attributes
    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId; // Assign the provided employee ID
        this.name = name; // Assign the provided name
        this.baseSalary = baseSalary; // Assign the base salary
    }

    // Getter method for employee ID
    public String getEmployeeId() {
        return employeeId; // Returns the employee's ID
    }

    // Getter method for employee name
    public String getName() {
        return name; // Returns the employee's name
    }

    // Getter method for base salary
    public double getBaseSalary() {
        return baseSalary; // Returns the employee's base salary
    }

    // Abstract method to calculate the salary, specific to employee type
    public abstract double calculateSalary();

    // Concrete method to display employee details
    public void displayDetails() {
        // Display employee ID, name, and base salary
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}

// Subclass representing full-time employees
class FullTimeEmployee extends Employee implements Department {
    private String departmentName; // Department name to which the employee belongs

    // Constructor to initialize full-time employee attributes
    public FullTimeEmployee(String employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary); // Call the constructor of the parent class
    }

    // Method to calculate the salary for full-time employees
    @Override
    public double calculateSalary() {
        return getBaseSalary(); // For full-time employees, salary is equal to the base salary
    }

    // Method to assign a department to the full-time employee
    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName; // Set the department name for the employee
    }

    // Method to get the details of the assigned department
    @Override
    public String getDepartmentDetails() {
        return "Department: " + departmentName; // Returns the name of the department
    }
}

// Subclass representing part-time employees
class PartTimeEmployee extends Employee implements Department {
    private String departmentName; // Department name to which the employee belongs
    private double hourlyRate; // Hourly wage for the part-time employee
    private int hoursWorked; // Total hours worked in the pay period

    // Constructor to initialize part-time employee attributes
    public PartTimeEmployee(String employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, hourlyRate * hoursWorked); // Calculate base salary based on hourly rate and hours
                                                           // worked
        this.hourlyRate = hourlyRate; // Assign hourly rate
        this.hoursWorked = hoursWorked; // Assign total hours worked
    }

    // Method to calculate the salary for part-time employees
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked; // Salary is calculated based on hourly rate multiplied by total hours worked
    }

    // Method to assign a department to the part-time employee
    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName; // Set the department name for the employee
    }

    // Method to get the details of the assigned department
    @Override
    public String getDepartmentDetails() {
        return "Department: " + departmentName; // Returns the name of the department
    }
}

// Main class to demonstrate the functionality of the Employee Management System
import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create a list to store different types of employees
        List<Employee> employees = new ArrayList<>();

        // Create a full-time employee and assign them to a department
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("FT001", "Alice Smith", 50000);
        fullTimeEmployee.assignDepartment("Human Resources"); // Assign the Human Resources department
        employees.add(fullTimeEmployee); // Add the full-time employee to the list

        // Create a part-time employee and assign them to a department
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("PT001", "Bob Johnson", 20, 25); // 20/hour for 25
                                                                                                  // hours
        partTimeEmployee.assignDepartment("Marketing"); // Assign the Marketing department
        employees.add(partTimeEmployee); // Add the part-time employee to the list

        // Iterate over the list of employees to display their details
        for (Employee employee : employees) {
            employee.displayDetails(); // Display common employee details (ID, name, salary)
            System.out.println("Calculated Salary: " + employee.calculateSalary()); // Calculate and display the
                                                                                    // specific salary
            System.out.println(((Department) employee).getDepartmentDetails()); // Retrieve and display department
                                                                                // details
            System.out.println(); // Add an empty line for better readability between employees
        }
    }
}
