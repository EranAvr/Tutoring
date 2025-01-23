#include <stdio.h>
#include <string.h>

int myStrCmp(char* str1, char* str2){
    while (*str1 && *str1==*str2)
    {
        str1++;
        str2++;
    }
    /*
        if *str1 - *str2 = 0 then strings are equal
        if *str1 - *str2 > 0 then str1 is greater
        if *str1 - *str2 < 0 then str2 is greater
    */
    return *str1 - *str2;
}

size_t strLen(char* str){
    size_t count = 0;
    while (str[count] != '\0')
        count++;
    return count;
}


void strReverse(char* str){
    size_t len = strLen(str);
    for (size_t i = 0; i < len / 2; i++)
    {
        char* dest = str + len-1 - i;
        char temp = *(str+i);
        *(str+i) = *dest;
        *dest = temp;
    }
}
void strReverseByPtr(char* str){
    size_t len = strLen(str);
    for (char* dest = str+len-1; str < dest;)
    {
        char temp = *str;
        *str = *dest;
        *dest = temp;

        str++;
        dest--;
    }
}

int main(){
    /*int x = 10;
    int* ptr = &x;*/

    char* str1 = "abc";
    char* str2 = "abc";
    printf("abc ? abc = %d\n", myStrCmp(str1, str2));

    char* str3 = "xyz";
    printf("abc ? xyz: %d\n", myStrCmp(str1, str3));

    char* str4 = "xy";
    printf("xyz ? xy: %d\n", myStrCmp(str3, str4));
    

    char* str5 = "The dog walks in the park";
    printf("strLen = %d\n", strLen(str5));

    char str6[] = "abcde";
    printf("original = %s\n", str6);
    strReverse(str6);
    printf("reversed = %s\n", str6);

    return 0;
}