import java.util.ArrayList;

// Course class representing a course
class Course {
    private String courseName;
    private ArrayList<Student> students;

    // Constructor to initialize the course name
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Method to add a student to the course
    public void enrollStudent(Student student) {
        students.add(student);
    }

    // Method to display enrolled students for the course
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Enrolled Students:");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }

    // Getter for course name
    public String getCourseName() {
        return courseName;
    }
}

// Student class representing a student
class Student {
    private String name;
    private ArrayList<Course> courses;

    // Constructor to initialize student name
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Method to enroll in a course
    public void enrollInCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this); // Enroll the student in the course
    }

    // Method to display the student's enrolled courses
    public void displayStudentCourses() {
        System.out.println(name + " is enrolled in the following courses:");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }

    // Getter for student name
    public String getName() {
        return name;
    }
}

// School class representing a school
class School {
    private String schoolName;
    private ArrayList<Student> students;

    // Constructor to initialize the school name
    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    // Method to add a student to the school
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to display all students in the school
    public void displaySchoolStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}

public class SchoolAndCourses {
    public static void main(String[] args) {
        // Create a school object
        School school = new School("Greenwood High");

        // Create student objects
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");
        Student student3 = new Student("Charlie");

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        // Create course objects
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");
        Course course3 = new Course("History");

        // Enroll students in courses
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course2);
        student2.enrollInCourse(course3);
        student3.enrollInCourse(course1);

        // Display students in the school
        school.displaySchoolStudents();

        // Display courses for each student
        student1.displayStudentCourses();
        student2.displayStudentCourses();
        student3.displayStudentCourses();

        // Display enrolled students in each course
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        course3.displayCourseDetails();
    }
}
