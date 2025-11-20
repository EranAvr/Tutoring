#include <stdio.h>

int main()
{
    // scan int
    printf("Enter integer:\n");
    int x = 0;
    printf("x is = %d\n", x);
    scanf("%d", &x);
    printf("x is = %d\n", x);
    printf("x address is = %d\n", &x);



    /*int num;
    scanf("number is %d", &num);
    printf("num is = %d\n", num);*/
    /*int n1, n2;
    scanf("n1 %d and n2 %d", &n1, &n2);
    printf("n1 = %d and n2 = %d\n", n1, n2);*/


    while (getchar() != '\n');
    

    // scan char
    char c1;
    scanf("%c", &c1);
    printf("c1 is = %c\n", c1);
    printf("c1 address is = %d\n", &c1);


    return 0;
}
