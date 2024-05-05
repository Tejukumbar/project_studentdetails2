//student grade
public class Student {
    private String name;
    private String department;
    private int semester;
    private int subject1;
    private int subject2;
    private int subject3;

    public Student(String name, String department, int semester, int subject1, int subject2, int subject3) {
        this.name = name;
        this.department = department;
        this.semester = semester;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    // Compute average marks
    private double computeAverageMarks() {
        return (subject1 + subject2 + subject3) / 3.0;
    }

    // Compute grade
    private char computeGrade() {
        double averageMarks = computeAverageMarks();
        char grade;
        if (averageMarks >= 90) {
            grade = 'S';
        } else if (averageMarks >= 80) {
            grade = 'A';
        } else if (averageMarks >= 65) {
            grade = 'B';
        } else if (averageMarks >= 50) {
            grade = 'C';
        } else if (averageMarks >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

    // Display student information and grade
    public void displayStudentInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Semester: " + semester);
        System.out.println("Average Marks: " + computeAverageMarks());
        System.out.println("Grade: " + computeGrade());
    }

    public static void main(String[] args) {
        // Pass student information as arguments
        Student student = new Student("John Doe", "CS", 5, 85, 92, 78);

        // Display student information and grade
        student.displayStudentInfo();
    }
}
