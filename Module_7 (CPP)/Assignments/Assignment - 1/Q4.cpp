#include <iostream>
using namespace std;
int main()
{
 int x=10, y=20;
 //first
    const int *ptr1 = &x;
    ptr1 = &y;

//second
    int *const ptr2 = &x;
    *ptr2 = 15;

//third
    const int *const ptr3 = &x;

    return 0;
}
