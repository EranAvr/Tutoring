#include <stdio.h>


int main(){

    /*
        Arrays in C arr just a row of elements in memory.
        In fact, an array variable is actually a pointer to
        the first element of the array.

        So, we can use an array variable just like a pointer!
    */
    int arr[] = {11, 22, 33, 44, 55};
    printf("address of first element: %p \taddress of array variable: %p\n", arr, &arr);
    printf("first element value %d in address %p\n", arr[0], &arr[0]);
    printf("first element value %d in address %p\n", *arr, arr);
    printf("--------------------\n");
    
    int step = 3;
    printf("element #%d value %d in address %p\n", (step+1), arr[step], &arr[step]);
    printf("element #%d value %d in address %p\n", (step+1), *(arr + step), (arr + step));
    printf("--------------------\n");

    /*
        We can generalize the idea above,
        by iterate over the array with for-loop.
        If the array variable points to the first element,
        then the value of i is the number of steps/jumps we make.
    */
    int count = sizeof(arr)/sizeof(int);
    for (size_t i = 0; i < count; i++)
    {
        printf("element #%d value %d in address %p\n", (i+1), *(arr + i), (arr + i));
    }
    


    return 0;
}