
#include <stdio.h>

void printIntArray(int array[], int l);

int main(){

    /*   Declaration:   */

    // int[] arr;   // NOT allowed. (allowed only in java).

    int arr[5]; // declared array, but not initialized. filled with 'garbage values'
    printf("%d\n", arr[0]);


    /*   Initialization:   */

    // 1) Initializer list:
    int initArr1[] = {1, 2, 3, 4, 5};
    int initArr2[3] = {10, 11, 12};

    int initArr3[5] = {100, 200};
    int initArr33[3] = {100, 200, 300, 400, 500, 600};
    
    int initArr4[4];
    //initArr4 = {1,2,3,4};
    

    // 2) Shorten initializer list:
    int zeros[5] = {0};
    int ones[5] = {1};


    // 3) gcc range-initializer-list:
    int gccArr1[6] = {1, 2, 3, [3 ... 4] = 6};
    char gccArr2[10] = {'a', 'b', [2 ... 7] = 'o' , 'y', 'z'};


    // 4) initializer for-loop:
    int initByForArr[5];
    for(size_t i = 0; i < 5 ; i++){
        // better for complex initialization,
        // when we need to make calculations on the value.
        initByForArr[i] = i;
    }


    /*   Length:   */
    int lengthArr[] = {1, 2, 3};
    int length = sizeof(lengthArr) / sizeof(lengthArr[0]);
    printf("length: %d\n", length); // should print 3
    length = sizeof(lengthArr) / sizeof(int);
    printf("length: %d\n", length); // should also print 3


    /*   Passing array-parameter & Printing:   */
    printf("---------------------\n");
    printIntArray(initArr3, sizeof(initArr3) / sizeof(int));
    printIntArray(initArr33, sizeof(initArr33) / sizeof(int));

    printIntArray(zeros, sizeof(zeros) / sizeof(int));
    printIntArray(ones, sizeof(ones) / sizeof(int));

    printIntArray(gccArr1, sizeof(gccArr1) / sizeof(int));
    //printIntArray(gccArr2);



    return 0;
}


/*
void printIntArray(int array[]){
    int length = sizeof(array) / sizeof(int);
    for (size_t i = 0; i < length; i++)
    {
        printf("%d\n", array[i]);
    }
    
}*/
void printIntArray(int array[], int l){
    for (size_t i = 0; i < l; i++)
    {
        printf("%d, ", array[i]);
    }
    printf("\n");
}