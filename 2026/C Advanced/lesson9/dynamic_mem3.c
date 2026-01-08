#include <stdio.h>
#include <stdlib.h>

int* createArray(size_t len);

int main()
{
    int* arr = createArray(10);

    // עבודה כלשהי עם המערך שקיבלנו

    free(arr);
    arr = NULL;
}


int* createArray(size_t len){
    int* ptr = (int*) malloc(len * sizeof(int));
    return ptr;
}