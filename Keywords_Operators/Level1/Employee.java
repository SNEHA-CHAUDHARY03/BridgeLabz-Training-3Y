public class Employee {
    static String companyName = "Tech Solutions";
    static int totalEmployees = 0;

    final int id;
    String name;
    String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Designation: " + designation);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Bob", 101, "Developer");
        if (emp instanceof Employee) {
            emp.displayDetails();
        }
        displayTotalEmployees();
    }
}
