#include <stdio.h>


int main()
{
    int x = 10;
    int y = 20;
    int z = 30;

    int* ptr1 = &x;
    int* ptr2 = &y;
    int* ptr3 = &z;
    printf("value: %d in address: %d\n", *ptr1, ptr1);
    printf("value: %d in address: %d\n", *ptr2, ptr2);
    printf("value: %d in address: %d\n", *ptr3, ptr3);
    
    int* ptr = &z;
    printf("value: %d in address: %d\n", *ptr, ptr);
    ptr++;
    printf("value: %d in address: %d\n", *ptr, ptr);
    ptr++;
    printf("value: %d in address: %d\n", *ptr, ptr);



    return 0;
}
