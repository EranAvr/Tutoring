#include <stdio.h>

void printValueOfPtr(int* ptr){
    printf("address = %p, value of ptr = %d\n", ptr, *ptr);
}

void printCharArray(char* ca, size_t length){
    for (size_t i = 0; i < length; i++)
    {
        printf("address = %p, value = %c\n", ca+i, *(ca+i));
    }
}
void printFloatArray(float* fa, size_t length){
    for (size_t i = 0; i < length; i++)
    {
        printf("address = %p, value = %f\n", fa+i, *(fa+i));
    }
}

int main(){

    int arr[] = {1, 2, 3, 4};
    printf("value of arr[0] = %d\n", arr[0]);
    printf("value of *arr = %d\n", *arr);

    printf("address = %p\n", &(arr[0]) );
    printf("address = %p\n", &(*arr) );
    //printf("address = %p\n", &arr );

    printValueOfPtr(arr);
    //printValueOfPtr(6422288);

    int a[] = {10, 20, 30, 40, 50};
    size_t len = sizeof(a) / sizeof(a[0]);

    for (size_t i = 0; i < len; i++)
    {
        printf("a[%d] = %d\n", i, a[i]);
    }
    for (size_t i = 0; i < len; i++){
        printf("ptr=%d, value=%d\n", a+i, *(a+i) );
    }
    

    // Arrays and arithmetic:
    char ch[] = {'a', 'b', 'h', '@', '#', '\n'};
    size_t len2 = sizeof(ch) / sizeof(ch[0]);
    printCharArray(ch, len2);
    //printCharArray(a, len);   // Wrong practice
    
    float fArray[] = {3.14, 2.17, 5.5};
    size_t len3 = sizeof(fArray) / sizeof(fArray[0]);
    printFloatArray(fArray, len3);


    int aa[] = {101, 202, 303, 404, 890};
    size_t aLen = sizeof(aa) / sizeof(aa[0]);
    int* middle_address = aa + aLen / 2;
    printf("middle = %d\n", *(middle_address) );

    // Increment/Decrement:
    printf("increment = %d\n", *(++middle_address) );
    printf("decrement = %d\n", *(--middle_address) );
    // Addition/Subtraction:
    printf("add 2 = %d\n", *(middle_address+2) );
    printf("sub 2 = %d\n", *(middle_address-2) );
    // Comparison:
    int b1[] = {1,2,3};
    int b2[] = {1,2,3};
    printf("b1 == b2 : %d\n", b1 == b2);
    int x = 10;
    int* xPtr1 = &x;
    int* xPtr2 = &x;
    printf("xPtr1 == xPtr2 : %d\n", xPtr1 == xPtr2);


    return 0;
}