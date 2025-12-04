#include <stdio.h>


void printIntPtr(int* ptr){
    printf("%p => %d\n", ptr, *ptr);
}
void printCharPtr(char* ptr){
    printf("%p => %c\n", ptr, *ptr);
}

void addNumber(int* ptr, int x){
    *ptr += x;
}

void saveMax(int* max, int a, int b){
    if (a > b)
        *max = a;
    else
        *max = b;
}

void reverseNum(int* ptr){
    int n = 0;
    while (*ptr != 0)
    {
        n *= 10;
        n += *ptr % 10;
        *ptr /= 10;
    }
    *ptr = n;
}

int palindrome(int num){
    int rev = num;
    reverseNum(&rev);

    return num == rev;
}

int main(){
    /*
        ex1
        a) כתבו פונ' המקבלת פויינטר מטיפוס int,
        ומדפיסה למסך גם את כתובתו וגם את הערך המוצבע.
        b) אותו הדבר, אבל עבור טיפוס char.
        */
       int x = 10;
       printIntPtr(&x);
       char c = '@';
       printCharPtr(&c);



        /*
        ex2
        כתבו פונ' המקבלת 2 פרמטרים: פויינטר ptr מטיפוס int 
        וערך רגיל x מטיפוס int.
        הפונ' תוסיף לערך המוצבע ע"י ptr
        את הערך של x
        */
       int a = 10;
       addNumber(&a, 5);
       printf("%d\n", a);


    /*
        ex3
        כתבו פונ' המקבלת כפרמטרים:
         מצביע בשם max ושני ערכי int בשם a,b
        הפונ' תשמור אל תוך max את הגדול מבין a ו-b
    */
    int maxy;
    saveMax(&maxy, 10, 20);
    printf("maxy = %d\n", maxy);


    /*
        ex4
        כתבו פונ' המקבלת מצביע אל מספר int,
        והופכת אותו ב-reverse.
        הערך ההפוך צריך להישמר אל תוך הכתובת המקורית.
    */
    int y = 1234;
    reverseNum(&y); // after: y=4321
    printf("y = %d\n", y);


    /*
        ex5
        כתבו פונ' המקבלת מס' מטיפוס int
        ומחזירה תשובה בוליאנית עבור השאלה:
        האם הוא פלינדרום?
        דגש: חובה להשתמש בפונ' הקודמת reverseNum
    */
   int z = 12321;
   printf("Is %d pali? %d\n", z, palindrome(z));



}