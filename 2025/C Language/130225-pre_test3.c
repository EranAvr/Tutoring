#include <stdio.h>
#include <stdlib.h>


size_t lenOfString(char* sPtr){
    size_t count = 0;
    while (sPtr[count] != '\0')
    {
        count++;
    }
    return count;
}

// str = "123.456"
// len = 7

float strToFloat(char* str){
    size_t len = lenOfString(str);
    float floty = 0;
    for (size_t i = 0; i < len; i++){
        if (str[i] != '.')
        {
            floty *= 10;
            floty += str[i] - '0';
        }
    }
    int divide = 1;
    for (size_t i = len-1; i >= 0; i--)
    {
        if (str[i] == '.')
        {
            break;
        }
        divide *= 10;
    }
    printf("%d\n", divide);
    printf("%f\n", floty);

    return floty / divide;
}


int main(){
    float result = strToFloat("123.456");
    printf("result = %.4f\n", result);

    return 0;
}