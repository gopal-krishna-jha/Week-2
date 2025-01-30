import java.util.ArrayList;

// Employee class representing an individual employee
class Employee {
    private String name;
    private String position;

    // Constructor to initialize Employee details
    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    // Display employee details
    public void displayInfo() {
        System.out.println("Employee Name: " + name + ", Position: " + position);
    }
}

// Department class representing a department in the company
class Department {
    private String departmentName;
    private ArrayList<Employee> employees;

    // Constructor to initialize Department and create Employee list
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Method to add an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Display department and employees
    public void displayDepartmentInfo() {
        System.out.println("Department: " + departmentName);
        for (Employee employee : employees) {
            employee.displayInfo();
        }
    }

    // Cleanup method to remove all employees (called when department is removed)
    public void cleanup() {
        employees.clear();
    }
}

// Company class representing the company with multiple departments
class Company {
    private String companyName;
    private ArrayList<Department> departments;

    // Constructor to initialize Company and create Department list
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Method to add a department to the company
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Display company details and all departments
    public void displayCompanyInfo() {
        System.out.println("Company: " + companyName);
        for (Department department : departments) {
            department.displayDepartmentInfo();
        }
    }

    // Cleanup method to remove all departments and employees (called when company
    // is deleted)
    public void cleanup() {
        for (Department department : departments) {
            department.cleanup();
        }
        departments.clear();
    }
}

public class CompanyAndDepartments {
    public static void main(String[] args) {
        // Create a company object
        Company company = new Company("Tech Innovators");

        // Create department objects
        Department department1 = new Department("Engineering");
        Department department2 = new Department("Marketing");

        // Create employee objects
        Employee employee1 = new Employee("Alice", "Software Engineer");
        Employee employee2 = new Employee("Bob", "Senior Software Engineer");
        Employee employee3 = new Employee("Charlie", "Marketing Manager");
        Employee employee4 = new Employee("David", "SEO Specialist");

        // Add employees to departments
        department1.addEmployee(employee1);
        department1.addEmployee(employee2);
        department2.addEmployee(employee3);
        department2.addEmployee(employee4);

        // Add departments to the company
        company.addDepartment(department1);
        company.addDepartment(department2);

        // Display company and all departments with their employees
        company.displayCompanyInfo();

        // Cleanup: Simulating the deletion of the company
        System.out.println("\nSimulating company deletion...\n");
        company.cleanup();

        // Display company details after cleanup (everything should be deleted)
        company.displayCompanyInfo(); // No output expected after cleanup
    }
}
