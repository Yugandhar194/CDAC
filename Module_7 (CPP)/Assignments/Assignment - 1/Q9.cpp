#include <iostream>
using namespace std;

struct Student {
    string name;
    int age;
    float marks;
};

int main() {
    Student students[5];

    for (int i = 0; i < 5; i++) {
        cout << "Enter name, age, marks for student " << i + 1 << ": ";
        cin >> students[i].name >> students[i].age >> students[i].marks;
    }

    for (int i = 0; i < 5; i++) {
        cout << "Student " << i + 1 << ": " << students[i].name << ", " << students[i].age << ", " << students[i].marks << endl;
    }

    return 0;
}
