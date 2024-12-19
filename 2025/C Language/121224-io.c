#include <stdio.h>

int main(){
    // int:
    /*int num;
    scanf("%d", &num);
    printf("User int value = %d \n", num);

    scanf("number is %d", &num);
    printf("User int value = %d \n", num);

    while (getchar() != '\n');*/
    int hours, minutes, seconds;
    scanf("%d:%d:%d", &hours, &minutes, &seconds);
    printf("time is %d-%d-%d \n", hours, minutes, seconds);

    // char:
    char myChar;
    scanf(" %c", &myChar);   // placing a whitespace before the specifier will consume leftover whitespaces (' ' or '\n')
    printf("User char value = %c\n", myChar);

    // float:
    float f;
    scanf("%f", &f);
    printf("User float value = %f\n", f);



    return 0;
}