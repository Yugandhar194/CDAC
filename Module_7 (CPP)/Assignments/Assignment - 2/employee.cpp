#include <iostream>
#include <string>
using namespace std;

class Employee {
private:
    int empID;
    string empName;
    double empSalary;
    double grossSalary;

public:
    void setEmployeeDetails(int id, string name, double salary) {
        empID = id;
        empName = name;
        empSalary = salary;
    }

    void calculateGrossSalary() {
        if (empSalary <= 5000)
            grossSalary = empSalary + (0.1 * empSalary);
        else if (empSalary <= 10000)
            grossSalary = empSalary + (0.15 * empSalary);
        else
            grossSalary = empSalary + (0.2 * empSalary);

        cout << "Gross Salary: " << grossSalary << endl;
    }

    void displayEmployeeDetails() {
        cout << "ID: " << empID << ", Name: " << empName << ", Salary: " << empSalary << ", Gross Salary: " << grossSalary << endl;
    }

    void updateEmployeeDetails(string name, double salary) {
        empName = name;
        empSalary = salary;
        cout << "Details updated successfully \n";
    }
};

int main() {
    Employee emp;
    int choice;

    emp.setEmployeeDetails(101, "Yugandhar", 75000);

    while (true) {
        cout << "\nMenu:\n1. Add/Update Employee\n2. Calculate Gross Salary\n3. Display Employee Details\n4. Exit\nEnter choice: ";
        cin >> choice;

        if (choice == 1) {
            string name;
            double salary;
            cout << "Enter Name: ";
            cin >> name;
            cout << "Enter Salary: ";
            cin >> salary;
            emp.updateEmployeeDetails(name, salary);
        } else if (choice == 2) {
            emp.calculateGrossSalary();
        } else if (choice == 3) {
            emp.displayEmployeeDetails();
        } else if (choice == 4) {
            break;
        } else {
            cout << "Invalid choice!\n";
        }
    }

    return 0;
}
