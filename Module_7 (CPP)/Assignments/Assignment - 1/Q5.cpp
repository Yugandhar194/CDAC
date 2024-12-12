#include <iostream>
using namespace std;
int main()
{
    int x = 30, y = 40;

    const int *ptr1 = &x;
    int *const ptr2 = &x;
    const int *const ptr3 = &x;

     ptr1 = &y;
    *ptr2 = 30;

    return 0;

}
