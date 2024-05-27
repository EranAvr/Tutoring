#include <stdio.h>

// actual function-
int sumUpTwoNumbers(int a, int b){return a + b;}

// function declarations (prototypes)-
int multBy3(int a);
int multBy4(int a);

int main()
{
    int result = sumUpTwoNumbers(4, 5);
    printf("%d\n", result);

    int x=4, y=5;
    printf("%d\n", sumUpTwoNumbers(x, y));


    printf("%d\n", multBy3(5));
    printf("%d\n", multBy4(5));

    printf("%d\n", multBy5(5));

    return 0;
}

// function implementations-
int multBy3(int a){ return a * 3; }
int multBy4(int a){ return a * 4; }
int multBy5(int a){ return a * 5; }