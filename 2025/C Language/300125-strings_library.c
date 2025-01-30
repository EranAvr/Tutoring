#include <stdio.h>
#include <string.h>

int main(){
    char* str1 = "The fox chase the chicken";

    // strlen():
    size_t len1 = strlen(str1);
    printf("len1 = %d\n", len1);

    // strcmp():
    char* str2 = "abcd";
    char* str3 = "abc";
    int compare = strcmp(str2, str3);
    printf("compare = %d\n", compare);

    int compare2 = strncmp(str2, str3, 3);
    printf("compare2 = %d\n", compare2);

    // strcpy():
    char* src = "Welcome to the club!";
    char dest[strlen(src)+1];
    strcpy(dest, src);
    printf("dest = '%s'\n", dest);

    // strcat():
    char* src2 = "xyz";
    char dest2[] = "abc ";
    strcat(dest2, src2);
    printf("dest2 = '%s'\n", dest2);


    return 0;
}