#include <stdio.h>

void printArr(int arr[], size_t len){
    for (size_t i = 0; i < len; i++)
    {
        printf("%d ", arr[i]);
    }
}
void printCharArr(char arr[], size_t len){
    for (size_t i = 0; i < len; i++)
    {
        printf("%c ", arr[i]);
    }
}


void fillArray(int arr[], size_t len){
    for (size_t i = 0; i < len; i++)
    {
        scanf("%d", &arr[i]);
    }
}
void fillCharArray(char arr[], size_t len){
    for (size_t i = 0; i < len; i++)
    {
        scanf(" %c", &arr[i]);  // Note the space BEFORE %c, no newline
        /*
            The space skips any leftover whitespace
            before the character.
            Only %c reads exactly one character.
        */
    }
}

// BAD PRACTICE !!! Wont work.
// This function will return an address,
// BUT- The memory of this address will be erased
// once the function finished.
/*
int* createArray(){
    int arr[5];
    return arr;
}
*/


int main()
{

    /*int a[5];
    size_t len = sizeof(a) / sizeof(int);
    fillArray(a, len);
    printArr(a, len);*/

    char b[5];
    size_t len2 = sizeof(b) / sizeof(char);
    fillCharArray(b, len2);
    printCharArr(b, len2);



    return 0;
}
