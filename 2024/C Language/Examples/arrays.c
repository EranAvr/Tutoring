#include <stdio.h>

int main(){
    /* Integers */
    int integers[] = {1,3,7,18,91};
    int countIntegers = sizeof(integers) / sizeof(int);

    printf("Array integers has %d elements.\n", countIntegers);

    for (size_t i = 0; i < countIntegers; i++)
    {
        printf("Element #%d is %d.\n", i+1, integers[i]);
    }

    // reading integers-
    printf("Enter %d elements:\n", countIntegers);
    for (size_t i = 0; i < countIntegers; i++)
    {
        scanf("%d", &integers[i]);
    }
    // printing array-
    for (size_t i = 0; i < countIntegers; i++)
    {
        printf("Element #%d is %d.\n", i+1, integers[i]);
    }


    /* Chars */
    char chars[6];
    int countChars = sizeof(chars) / sizeof(char);

    printf("Array chars has %d elements.\n", countChars);
    // reading chars-
    printf("Enter %d characters:\n", countChars);
    for (size_t i = 0; i < countChars; i++)
    {
        scanf("%c", &chars[i]);
    }
    // printing array-
    for (size_t i = 0; i < countChars; i++)
    {
        printf("Element #%d is %c.\n", i+1, chars[i]);
    }
    
    return 0;
}