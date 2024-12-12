#include <stdio.h>

void swap(int* aPtr, int* bPtr);

int main(){
    int x = 1;
    float f = 3.14;

    // primitives variable sizes:
    printf("%d\n", sizeof(int));
    printf("%d\n", sizeof(float));
    printf("%d\n", sizeof(double));

    /* Pointers Declaration */

    // single pointers-
    int* xPtr;
    float * fPtr;
    // multiple pointers-
    int a, b, c;
    //int* aPtr, bPtr, cPtr;  // will create 1 pointer and 2 variables
    int *aPtr, *bPtr, *cPtr;  // will create 3 pointers

    /* Address Assignment */
    xPtr = &x;
    aPtr = &a; bPtr = &b; cPtr = &c;

    /* Read/Write testing */
    printf("value is: %d in address: %p\n", x, &x);
    printf("value is: %d in address: %p\n", *xPtr, xPtr);
    // x = 100; // variables syntax
    *xPtr = 100;    // pointers syntax
    printf("value is: %d in address: %p\n", x, &x);
    printf("value is: %d in address: %p\n", *xPtr, xPtr);


    /* General pointer for many variables */
    // We can use one pointer, to address different variable,
    // and assign a value to them.
    int* tempPtr;
    tempPtr = &a;
    *tempPtr = 11;
    tempPtr = &b;
    *tempPtr = 22;
    tempPtr = &c;
    *tempPtr = 33;
    printf("a=%d b=%d c=%d\n", a, b, c);

    /* Pass addresses as parameters */
    int m=20, n=1000;
    printf("m=%d and n=%d\n", m, n);
    swap(&m, &n);   // swap() expect addresses, so we use reference-operator '&'.
    printf("m=%d and n=%d\n", m, n);


    return 0;
}

void swap(int* aPtr, int* bPtr){
    // Using pointers, we can create a swap function
    // that replaces values of variables in other functions' memory.
    int temp = *aPtr;
    *aPtr = *bPtr;
    *bPtr = temp;
}
