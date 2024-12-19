#include <stdio.h>

int main(){
    
    /*int num1;
    scanf("%d", &num1);

    switch (num1)
    {
    case 1:
        printf("num1 == 1");
        break;
    case 5:
        printf("num1 == 5\n");
        break;
    default:
        printf("num1 not found\n");
        break;
    }

    switch (num1)
    {
    case 10:
        printf("10 or smaller\n"); 
    case 5:
        printf("5 or smaller\n");
    case 25:
        printf("2 or smaller\n");     
    case 101:
        printf("1 or smaller\n");
    }*/


    int num2;
    scanf("%d", &num2);
    if (num2 < 10)
    {
        printf("smaller than 10\n");
    }
    else if (num2 >= 10 && num2 < 100){
        printf("10-99\n");
    }
    else {
        printf("100 or greater\n");
    }
    



    
    
    return 0;
};