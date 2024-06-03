#include <stdio.h>


// Notice! rows & cols must be defined before the 2D-array parameter,
// for the compiler to allocate the memory of the array.
void printIntTable( int rows, int cols, int array[rows][cols]);

int main(){

    int matrix[3][5];   // 2D array, with 3 rows and 5 columns.

    int matrix2[2][3] = {   {1,2,3},
                            {4,5,6} };

    int matrix3[3][3] = {1,2,3,4,5,6,7,8,9};

    int matrix4[2][3];
    for (size_t i = 0; i < 2; i++)
    {
        for (size_t j = 0; j < 3; j++)
        {
            matrix4[i][j] = i + j;
        }
    }
    
    int rows = sizeof(matrix2)/sizeof(matrix2[0]);  // calculation for number of rows. rows = 24 / 12 = 2
    int cols = sizeof(matrix2[0])/sizeof(int);  // calculation for number of columns. cols = 12 / 4 = 3
    printIntTable(rows, cols, matrix2);

    return 0;
}


void printIntTable( int rows, int cols, int array[rows][cols]){ // rows & cols before array. This is well defined.
    for (size_t i = 0; i < rows; i++)
    {
        for (size_t j = 0; j < cols; j++)
        {
            printf("%d, ", array[i][j]);
        }
        printf("\n");
    }
}
