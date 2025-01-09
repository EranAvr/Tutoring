#include <stdio.h>

void increment(int a){
    printf("&a = %p\n", &a);
    a++;
}

//  BAD PRACTICE. This won't work outside of swap()
void swap(int a, int b){
    int temp = a;
    a = b;
    b = temp;
}

void goodSwap(int* c_ptr, int* d_ptr){
    /*int value1 = *c_ptr;
    printf("value1 = %d\n", value1);
    int value2 = *d_ptr;
    printf("value2 = %d\n", value2);*/
    int temp = *c_ptr;
    *c_ptr = *d_ptr;
    *d_ptr = temp;
}

int main(){
    int x = 10;
    printf("&x = %p\n", &x);
    increment(x);

    printf("x = %d\n", x);

    int A = 1;
    int B = 3;
    swap(A, B);
    printf("A = %d, B = %d\n", A, B);

    // Pointers:
    int* xp = &x;
    int* Ap = &A;
    int* Bptr = &B;

    int* iPtr;
    double* dPtr;

    int C = 10;
    int D = 20;
    goodSwap(&C, &D);


    // summary:
    char c = '@';
    char* cp = &c;
    printf("address is %p with value %c\n", cp, *cp);

    return 0;
}
