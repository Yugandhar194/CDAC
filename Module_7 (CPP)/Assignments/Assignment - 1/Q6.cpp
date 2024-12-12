#include <iostream>
using namespace std;

int main() {
    const int a = 10;
    const int *ptr = &a;

    int *newPtr = const_cast <int *> (ptr);
    *newPtr = 20; // Modifying const value (undefined behavior)

    cout << "Value of a: " << a << endl;
    cout << "Modified value: " << *newPtr << endl;

    return 0;
}
