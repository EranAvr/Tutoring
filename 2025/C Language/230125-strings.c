#include <stdio.h>

int main(){
    /* Create string - first way */
    char str1[] = "Hello World!";
    // Calc length of char-array
    // NOTICE! This include the '\0' at the end
    size_t len1 = sizeof(str1) / sizeof(str1[0]);
    printf("String-1: %s, length of char array: %d\n", str1, len1); // str1 is the address of the string

    /* Create string - second way */
    char* str2 = "Hello World!";
    // This won'r work-
    // because sizeof(str2) return the size of the pointer
    size_t len2 = sizeof(str2) / sizeof(str2[0]);   // DON'T USE THIS WAY


    printf("String-2: %s, length of string: %d\n", str2, len2);
    // Calc actual length of string
    // This time, we exclude (don't count) '\0' character
    // THIS IS THE BETTER WAY !!
    size_t correctLen2 = 0;
    while (str2[correctLen2] != '\0')
    {
        correctLen2++;
    }
    printf("Correct length: %d\n", correctLen2);
    /* Create string - third way (manually) */
    //int arr[] = {1,2,3};'
    char str3[] = {'d', 'o', 'd', 'g', 'e', ' ', 's', 'r', 't', '\0'};
    printf("String-3: %s\n", str3);

    char str4[15] = "Hello!";
    printf("String-4: %s\n", str4);
    printf("%c\n", str4[6]);    // '\0'
    // add characters (word):
    str4[7] = 'a';
    str4[8] = 'b';
    str4[9] = 'c';
    // fix string:
    str4[6] = ' ';
    str4[10] = '\0';
    printf("String-4: %s\n", str4);

    // This string overrides the '\0' character,
    // therefor the string has no end!
    char str5[8] = "Hello World!";
    printf("String-5: %s\n", str5);

    char strInput1[100];
    scanf("%s", strInput1);
    printf("User input 1: %s\n", strInput1);

    // If input is too long,
    // data of 'strInput1' will be corrupted !!
    // chars from last input will be saved over
    // chars of the last variable.
    char strInput2[5];
    scanf("%s", strInput2);
    printf("User input 2: %s\n", strInput2);
    printf("User input 1: %s\n", strInput1);


    return 0;
}