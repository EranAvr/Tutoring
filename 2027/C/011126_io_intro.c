#include <stdio.h>


int z;

int main()
{
    int x;
    printf("Local Variable=%d\n", x);

    static int y;
    printf("Static Variable=%d\n", y);

    printf("Global Variable=%d\n", z);


    //printf(3);  // Warning. Illegal command!
    printf("My name is");
    printf("Eminem");
    printf("abc 123 \t@#$...");


    /* Print with formats */
    int num = 20;
    printf("Value of num=%d\n", num);
    printf("n1=%d \t\t n2=%d\n", 100, 200);
    int a=5, b=7;
    printf("%d + %d = %d\n", a, b, a+b);

    /* Types formats */
    printf("char: %c \n", '#');
    printf("float: %f \n", 22.0/7);
    printf("double: %lf \n", 22.0/7);
    printf("string: %s \n", "Some long text...");

    /* Scanf - read inputs */
    int number;
    scanf("%d", &number);
    printf("number=%d\n", number);

    float floating;
    scanf("%f", &floating);
    printf("floating=%f\n", floating);

    char ch;
    scanf(" %c", &ch);
    printf("ch=%c\n", ch);


    return 0;
}
