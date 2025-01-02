#include <stdio.h>

// Prototypes:
int pow2(int);  // calculate a^2 
int power(int a, int n);    // calculate a^n
int squareRoot(int a);    // calculate sqrt(a)


int main(){

    int res1 = pow2(3);
    printf("res1 = %d\n", res1);
    int res2 = pow2(10);
    printf("res2 = %d\n", res2);


    int res3 = power(2, 3);
    printf("res3 = %d\n", res3);
    int res4 = power(3, 3);
    printf("res4 = %d\n", res4);
    int res5 = power(2, 8);
    printf("res5 = %d\n", res5);


    int res6 = squareRoot(0);
    printf("res6 = %d\n", res6);
    int res7 = squareRoot(9);
    printf("res7 = %d\n", res7);
    int res8 = squareRoot(25);
    printf("res8 = %d\n", res8);
    int res9 = squareRoot(17);
    printf("res9 = %d\n", res9);
    
    return 0;
}


int pow2(int a){
    return a * a;
}
int power(int a, int n){
    int pow = 1;
    for (int i=0; i<n; i++){
        pow *= a;
    }
    return pow;
}
int squareRoot(int a){
    for (int i=0; i<=a; i++){
        if (i * i == a){
            return i;
        }
    }
    return -1;
}