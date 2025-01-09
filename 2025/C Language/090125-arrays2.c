#include <stdio.h>

// BAD PRACTICE!
// function does not see size of array.
/*void calcLength(int a[]){
    size_t len = sizeof(a) / sizeof(int);
    printf("len = %d\n", len);
}*/

void printArray(int a[], size_t len){
    for (size_t i = 0; i < len; i++)
    {
        printf("%d, ", a[i]);
    }
    printf("\n");
}


int main(){
    int arr[5] = {1,2,3,4,5};
    //calcLength(arr);

    size_t length = sizeof(arr) / sizeof(int);
    printArray(arr, length);


    // 2D Array:
    int matrix[3][3];
    size_t rows = sizeof(matrix) / sizeof(matrix[0]);
    size_t cols = sizeof(matrix[0]) / sizeof(matrix[0][0]);

    // initialize with for loop:
    for (size_t i = 0; i < rows; i++)
    {
        for (size_t j = 0; j < cols; j++)
        {
            scanf("%d", &matrix[i][j]);
        }
    }
    
    // print with for loop:
    for (size_t i = 0; i < rows; i++)
    {
        for (size_t j = 0; j < cols; j++)
        {
            printf("%d, ", matrix[i][j]);
        }
        printf("\n");
    }
    

    // 2D Array with initializer list:
    int bob[4][4] = {
        {1, 2, 3, 4},
        {10, 20, 30, 40},
        {100, 200, 300, 400},
        {1000, 2000, 3000, 4000}
    };
    size_t bob_rows = sizeof(bob) / sizeof(bob[0]);
    size_t bob_cols = sizeof(bob[0]) / sizeof(bob[0][0]);
    for (size_t i = 0; i < bob_rows; i++)
    {
        for (size_t j = 0; j < bob_cols; j++)
        {
            printf("%d, ", bob[i][j]);
        }
        printf("\n");
    }


    return 0;
}
