#include <stdio.h>
#include <string.h>


int main(){

    // strlen()
    char *str = "Hello World!"; // 12 actual characters
    printf("length = %d\n", strlen(str));

    // strcmp()
    char *str2 = "e";
    char *str3 = "ddd";
    printf("strcmp = %d\n", strcmp(str2, str3));

    // strcpy()
    char strDest[20];
    char *strSrc = "Good Day!";
    strcpy(strDest, strSrc);
    printf("address = %p \t value = %s\n", strDest, strDest);
    printf("address = %p \t value = %s\n", strSrc, strSrc);

    // strcat()
    char strDest2[20] = "Hello";
    char *strSrc2 = " World!";
    strcat(strDest2, strSrc2);
    printf("strDest2 = %s\n", strDest2);

    // strstr()
    char *strHaystack = "Nice to learn C";
    char *strNeedle = "to";
    char* res = strstr(strHaystack, strNeedle);
    printf("character = %c\n", *res);



    return 0;
}