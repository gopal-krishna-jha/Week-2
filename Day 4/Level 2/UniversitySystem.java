import java.util.*;

// Faculty class
class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Department class
class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// University class
class University {
    private String name;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Add a department
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Display all departments
    public void showDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Department dept : departments) {
            System.out.println("- " + dept.getName());
        }
    }

    // Delete the university and all its departments
    public void deleteUniversity() {
        System.out.println(name + " is being deleted...");
        departments.clear(); // Deletes all associated departments
        System.out.println("All departments are deleted.");
    }
}

// Main class to demonstrate functionality
public class UniversitySystem {
    public static void main(String[] args) {
        // Create faculty members (aggregation)
        Faculty faculty1 = new Faculty("Dr. Smith");
        Faculty faculty2 = new Faculty("Dr. Johnson");

        // Create a university
        University university = new University("Tech University");

        // Create departments (composition)
        Department csDepartment = new Department("Computer Science");
        Department eeDepartment = new Department("Electrical Engineering");

        // Add departments to university
        university.addDepartment(csDepartment);
        university.addDepartment(eeDepartment);

        // Display university departments
        university.showDepartments();

        // Show faculty members are independent
        System.out.println("\nFaculty Members:");
        System.out.println("- " + faculty1.getName());
        System.out.println("- " + faculty2.getName());

        // Delete the university and its departments
        System.out.println("\nDeleting the university...");
        university.deleteUniversity();

        // Show that faculty still exists after university deletion
        System.out.println("\nFaculty Members still exist:");
        System.out.println("- " + faculty1.getName());
        System.out.println("- " + faculty2.getName());
    }
}
