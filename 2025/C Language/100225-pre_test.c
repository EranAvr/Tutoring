#include <stdio.h>

int mult(int a, int b){
    return a*b;
}

size_t lenOfString(char* sPtr){
    size_t count = 0;
    while (sPtr[count] != '\0')
    {
        count++;
    }
    return count;
}

void reverseStr(char* sPtr, size_t len){
    for (size_t i = 0; i < len/2; i++)
    {
        char temp = sPtr[i];
        sPtr[i] = sPtr[len-1-i];
        sPtr[len-1-i] = temp;
    }
    
}



int main(){
    printf("Hello dear student!\n");
    printf("The date today is: %d/%d/%d\n", 10, 2, 2025);
/*
    int x;
    scanf("%d", &x);
    printf("x = %d\n", x);
    int* xPtr = &x;
    scanf("%d", xPtr);
    printf("x = %d\n", x);

    while (getchar() != '\n');
    int y;
    scanf("enter %d value\n", &y);
    printf("y = %d\n", y);
*/

    int numbers[5] = {1,2,3,4,5};
    int zeros[5] = {0};
    char chars[3] = {'@', '6', 97};
    int table[3][3] = {{1,2,3}, {4,5,6}, {7,8,9}};
    char* words[3] = {"Hello", "Goodbye", "Today"};
    size_t len = sizeof(words) / sizeof(char);
    /*for (size_t i = 0; i < len; i++)
    {
        printf("%s\n", words[i]);
    }*/

    char* str1 = "Some string..";   // read-only string
    char str2[] = "Another string"; // mutable string

    printf("str1 = %s\n", str1);
    printf("str2 = %s\n", str2);

    printf("str1 in index 3 = %c\n", *(str1+3));

    *(str2+3) = 'T';
    printf("str2 in index 3 = %c\n", *(str2+3));
    printf("str2 = %s\n", str2);

    printf("length of str1 = %d\n", lenOfString(str1));
    printf("length of str2 = %d\n", lenOfString(str2));

    char str3[] = "abcdefg";
    reverseStr(str3, lenOfString(str3));
    printf("str3 after reverse = %s\n", str3);
    

    return 0;
}