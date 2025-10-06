package Com.week13.day51;
class Employee {
    String name;
    int id;
    String department;
    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }
    @Override
    public String toString() {
        return "Employee { " +
                "Name = '" + name + '\'' +
                ", ID = " + id +
                ", Department = '" + department + '\'' +
                " }";
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        // Create an employee object
        Employee emp = new Employee("Ankit", 101, "IT");

        // Printing object will call toString()
        System.out.println(emp);
    }
}
