#include <stdio.h>

// Prototypes - חתימות (אבטיפוס) בלבד
void printWords();
int sumTwoNumbers(int, int);


int main(int argc, char const *argv[])
{
    
    printWords();
    printf("2 + 5 = %d\n", sumTwoNumbers(2,5));

    return 0;
}


// Implementations - פה נכתוב את הפונ' במלואה יחד עם הגוף
void printWords(){
    printf("Printed from function!\n");
}
int sumTwoNumbers(int a, int b){
    return a+b;
}