#include <stdio.h>

/* Palindrome Check */

int main(){

    char str[50];
    scanf("%s", str);


    // (1) find last character of string,
    // by address or index.
    int lastIdx = 0;
    while (str[lastIdx] != '\0')
    {
        lastIdx++;
    }
    printf("Actual length of str = %d\n", lastIdx+1);
    

    // (2) check palindrome
    int result = 1; // 1 ~ true. means all is well.
    lastIdx--;  // fix the last index to be before '\0'
    for (size_t i = 0; i < lastIdx; i++, lastIdx--)
    {
        if (str[i] != str[lastIdx])
        {
            result = 0;
            break;
        }
    }

    if (result)
    {
        printf("String is palindrome.");
    }
    else {
        printf("Not a palindrome.");
    }
    

}