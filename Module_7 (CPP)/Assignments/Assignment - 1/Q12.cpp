#include <iostream>
using namespace std;

class Employee {
    string name;
    int id;
    float salary;

public:
    void initialize(string n, int i, float s) {
        name = n;
        id = i;
        salary = s;
    }

    void display() {
        cout << "Name: " << name << ", ID: " << id << ", Salary: " << salary << endl;
    }
};

int main() {
    Employee e1, e2;
    e1.initialize("Yugandhar", 101, 50000);
    e2.initialize("Gaurav", 102, 60000);

    e1.display();
    e2.display();
    return 0;
}
