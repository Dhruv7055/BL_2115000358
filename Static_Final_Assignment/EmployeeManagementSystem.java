class Employee {
    private static String companyName = "Tech Corp";
    private static int totalEmployees = 0;
    private final int id;
    private String name, designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 101, "Software Engineer");
        emp1.displayEmployeeDetails();
        Employee.displayTotalEmployees();
    }
}
