#include <stdio.h>

#define PI 3.14159

int main()
{
    int x = 10;
    int y = 20;
    printf("x = %d, y = %d\n", x, y);
    printf("x = %d, y = %d\n", y, x);

    char symbol = 'H';
    printf("symbol = %c ascii = %d\n", symbol, symbol);

    float pi = 3.14;
    printf("pi = %f\n", pi);
    double longPi = 3.14;
    printf("pi = %lf\n", longPi);

    // print macro:
    printf("MACRO PI = %f\n", PI);
    printf("MACRO PI = %d\n", PI);


    // Uninitialized variable
    // DONT DO!!!
    int ui;
    printf("ui = %d\n", ui);

    return 0;
}
