#include <iostream>
using namespace std;
int main()
{
  int *wildPtr;
  int a=30;
  wildPtr = &a;
  cout << "Value of a: "<< *wildPtr<< endl;
  return 0;
}
