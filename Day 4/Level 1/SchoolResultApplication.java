//Create a class Subject to indicate the subject
class Subject {
    // Create instance variable name and marks to store value
    public String name;
    public int marks;

    // Parameterized constructor to initialize values
    public Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

// Class Student to indicate the students details
class Student {
    // Create a static variable to count the subject
    public static int subjectCount;

    // Create instance variable studentName to store name of the student
    public String studentName;

    // Create an array of reference
    public Subject[] subjects;

    // Parameterized constructor to initialize values
    public Student(String name, int maxSubjects) {
        this.studentName = name;
        this.subjects = new Subject[maxSubjects];
        this.subjectCount = 0;
    }

    // Create a method to add subject
    public void addSubject(Subject subject) {
        if (subjectCount < subjects.length) {
            subjects[subjectCount] = subject;
            subjectCount++;
        } else {
            System.out.println("Cannot add more subjects. Maximum limit reached.");
        }
    }

    // Create a method getAverageMarks to get the average marks
    public double getAverageMarks() {
        // Create a variable totalMarks and initialize it with 0
        double totalMarks = 0;
        for (int i = 0; i < subjectCount; i++) {
            totalMarks += subjects[i].marks;
        }
        return (double) totalMarks / subjectCount;
    }
}

// Create a GradeCalculator class to find the grade
class GradeCalculator {
    // Create a method calculateGrade to calculate the grade
    public char calculateGrade(Student student) {

        double percentage = student.getAverageMarks();

        if (percentage >= 85) {
            return 'A';
        } else if (percentage >= 70 && percentage < 85) {
            return 'B';
        } else if (percentage >= 55 && percentage < 70) {
            return 'C';
        } else if (percentage >= 35 && percentage < 55) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

// Create a class SchoolResultApplication to access the Student, Subject and
// gradeCalculator class
public class SchoolResultApplication {
    public static void main(String[] args) {
        // Create object of Subject class maths and science
        Subject maths = new Subject("Maths", 90);
        Subject science = new Subject("Science", 85);

        // Create an object of Student class
        Student student = new Student("John", 5);

        // Call the method to Add subjects to the student
        student.addSubject(maths);
        student.addSubject(science);

        // Create a GradeCalculator class object
        GradeCalculator getGrade = new GradeCalculator();

        // Create a variable grade and call amethod
        char grade = getGrade.calculateGrade(student);

        // Print the result
        System.out.println("Average mark of " + student.studentName + " is: " + student.getAverageMarks());
        System.out.println("Grade of  " + student.studentName + "is : " + grade);
    }
}
