#include <stdio.h>


void printArray(int a[], size_t length);

int main()
{
    int arr[5];
    for (size_t i = 0; i < 5; i++)
    {
        printf("%d|", arr[i]);
    }
    printf("\n");

    int x;
    printf("sizeof(x)=%d\n", sizeof(x));

    char c;
    printf("sizeof(c)=%d\n", sizeof(c));

    size_t length = sizeof(arr) / sizeof(int);
    printf("length of arr=%d\n", length);
    

    printf("Address check: %d\n", arr);
    printArray(arr, length);

    
    return 0;
}


void printArray(int a[], size_t length){
    printf("Address check: %d\n", a);
    printf("Printed from function: ");
    for (size_t i = 0; i < length; i++)
    {
        printf("%d|", a[i]);
    }
    printf("\n");
}