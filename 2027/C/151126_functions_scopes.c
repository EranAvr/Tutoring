#include <stdio.h>

// Prototypes - חתימות (אבטיפוס) בלבד
void funcScope();
void staticCount();

int main()
{
    /* Scopes */
    if (1)
    {
        int innerIf;
        {
            printf("Value of line 10 = %d\n", innerIf);
        }
    }
    
    // Errors in scoping:
    //printf("Value of line 10 = %d\n", innerIf);
    

    /* Static */
    static int xStat = 1;
    staticCount();
    staticCount();
    staticCount();
    //printf("Count = %d\n", count);



    return 0;
}


// Implementations - פה נכתוב את הפונ' במלואה יחד עם הגוף
void funcScope(){
    int xOfFunc;
    printf("Printed from function!\n");
}

void staticCount(){
    static int sCount = 0;
    int count = 0;

    printf("Static count = %d,\tRegular count = %d\n", sCount, count);

    sCount++;
    count++;
}
