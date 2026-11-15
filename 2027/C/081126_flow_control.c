/*
    Exercises webpage: https://www.w3resource.com/c-programming-exercises/for-loop/index.php

    Questions:
    34, 35
    reverse an integer
    38, 41
    calculate gcd
    calculate lcm


*/


#include <stdio.h>

void fibo(int count, int a, int b){
    if (count == 0)
    {
        return;
    }

    printf("%d\n", a);

    fibo(count-1, b, a+b);
    
}



int main()
{
    // ex34
    // int num;
    // scanf("%d", &num);
    // printf("You entered the number: %d\n", num);

    // for (int n=1 ; n <= num ; n++)
    // {
    //     int isPrime = 1;
    //     for (int d = 2; d < n-1; d++)
    //     {
    //         if (n % d == 0)
    //         {
    //             isPrime = 0;
    //         }
    //     }
    //     if (isPrime)
    //     {
    //         printf("%d is indeed prime!\n", n);
    //     }
    // }
    
    // ex35
    // int elements;
    // scanf("%d", &elements);
    // int a=0, b=1;
    // printf("%d\n%d\n", a, b);
    // for (size_t steps = 0; steps < elements-2; steps++)
    // {
    //     // printing
    //     int next = a+b;
    //     printf("%d\n", next);
    //     // making next step
    //     a = b;
    //     b = next;
    // }
    fibo(10, 0, 1);
    



    return 0;
}
