#include <iostream>
#include <string>
using namespace std;

class Student {
private:
    string name;
    int rollNumber;
    float marks;
    char grade;

public:
    void setName(string n) { name = n; }
    void setRollNumber(int r) { rollNumber = r; }
    void setMarks(float m) { marks = m; }
    string getName() { return name; }
    int getRollNumber() { return rollNumber; }
    float getMarks() { return marks; }
    char getGrade() { return grade; }

    void calculateGrade() {
        if (marks >= 90) grade = 'A';
        else if (marks >= 80) grade = 'B';
        else if (marks >= 70) grade = 'C';
        else if (marks >= 60) grade = 'D';
        else grade = 'F';
    }

    void display() {
        cout << "Name: " << name << ", Roll Number: " << rollNumber
             << ", Marks: " << marks << ", Grade: " << grade << endl;
    }
};

int main() {
    Student s;
    int choice;

    while (true) {
        cout << "\nMenu:\n1. Accept Information\n2. Display Information\n3. Calculate Grade\n4. Exit\nEnter choice: ";
        cin >> choice;

        if (choice == 1) {
            string name;
            int rollNumber;
            float marks;
            cout << "Enter Name: ";
            cin >> name;
            cout << "Enter Roll Number: ";
            cin >> rollNumber;
            cout << "Enter Marks: ";
            cin >> marks;
            s.setName(name);
            s.setRollNumber(rollNumber);
            s.setMarks(marks);
        } else if (choice == 2) {
            s.display();
        } else if (choice == 3) {
            s.calculateGrade();
            cout << "Grade calculated successfully.\n";
        } else if (choice == 4) {
            break;
        } else {
            cout << "Invalid choice!\n";
        }
    }

    return 0;
}
