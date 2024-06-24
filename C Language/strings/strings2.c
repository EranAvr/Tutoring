#include <stdio.h>


int main(){

    char str1[10];
    char *str2;

    scanf("%s", str1);
    scanf("%s", str2);

    printf("str1 = %s\n", str1);
    printf("str2 = %s\n", str2);

    printf("str1 length = %d\n", sizeof(str1) / sizeof(char));
    printf("str2 length = %d\n", sizeof(str2) / sizeof(char));

    char* cursor = str2;
    size_t count = 0;
    while (*cursor != '\0')
    {
        printf("%d\n", *cursor);    // print ASCII value of characters
        count++;    // count characters
        cursor++;   // advance pointer
    }
    printf("Actual length of str2 = %d\n", count);
    

    return 0;
}