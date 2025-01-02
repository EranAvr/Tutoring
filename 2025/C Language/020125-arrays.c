#include <stdio.h>




int main(){
    int arr[3];
    for (int i=0; i<3; i++){
        printf("%d\n", arr[i]);
    }

    for (int i=0; i<3; i++){
        arr[i] = 0;
    }

    int arr2[] = {1,2,3,4,5,6,7,8,9};
    int length = sizeof(arr2) / sizeof(arr2[0]);
    for (int i=0; i<length; i++){
        printf("arr2 %d\n", arr2[i]);
    }

    

    return 0;
}

