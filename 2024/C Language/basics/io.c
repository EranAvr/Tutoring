#include <stdio.h>

int main(){
    // escaping:
    printf("hello world!\n");
    printf("hello ");
    printf("world!\n");

    printf("\"string with double\tqoutes\tprinted\"\n");

    // formatted output:

    //char-
    char ch = 'a';
    printf("num: %d = character: %c\n", ch, ch);
    ch += 1;
    printf("num: %d = character: %c\n", ch, ch);

    // int-
    printf("This is a number: %d\n", 10);
    int age = 34;
    printf("My age is: %d\n", age);
    // multiple numbers
    printf("first: %d, second: %d, third: %d\n", 134, 132, 78);

    
    return 0;
}
