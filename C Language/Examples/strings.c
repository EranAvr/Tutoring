#include <stdio.h>

int recursiveAlphabeticOrder(char *str1, char *str2);

int main()
{
    // Creating a 'string' type
    // Strings in C programming are actually arrays of chars,
    // so we can declare their type as array or as pointer.
    char strHello[] = "Hello World";
    char *strHello2 = "Hello World";
    char greetings[] = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!', '\0'};

    // Printing a string is done by the %s format specifier.
    // Note- every string is terminated by a special sign of '\0',
    // to annotate the end of this string in memory.
    printf("%s\n", strHello);
    printf("%s\n", strHello2);

    // Checking sizeof on different initializations
    printf("%d\n", sizeof(strHello));

    char smallStr[] = "abc";
    char largeStr[100] = "abc";
    printf("sizeof(smallStr) = %d\n", sizeof(smallStr));
    printf("sizeof(largeStr) = %d\n", sizeof(largeStr));
    

    return 0;
}

