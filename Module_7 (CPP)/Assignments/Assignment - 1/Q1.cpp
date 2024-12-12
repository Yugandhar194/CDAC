#include <iostream>
using namespace std;
int main()
{
    int a=10, b=20;
    int *ptr = &a;

    cout << "Value of a: "<<a<<endl;
    cout << "Value using pointer: "<< *ptr <<endl;

    ptr = &b;

    cout << "Value of b: "<<b<<endl;
    cout << "Value using pointer: "<< *ptr <<endl;

    return 0;
}
