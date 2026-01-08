#include <stdio.h>


int main()
{
    char str1[] = "Hello World!";
    char* str2 = "Some string...";

    size_t len1 = sizeof(str1) / sizeof(char);
    size_t len2 = sizeof(str2) / sizeof(char);

    printf("len1 = %d\n", len1);
    printf("len2 = %d\n", len2);

    printf("str1 = %s\n", str1);
    printf("str2 = %s\n", str2);

    printf("str1[12] = %c, decimal = %d\n", str1[12], str1[12]);

    /*
    char invalidStr[] = {'a', 'b', 'c'};    // BAD PRACTICE!
    printf("invalidStr = %s\n", invalidStr);
    */

    char longStr[100] = "abcde";
    printf("longStr[5] = %c, decimal = %d\n", longStr[5], longStr[5]);
    printf("longStr[10] = %c, decimal = %d\n", longStr[10], longStr[10]);

    
    for (size_t i = 0; i < len1-1; i++)
    {
        printf("%c\n", str1[i]);
    }
    for (char* ptr = str1; *ptr != '\0'; ptr++)
    {
        printf("%p -> %c\n", ptr, *ptr);
    }
    

    



    return 0;
}
