/*   Exercises:   */


#include <stdio.h>


// function declarations (prototypes)-
int square(int a);
void notAGoodSwap(int a, int b);
int isEven(int a);
float sumOfSeries(int n);
int factorial(int n);



int main()
{
    printf("%d\n", square(20));

    int aSwap = 3, bSwap = 10;
    notAGoodSwap(aSwap, bSwap);

    printf("%.2f\n", sumOfSeries(5));


    return 0;
}



// function implementations-
int square(int a){
    return a * a;
}

void notAGoodSwap(int a, int b){
    int temp = a;
    a = b;
    b = temp;
}

int isEven(int a){
    return a % 2 == 0;
}

float sumOfSeries(int n){
    float sum = 0;
    for (size_t i = 1; i <= n; i++)
    {
        sum += factorial(i) / i;
    }
    return sum;
}
int factorial(int n){
    int result = 1;
    for (size_t i = 1; i <= n; i++)
    {
        result *= i;
    }
    return result;
}