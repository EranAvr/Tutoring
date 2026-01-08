#include <stdio.h>
#include <stdlib.h>


int main()
{
    // Malloc
    int* ptr = (int*) malloc(sizeof(int));
    *ptr = 10;
    printf("*ptr = %d\n", *ptr);
    free(ptr);
    ptr = NULL;

    int* arrPtr = (int*) malloc(5*sizeof(int));
    *arrPtr = 10;
    for (size_t i = 0; i < 5; i++)
    {
        printf("*arrPtr = %d\n", *(arrPtr+i));
    }
    free(arrPtr);
    arrPtr = NULL;


    // Calloc
    int count = 0;
    scanf("%d", &count);
    int* ids = (int*) calloc(count, sizeof(int));

    for (size_t i = 0; i < count; i++)
    {
        scanf("%d", (ids+i));
    }

    for (size_t i = 0; i < count; i++)
    {
        printf("*arrPtr = %d\n", *(ids+i));
    }
    free(ids);
    ids = NULL;

    return 0;
}
