#include <stdio.h>

int main(int argc, char const *argv[])
{
    /* Arrays and Pointers */
    int* p;  // pointer to an int
    int (*arrPtr)[3];    // pointer to an entire array of ints
                                // it has the same address of arr, but different sizeof() value
    int arr[] = {1, 2, 3};   // array variable, which is actually a pointer
                                // to the first element.

    p = arr;
    arrPtr = &arr;

    printf("arr = %p\n", arr);    
    printf("p = %p\n", p);    
    printf("&arr = %p\n", arrPtr);

    printf("sizeof(arr) = %d bytes\n", sizeof(arr));
    printf("sizeof(p) = %d, sizeof(*p) = %d\n", sizeof(p), sizeof(*p));
    printf("sizeof(arrPtr) = %d, sizeof(*arrPtr) = %d\n", sizeof(arrPtr), sizeof(*arrPtr));

    // Traverse an array using a pointer to first element
    int count = sizeof(arr) / sizeof(int);
    for (size_t i = 0; i < count; i++)
    {
        printf("index #%d value %d in address %p\n", i, *(p+i), (p+i));
    }

    // We can use the [] operator on a pointer, too
    for (size_t i = 0; i < count; i++)
    {
        printf("value %d in address %p\n", p[i], &p[i]);
    }


    printf("--------------------------------\n");
    /* Pointers Arithmetic */
    // Key points for understanding pointers arithmetic:
    // 1. in pointers-integers operations, ALWAYS multiply the integer
    //  with sizeof( element_type ).
    // 2. in pointers-pointers operations, 
    int integers[] = {11, 22, 33, 44, 55};
    int N = sizeof(integers) / sizeof(int);
    printf("integers[] address = %p\n", integers);

    // increment/decrement:
    int *incPtr = integers; // incPtr -> 0th element
    incPtr++;// incPtr -> 1th element
    incPtr++;// incPtr -> 2th element
    printf("integers[2] = %d, in address = %p\n", *incPtr, incPtr);
    int *decPtr = incPtr;
    decPtr--;
    printf("integers[1] = %d, in address = %p\n", *decPtr, decPtr);

    // pointers-integers addition:
    int *addPtr = integers + 4;
    printf("integers[4] = %d, in address = %p\n", *addPtr, addPtr);

    // pointers-integers subtraction:
    int *subPtr = addPtr - 4;
    printf("integers[0] = %d, in address = %p\n", *subPtr, subPtr);

    // pointers-pointers subtraction:
    // pointers hold numbers, so subtraction between ptrs
    // return the difference between them.
    // BUT, in <data-type> units. i.e. difference is divided by sizeof(data-type).
    int *lastPtr = integers+4, *middlePtr = integers+2;
    unsigned int diff = lastPtr - middlePtr;
    printf("%p - %p = %lu [int vars] \n", lastPtr, middlePtr, diff);

    // pointers comparison:
    int *firstPtr = integers;
    int *secondPtr = integers+1;
    int *thirdPtr = integers+2;
    printf("%p == %p | res = %d\n", integers, integers, (integers == integers));
    printf("%p != %p | res = %d\n", firstPtr, secondPtr, (firstPtr != secondPtr));
    printf("%p < %p | res = %d\n", firstPtr, secondPtr, (firstPtr < secondPtr));
    printf("%p < %p | res = %d\n", thirdPtr, secondPtr, (thirdPtr < secondPtr));
    printf("%p >= %p | res = %d\n", thirdPtr, secondPtr, (thirdPtr >= secondPtr));

    // traversing using arithmetic:
    for (int* trvPtr = integers; trvPtr < integers+N; trvPtr++)
    {
        printf("%d\n", *trvPtr);
    }
    
    

    return 0;
}
