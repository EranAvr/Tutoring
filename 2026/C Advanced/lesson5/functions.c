#include <stdio.h>


void sayHello(){
    printf("Hello World!\n");
}

void multBy2(int a){
    printf("%d * 2 = %d\n", a, a*2);
}

int areEquals(int a, int b){
    /*if (a != b)
    {
        return 0;
    } else {
        return 1;
    }*/
    return a == b;
}

// BAD PRACTICE !!! DONT USE.
size_t lengthOfArr(int arr[]){
    return sizeof(arr);
}

void printArr(int arr[], size_t len){
    for (size_t i = 0; i < len; i++)
    {
        printf("%d ", arr[i]);
    }
}

void printTable(size_t rows, size_t cols, int table[rows][cols]){
    for (size_t i = 0; i < rows; i++)
    {
        for (size_t j = 0; j < cols; j++)
        {
            printf("%d ", table[i][j]);
        }
        printf("\n");
    }
}



int main()
{
    sayHello();

    multBy2(10);

    int a[10] = {1,2,3,4,5,6,7,8,9,10};
    printf("size of a = %d\n", sizeof(a));
    printf("len of a = %d\n", lengthOfArr(a));  // BAD PRACTICE

    size_t len = sizeof(a) / sizeof(int);
    printArr(a, len);


    return 0;
}
