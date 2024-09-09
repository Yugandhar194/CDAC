import java.util.ArrayList;
import java.util.List;

class Employee {
    private static int totalEmployees = 0;  // Static field for employee count
    private static double totalSalaryExpense = 0;  // Static field for total salary expense
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        totalEmployees++;
        totalSalaryExpense += salary;
    }

    // Static methods
    public static int getTotalEmployees() {
        return totalEmployees;
    }

    public static void applyRaise(double percentage) {
        totalSalaryExpense = 0;  // Reset salary expense to recalculate
        for (Employee emp : employeeList) {
            emp.salary += emp.salary * (percentage / 100);
            totalSalaryExpense += emp.salary;
        }
    }

    public static double calculateTotalSalaryExpense() {
        return totalSalaryExpense;
    }

    // Non-static methods
    public void updateSalary(double newSalary) {
        totalSalaryExpense = totalSalaryExpense - this.salary + newSalary;
        this.salary = newSalary;
    }

    @Override
    public String toString() {
        return "Employee[ID=" + empId + ", Name=" + name + ", Salary=" + salary + "]";
    }

    // List of employees
    private static List<Employee> employeeList = new ArrayList<>();

    public static void addEmployee(Employee emp) {
        employeeList.add(emp);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "John Doe", 50000);
        Employee emp2 = new Employee(2, "Jane Smith", 60000);
        Employee.addEmployee(emp1);
        Employee.addEmployee(emp2);

        System.out.println("Total Employees: " + Employee.getTotalEmployees());
        System.out.println("Total Salary Expense: ₹" + Employee.calculateTotalSalaryExpense());

        Employee.applyRaise(10);  // Apply 10% raise to all employees
        System.out.println("Total Salary Expense after raise: ₹" + Employee.calculateTotalSalaryExpense());

        emp1.updateSalary(55000);  // Update salary of employee 1
        System.out.println("Updated Salary Expense: ₹" + Employee.calculateTotalSalaryExpense());

        // Print Employee Details
        System.out.println(emp1);
        System.out.println(emp2);
    }
}
