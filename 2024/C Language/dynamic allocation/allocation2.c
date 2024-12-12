#include <stdio.h>
#include <stdlib.h>


int main() {
    /* Malloc - Memory Allocation */
    int* intPtr = (int*) malloc(sizeof(int));   // allocate a single variable
    printf("intPtr = %p \t *intPtr = %d\n", intPtr, *intPtr);
    *intPtr = 19;
    printf("intPtr = %p \t *intPtr = %d\n", intPtr, *intPtr);

    size_t N = 3;
    int* intArrPtr = malloc(N * sizeof(int));   // allocate an array
    *intArrPtr = 1;
    *(intArrPtr+1) = 2;
    *(intArrPtr+2) = 3;
    printf("Dynamic array: %d %d %d\n", *intArrPtr, *(intArrPtr+1), *(intArrPtr+2));
    // intArrPtr[1] = *(intArrPtr+1)
    intArrPtr[0] = 11;
    intArrPtr[1] = 12;
    intArrPtr[2] = 13;
    printf("Dynamic array: %d %d %d\n", intArrPtr[0],intArrPtr[1], intArrPtr[2]);


    /* Calloc - Contigious Memory Allocation */
    // The only difference (and advantage) of calloc(),
    // is that value are initialized to 0 (zero).
    size_t M = 5;
    double* flArrPtr = (double*) calloc(M, sizeof(double));
    flArrPtr[0] = 3.14;
    flArrPtr[2] = 2.17;
    for (size_t i = 0; i < M; i++)
    {
        printf("i=%d \t %lf\n", i, flArrPtr[i]);
    }
    

    /* Free - de-allocation */
    // Each single allocation - gets a single de-allocation.
    free(intPtr);
    free(intArrPtr);
    free(flArrPtr);

    return 0;
}