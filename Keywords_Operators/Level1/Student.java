public class Student {
    static String universityName = "Global University";
    static int totalStudents = 0;

    final int rollNumber;
    String name;
    String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", Roll No: " + rollNumber + ", Grade: " + grade);
    }

    public static void main(String[] args) {
        Student s = new Student("Charlie", 10, "A");
        if (s instanceof Student) {
            s.displayDetails();
        }
        displayTotalStudents();
    }
}
