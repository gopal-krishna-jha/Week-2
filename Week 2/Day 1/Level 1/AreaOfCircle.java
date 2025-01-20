import java.util.*;

//Create a class Circle to compute the area of circle
 class Circle {
    // Create variable rad to store details
    double rad;

    // Constructor to initialize the variable
    Circle(double radius) {
        this.rad = rad;
    }

    // Create a method calculateArea to find the area of circle
    public double calculateArea() {
        double areaOfCircle = Math.PI * rad * rad;
        return areaOfCircle;
    }

    // Create a method calculateArea to find the circumference of circle
    public double calculateCircumference() {
        double circumference = 2 * Math.PI * rad;
        return circumference;
    }

    // Create a method displayResult to print the area and circumference of circle
    public void displayResult() {
        System.out.println("Area of circle is: " + calculateArea());
        System.out.println("Circumference of Circle is: " + calculateCircumference());
    }
}

// Create a class AreaOfCircle to use the functionality of circle class
public class AreaOfCircle {

    public static void main(String[] args) {
        // Create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // Create a variable rad and take input from user
        System.out.print("Enter rad: ");
        double rad = input.nextDouble();
        // Create an object of Employee class
        Circle getArea = new Circle(rad);

        // Call displayResult method using object of class
        getArea.displayResult();

        input.close();
    }

}
