#include <stdio.h>

int globalVar = -1;
void changeAddress(const int* tempPtr){ // const-pointer in a function, is totally READ ONLY!
    //*tempPtr = 444;   // invalid
    tempPtr = &globalVar;   // just won't work
}

int main(){
    /* Const Pointers */

    // const on primitives-
    const int A = 6;
    //A = 8;    // illegal

    // const on pointers-
    int temp = 111;
    int other = 222;
    const int *arrPtr;  // READ ONLY pointer

    arrPtr = &temp;  // changing pointer address - valid
    printf("First assignment: arrPtr = %p   *arrPtr = %d\n",arrPtr, *arrPtr);
    arrPtr = &other;  // changing pointer address - valid
    printf("Second assignment: arrPtr = %p   *arrPtr = %d\n",arrPtr, *arrPtr);
    //*arrPtr = 333;  // changing pointed value - illegal

    changeAddress(arrPtr);
    printf("Function assignment: arrPtr = %p   *arrPtr = %d\n",arrPtr, *arrPtr);




    /* Pointers and Arrays */
    int arr[] = {1, 3, 5, 7, 9};
    printf("arr = %p\n", arr);
    printf("&(*arr) = %p\n", &(*arr) );
    // first element-
    printf("arr[0] = %d\n", arr[0]);
    printf("*arr = %d\n", *arr);
    // middle element-
    printf("arr[3] = %d\n", arr[3]);
    printf("*(arr + 3) = v%d\n", *(arr + 3) );
    // all elements-
    int count = sizeof(arr)/sizeof(int);
    for (size_t i = 0; i < count; i++)
    {
        printf("element #%d value=%d in address=%p\n", i, *(arr + i), (arr + i));
    }




    /* Pointers Arithmetic */

    int *middlePtr = arr + 2;   // for general use
    // 1) increment:
    int *incPtr = middlePtr;  // start at middle of array
    incPtr++;   // add 1*sizeof(int) to address
    printf("incPtr = %p   *incPtr = %d\n",incPtr, *incPtr);
    //    decrement:
    int *decPtr = middlePtr;  // start at middle of array
    decPtr--;   // subtract 1*sizeof(int) to address
    printf("incPtr = %p   *incPtr = %d\n",decPtr, *decPtr);

    // 2) addition
    int *addPtr = middlePtr;
    addPtr += 2;   // add 2*sizeof(int) to address
    printf("incPtr = %p   *incPtr = %d\n",addPtr, *addPtr);
    // 3) subtraction
    int *subPtr = middlePtr;
    subPtr -= 2;   // subtract 2*sizeof(int) to address
    printf("incPtr = %p   *incPtr = %d\n",subPtr, *subPtr);

    // 4) subtraction between pointers
    int *higherPtr = middlePtr+1;
    int *lowerPtr = middlePtr-1;
    int res = higherPtr - lowerPtr;   // subtract one address from another
                                    // Notice! result is given in units of sizeof(int)
    printf("There are %d int variables between %p to %p\n", res, lowerPtr, higherPtr);

    // 5) pointers comparison
    int *firstPtr = arr;
    int *secondPtr = &arr[0];
    printf("firstPtr = %p   secondPtr = %p\n",firstPtr, secondPtr);
    if (firstPtr == secondPtr)  // '==' compares between the addresses held in the pointers
    {
        printf("Addresses are equal\n");
    } else {
        printf("Different addresses\n");
    }
    


    

    return 0;
}