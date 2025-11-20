#include <stdio.h>

/*
יש לקלוט תו char
ולקבוע האם הוא:
ספרה
או אות לועזית
או סימן
*/

int main(){
    char symb;
    scanf("%c", &symb);
    if (symb >= '0' && symb <= '9')
        printf("%c is a number\n", symb);
    else if (symb >= 'a' && symb <= 'z' || symb >= 'A' && symb <= 'Z')
        printf("%c is a letter\n", symb);
    else 
        printf("%c is a symbol\n", symb);

    return 0;
}