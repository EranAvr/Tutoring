#include <stdio.h>



/*
    Binary number to decimal:
    bin = 1001
    dec = 1*2^3 + 0*2^2 + 0*2^1 + 1*2^0
*/

int globalX;    // bad practice

int main() {
    // Printings:
    printf(" \\ ");
    printf(" \" ");
    printf(" %% ");
    printf("\n");



    printf("global = %d\n", globalX);

    // Int:
    int i1;
    printf("i1 = %d\n", i1);
    int i2 = 12;
    printf("i2 = %d\n", i2);
    printf("i1 = %d, i2 = %d \n", i1, i2, 404);
    printf("Number = %d\n");


    // Char:
    char c1;
    char c2 = 'a';
    char c3 = '\0';   // this will result in \0 (null-character)
    printf("c1 = %c, c2 = %c, c3 = %c\n", c1, c2, c3);
    printf("c1 = %d, c2 = %d, c3 = %d\n", c1, c2, c3);


    // Long:
    long l1;
    long l2 = 1234567890;
    printf("l1 = %d, l2 = %d\n", l1, l2);

    int maxInt = 2147483647 + 1;
    long someLong = 2147483647 + 1;
    printf("maxInt = %d\n", maxInt);
    printf("someLong = %ld\n", someLong);   // stays like 


    // Float:
    float f1;
    float f2 = 3.14;
    printf("f1 = %f, f2 = %f\n", f1, f2);


    // Double:
    double d1;
    double d2 = 1234.5678;
    printf("f1 = %lf, f2 = %lf\n", d1, d2);


    // <stdio.h> data types:
    size_t st = 13974138;
    FILE file;
    fpos_t pos;
}