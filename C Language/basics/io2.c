#include <stdio.h>

int main(){
    // escaping:
    printf("My name is Eran.\nI am a teacher.\n");

    printf("\tThis text starts with a Tab.\tThis also starts with Tab.\n");
    printf("abcde\tThis text starts with a Tab.\tThis also starts with Tab.\n");

    printf("This is some first line.\n\vThis line is lower by a vertical Tab.\n");
    

    // formatted output:

    //char-
    char c1 = 'a';
    printf("character is: %c\n", c1);
    printf("ascii number is: %d\n", c1);
    char c2 = '@';
    printf("character is: %c\n", c2);
    printf("ascii number is: %d\n", c2);
    char c3 = 98;
    printf("character is: %c\n", c3);
    printf("ascii number is: %d\n", c3);
    c3++;
    printf("character is: %c\n", c3);
    printf("ascii number is: %d\n", c3);
    /*
    This causes a compilation error:
    char tooLarge = 5555;
    printf("Too big of a number: %d\n", tooLarge);
    */
    
    
    // int-
    printf("value of i is: %d\n", (5555));
    int i = 100;
    printf("value of i is: %d\n", i);
    printf("i / 10 = %d\n", i/10);
    

    // multiple variables
    int n = 10;
    double d = 3.14;
    printf("int value is: %d \t double value is: %f\n", n, d);
    printf("Shorten double presentation: %.2f\n", d);
    printf("%d      %d\n", n);
    printf("%d\n", n, (234), n);
    


    // formatted input:

    // char-
    char in_c;
    scanf("%c", &in_c);
    printf("check read value: %c\n", in_c);

    // int- 
    int in_i;
    scanf("%d", &in_i);
    printf("check read value: %d\n", in_i);

    // double- 
    // Notice the use of format '%f'
    float in_f;
    scanf("%f", &in_f);
    printf("check read value: %f\n", in_f);

    // double- 
    // Notice the use of format '%lf'
    double in_d;
    scanf("%lf", &in_d);
    printf("check read value: %lf\n", in_d);
    
    return 0;
}
