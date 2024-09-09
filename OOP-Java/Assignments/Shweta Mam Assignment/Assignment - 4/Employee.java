/*
Design Employee class
i) create instances
ii) create methods
iii) display details of employees 
Eg empid, name, address, salary
*/

class Employee {
    //fields
    private int empId;
    private String name;
    private String city;
    private double salary;
    
    //constructor
    public Employee(int empId, String name, String city, double salary) {
        this.empId = empId;
        this.name = name;
        this.city = city;
        this.salary = salary;
    }
    
    //method to display details
    public void displayDetails() {
        System.out.println("Employee ID: "+empId);
        System.out.println("Enter your name: "+name);
        System.out.println("Enter your city: "+city);
        System.out.println("Enter your package: "+salary);
    }
    //main method
    public static void main (String args[]) {
        Employee emp1 = new Employee(101, "Yugandhar Deshmukh", "Pune, India", 50000);
        Employee emp2 = new Employee(102, "Ajinkya Deshmukh", "Seatte, USA", 60000);
        emp1.displayDetails();
        emp2.displayDetails();
    }
}