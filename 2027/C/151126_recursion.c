#include <stdio.h>

int recAverage(int n){
    if (n == 0)
        return 0;
    
    int temp = n;
    int count = 0;
    while (temp > 0)
    {
        count++;
        temp /= 10;
    }
    
    int sum = n%10 + recAverage(n / 10);
    return (int)((float)sum / (float)count);
    //return sum;
}




int main(int argc, char const *argv[])
{

    printf("Check = %d\n", recAverage(1234321));
    
    return 0;
}
