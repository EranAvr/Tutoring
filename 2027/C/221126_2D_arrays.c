#include <stdio.h>


void swapCorners(int N, int M, int mat[N][M]);

int main()
{

    int mat[2][3] = {{1,2,3}, {4,5,6}};
    for (size_t i = 0; i < 6; i++)
    {
        printf("2D-matrix at i=%d : %d\n", i, mat[0][i]);
    }
    
    return 0;
}

void swapCorners(int N, int M, int mat[N][M]){
    int temp = mat[0][0];
    mat[0][0] = mat[N-1][M-1];
    mat[N-1][M-1] = temp;

    temp = mat[0][M-1];
    mat[0][M-1] = mat[N-1][0];
    mat[N-1][0] = temp;
}