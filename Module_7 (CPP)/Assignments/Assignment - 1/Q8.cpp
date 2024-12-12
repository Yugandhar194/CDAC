#include <iostream>
using namespace std;

struct Student {
    string name;
    int age;

    void initialize(string n, int a) {
        name = n;
        age = a;
    }

    void display() {
        cout << "Name: " << name << ", Age: " << age << endl;
    }
};

int main() {
    Student s;
    s.initialize("Yugandhar", 23);
    s.display();
    return 0;
}
