class Employee {
    String name;
    int id;
    double salary;
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    void displayDetails() {
        System.out.println(name + " " + id + " " + salary);
    }
}
class Manager extends Employee {
    int teamSize;
    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println(teamSize);
    }
}
class Developer extends Employee {
    String programmingLanguage;
    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println(programmingLanguage);
    }
}
class Intern extends Employee {
    String university;
    Intern(String name, int id, double salary, String university) {
        super(name, id, salary);
        this.university = university;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println(university);
    }
}
class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee m = new Manager("Alice", 1, 90000, 5);
        Employee d = new Developer("Bob", 2, 80000, "Java");
        Employee i = new Intern("Charlie", 3, 20000, "MIT");
        m.displayDetails();
        d.displayDetails();
        i.displayDetails();
    }
}