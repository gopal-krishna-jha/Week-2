import java.util.ArrayList;
import java.util.List;

// Represents a Course in the university system
class Course {
    private String courseName;
    private Professor professor; // Professor assigned to the course
    private List<Student> enrolledStudents; // List of students enrolled in the course

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Assign a professor to the course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    // Enroll a student in the course
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }

    // Display course details
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Taught by: " + professor.getName());
        } else {
            System.out.println("No professor assigned.");
        }
        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName());
        }
    }

    // Get the course name
    public String getCourseName() {
        return courseName;
    }
}

// Represents a Student in the university system
class Student {
    private String name;
    private List<Course> courses; // List of courses the student is enrolled in

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Get the name of the student
    public String getName() {
        return name;
    }

    // Enroll the student in a course
    public void enrollCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.enrollStudent(this); // Add the student to the course's list
        }
    }

    // Display the student's enrolled courses
    public void displayCourses() {
        System.out.println(name + " is enrolled in the following courses:");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

// Represents a Professor in the university system
class Professor {
    private String name;
    private List<Course> courses; // List of courses the professor is teaching

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Get the name of the professor
    public String getName() {
        return name;
    }

    // Assign the professor to a course
    public void assignToCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.assignProfessor(this); // Assign the professor to the course
        }
    }

    // Display the courses the professor is teaching
    public void displayCourses() {
        System.out.println(name + " is teaching the following courses:");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

// Main class to demonstrate the university system
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create students
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");

        // Create professors
        Professor p1 = new Professor("Dr. Smith");
        Professor p2 = new Professor("Dr. Johnson");

        // Create courses
        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Computer Science");

        // Assign professors to courses
        p1.assignToCourse(c1); // Dr. Smith teaches Mathematics
        p2.assignToCourse(c2); // Dr. Johnson teaches Computer Science

        // Enroll students in courses
        s1.enrollCourse(c1); // Alice enrolls in Mathematics
        s2.enrollCourse(c1); // Bob enrolls in Mathematics
        s3.enrollCourse(c2); // Charlie enrolls in Computer Science
        s1.enrollCourse(c2); // Alice enrolls in Computer Science

        // Display course details
        System.out.println("University Courses:");
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
        System.out.println();

        // Display student course enrollments
        System.out.println("Student Enrollments:");
        s1.displayCourses();
        s2.displayCourses();
        s3.displayCourses();
        System.out.println();

        // Display professor course assignments
        System.out.println("Professor Assignments:");
        p1.displayCourses();
        p2.displayCourses();
    }
}
