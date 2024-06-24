#include <stdio.h>


int main(){
    /*  Initialization */
    // Notice: in the different ways to create a string,
    // character '\0' is being added automatically,
    // Except when using initializer-list !!
    char str1[] = "hello world!";
    char *str2 = "hello world!";
    char str3[] = {'h', 'e', 'l', 'l', 'o', '\0'};
    char str4[20] = "hello";

    /* Printing */
    // The %s format operator will print all
    // elements of string, until '\0' is reached.
    printf("str1 = %s\n", str1);
    printf("str2 = %s\n", str2);
    printf("str3 = %s\n", str3);
    printf("str4 = %s\n", str4);


    /* Size of string */
    // When using initializer-list syntax, we must
    // add the ending-character '\0'.
    char str5[] = {'h', 'e', 'l', 'l', 'o'};
    printf("str5 = %s\n", str5);


    /* Size of string */
    // Notice:
    // 1) the special char '\0' is part of the string!
    // and is included in the counting.
    // 2) sizeof() counts elements of array, not chars of string.
    // So, if array is larger than string, we won't get the
    // right length for the string.
    char str6[] = "count";
    char str7[20] = "count";
    char *str8 = "count...";
    printf("Elements count in str6 = %d\n", sizeof(str6)/sizeof(char));
    printf("Elements count in str7 = %d\n", sizeof(str7)/sizeof(char));
    printf("Elements count in str8 = %d\n", sizeof(str8)/sizeof(char)); // size is undefined in pointers


    return 0;
}