#include <stdio.h>

int x=-1;

int main(){

    {
        printf("global scope: x=%d\n", x);
    }

    int x=1, y=2;
    // from here on, the global 'x' won't be recognized in main().
    // This is due the local 'x' variable that is shadowing the global 'x'.
    {
        int x = 20;
        printf("inner scope: x=%d\n", x);
    }
    printf("main scope: x=%d y=%d\n", x, y);

    for (size_t x = 0; x < 2; x++)
    {
        printf("for scope: x=%d\n", x);
    }
    

    return 0;
}