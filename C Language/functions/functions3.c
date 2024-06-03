#include <stdio.h>



void someFunction();


// (Totally) global variable:
int global = 10;

int main(){

    // local variable (relatively global):
    int local = 1;

    for (size_t i = 0; i < 2; i++)
    {
        // This is a code-block, belongs to the for loop.
        // This is a scope.
        printf("local is accessible in here. %d\n", local);

        if (i == 0)
        {
            printf("local is also accessible in here. %d\n", local);
            printf("global is also accessible in here. %d\n", global);
        }
        
    }
    
    someFunction();

    return 0;
}

void someFunction(){
    //printf("local is also accessible in here. %d\n", local);
    printf("global is also accessible in here. %d\n", global);

    int temp = 5555;
    {
        // inner scope.
        int temp = 15;
        printf("%d\n", temp);
    }
    printf("%d\n", temp);
}