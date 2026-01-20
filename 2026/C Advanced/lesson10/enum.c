#include <stdio.h>

enum DAY {SUNDAY, MONDAY, TUESDAY};

int main(int argc, char const *argv[])
{
    enum DAY day = SUNDAY;
    printf("size: %d\n", sizeof(SUNDAY));   // 4 bytes of memory

    switch (day)
    {
    case SUNDAY:
        /* code */
        break;
    case MONDAY:
        /* code */
        break;
    case TUESDAY:
        /* code */
        break;
    default:
        break;
    }
    
    return 0;
}
