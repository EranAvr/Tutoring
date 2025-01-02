#include <stdio.h>




int main(){
    // ex1: print array in reverse-
    int arr1[] = {10,20,30,40,50};
    size_t length = sizeof(arr1) / sizeof(arr1[0]);
    for (int i = length-1; i >= 0; i--){
        printf("arr2[%d] = %d\n", i, arr1[i]);
    }
    
    // ex2: create an array and read values from user-
    int arr2[5];
    size_t length2 = sizeof(arr2) / sizeof(int);
    for (size_t i = 0; i < length2; i++)
    {
        int num;
        scanf("%d", &num);
        arr2[i] = num;

        printf("you entered: %d\n", arr2[i]);
    }
    
    

    return 0;
}

