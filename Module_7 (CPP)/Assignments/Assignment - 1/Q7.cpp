#include <iostream>
using namespace std;

    struct point {
        int x,y;
    };

    int main() {
        point p = {50,100};
        cout << "Point: (" << p.x << ", " << p.y << ")" << endl;
        return 0;
}

//#include <stdio.h>
//struct Point {
//    int x, y;
//};
//
//int main() {
//    struct Point p = {10, 20};
//    printf("Point: (%d, %d)\n", p.x, p.y);
//    return 0;
//}
//
