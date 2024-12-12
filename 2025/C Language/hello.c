#include <stdio.h>

int main() {
    int x = 1;  // saved in Stack segment
    static int y = 1;   // saved in Data segment

    printf("Hello World");

    return 0;
}