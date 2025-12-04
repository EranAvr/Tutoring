#include <stdio.h>

void swapWithPtr(int* pa, int* pb){
    int temp = *pb;
    *pb = *pa;
    *pa = temp;
}

int main()
{
    int x = 10;

    int* ptr;   // יצירת משתנה-מצביע 
    ptr = &x;   // הסימן & לוקח כתובת של משתנה קיים
    printf("%d\n", *ptr);   // * על שם המצביע תחזיר את הערך שאליו הוא מצביע 
    printf("%p\n", ptr);
    printf("%x\n", ptr);

    int a = 10, b = 20;
    printf("Before: a=%d b=%d\n", a, b);
    swapWithPtr(&a, &b);
    printf("After: a=%d b=%d\n", a, b);
    
    return 0;
}
