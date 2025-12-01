#include <stdio.h>


int main()
{
    int numbers[4];

    printf("numbers[0] = %d\n", numbers[0]);
    numbers[0] = 5555;
    printf("numbers[0] = %d\n", numbers[0]);

    for (size_t i = 0; i < 4; i++)
    {
        printf("numbers[%d] = %d\n", i, numbers[i]);
    }
    
    int initArr[5] = {10, 20, 30, 40, 50}; // array of size 5
    for (size_t i = 0; i < 5; i++)
    {
        printf("initArr[%d] = %d\n", i, initArr[i]);
    }
    int initArr2[] = {10, 20, 30, 40}; // array of size 4
    int initArr3[10] = {10, 20, 30, 40}; // array of size 10
    
    
    int zeros[10] = {0}; // array of  10 zeros

    char characters[10] = {'@', [1 ... 8]='a', '@'};
    for (size_t i = 0; i < 10; i++)
    {
        printf("%c", characters[i]);
    }
    printf("\n");


    size_t len = sizeof(characters) / sizeof(char);
    for (size_t i = 0; i < len; i++)
    {
        printf("characters[%d] = %c\n", i, characters[i]);
    }

    
    return 0;
}
