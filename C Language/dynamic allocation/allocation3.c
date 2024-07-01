#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* ourStrDup(const char* src);

int main() {
    char* myStr = "It's a beautiful day!";
    char* myDup = ourStrDup(myStr); // Notice! ourStrDup() makes a dynamic allocation
    printf("myDup = %s \t length = %d\n", myDup, strlen(myDup));
    
    free(myDup);

    return 0;
}


/*
    This is our implementation for the built-in
    strdup() function.
*/
char* ourStrDup(const char* src){
    // example src = "David"

    // 1) calc size of src string
    size_t length = 0;
    while ( *(src + length) != '\0'){
        length++;
    }
    length++;   // to make extra space for '\0' character

    // 2) allocate new memory on heap
    char* newHeapStr = (char*) malloc(length * sizeof(char));   // because sizeof(char)=1, it's redundant.

    // 3) copy characters of src string into new one
    for (size_t i = 0; i < length; i++)
    {
        newHeapStr[i] = src[i];
    }
    
    // 4) return pointer to new memory
    return newHeapStr;
}