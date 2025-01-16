#include <stdio.h>

// https://www.w3resource.com/c-programming-exercises/pointer/index.php


void addTwoNumbers(int* a, int* b){
    int sum = *a + *b;
    printf("sum = %d\n", sum);
}

void readValuesIntoArray(int* arr, size_t len){
    for (size_t i = 0; i < len; i++)
    {
        scanf("%d", arr+i);
        //scanf("%d", &arr[i]);
    }
}
void printIntArray(int* a, size_t length){
    for (size_t i = 0; i < length; i++)
    {
        printf("address = %p, value = %d\n", a+i, *(a+i));
    }
}

int main(){
    // ex5:
    // Write C function that accepts two int-pointers,
    // and print their sum to the screen.
    int x = 10;
    int y = 11;
    addTwoNumbers(&x, &y);


    // ex:
    // Write C function that accepts an int-array
    // and read input values from the terminal into the array.
    size_t len = 5;
    int arr[len];
    readValuesIntoArray(arr, len);
    printIntArray(arr, len);
    


    return 0;
}