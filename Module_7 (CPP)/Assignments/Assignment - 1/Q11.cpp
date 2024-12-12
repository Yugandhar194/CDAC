#include <iostream>
using namespace std;

class Example {
public:
    int publicVar;

private:
    int privateVar;

protected:
    int protectedVar;

public:
    Example() {
        publicVar = 10;
        privateVar = 20;
        protectedVar = 30;
    }

    void display() {
        cout << "Public: " << publicVar << ", Private: " << privateVar << ", Protected: " << protectedVar << endl;
    }
};

int main() {
    Example ex;
    ex.display();
    ex.publicVar = 15;
    // ex.privateVar = 25;
    // ex.protectedVar = 35;
    return 0;
}
