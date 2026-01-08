#include <stdio.h>

void printArr(int* arr, size_t len){
    /*for (size_t i = 0; i < len; i++)
    {
        printf("arr[%d] = %d\n", i, arr[i]);
    }*/

    for (int* ptr=arr; ptr < arr+len; ptr++)
    {
        printf("address[%x] = %d\n", ptr, *ptr);
    }
}

void printEdges(int* ptr, size_t len){
    printf("address[%p] = %d\n", ptr, *ptr);
    int* mid = ptr+len/2;
    printf("address[%p] = %d\n", mid, *mid);
    int* last = ptr+len-1;
    printf("address[%p] = %d\n", last, *last);
}

int main(){
    int arr[] = {1, 2, 3, 4, 5};
    size_t length = sizeof(arr) / sizeof(int);

    printArr(arr, length);
    printEdges(arr, length);
}