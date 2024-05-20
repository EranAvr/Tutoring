#include <stdio.h>

int main(){
    int fCount = 2;
    for (size_t i = 0; i < fCount; i++)
    {
        printf("for loop.\n");
    }

    int wCount = 3;
    while (wCount > 0)
    {
        printf("while loop.\n");
        wCount--;
    }

    int dwCount = 2;
    do
    {
        printf("do-while loop, runs at least once.\n");
        dwCount--;
    } while (dwCount > 0);
    



    int userInput = 0;
    do
    {
        printf("Enter number less than 100: ");
        scanf("%d", &userInput);
    } while (userInput >= 100);
    
    
    

    return 0;
}