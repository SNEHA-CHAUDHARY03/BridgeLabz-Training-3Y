class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Teacher extends Person {
    String subject;
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    void displayRole() {
        System.out.println("Teacher " + subject);
    }
}
class Student extends Person {
    int grade;
    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }
    void displayRole() {
        System.out.println("Student " + grade);
    }
}
class Staff extends Person {
    String department;
    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }
    void displayRole() {
        System.out.println("Staff " + department);
    }
}
class SchoolSystemRoles {
    public static void main(String[] args) {
        Teacher t = new Teacher("Mr. Smith", 40, "Math");
        Student s = new Student("Alice", 16, 10);
        Staff st = new Staff("Bob", 35, "Admin");
        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}