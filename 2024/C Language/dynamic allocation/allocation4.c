#include <stdio.h>
#include <stdlib.h>


int main() {

    char* myArr = (char*) malloc(2);
    myArr[0] = 'a';
    myArr[1] = 'b';

    myArr[2] = 'c'; // Error! address is out of bounds. This will destroy memory.
    printf("Dynamic array: %p %p %p\n", myArr, (myArr+1), (myArr+2));
    printf("Dynamic array: %c %c %c\n", *myArr, *(myArr+1), *(myArr+2));

    printf("------- Small reallocation ---------\n");

    myArr = (char*) realloc(myArr, 3);
    printf("Dynamic array: %p %p %p\n", myArr, (myArr+1), (myArr+2));
    printf("Dynamic array: %c %c %c\n", *myArr, *(myArr+1), *(myArr+2));


    printf("------- Large reallocation ---------\n");

    myArr = (char*) realloc(myArr, 1000);
    printf("Dynamic array: %p %p %p\n", myArr, (myArr+1), (myArr+2));
    printf("Dynamic array: %c %c %c\n", *myArr, *(myArr+1), *(myArr+2));





    free(myArr);

    return 0;
}