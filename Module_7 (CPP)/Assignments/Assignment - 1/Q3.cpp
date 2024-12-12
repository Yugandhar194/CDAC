#include <iostream>
using namespace std;
int main()
{
    int *ptr = NULL;

    if (ptr)
    {
        cout << "Pointer value: " << *ptr << endl;
    }
    else
    {
        cout << "Pointer has value NULL" << endl;
    }
    return 0;
}
