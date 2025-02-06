#include <stdio.h>

// Bad practice! long way-
const int Sunday = 0;
const int Monday = 1;
const int Tuesday = 2;
// Good practice! short way-
enum days
{
    SUNDAY,
    MONDAY,
    TUESDAY
};

int main()
{
    printf("Sunday = %d\n", Sunday);
    printf("SUNDAY = %d\n", SUNDAY);

    int x;
    scanf("%d", &x);
    switch (x)
    {
    case SUNDAY:
        printf("User chose Sunday\n");
        break;
    case MONDAY:
        printf("User chose Monday\n");
        break;
    case TUESDAY:
        printf("User chose Tuesday\n");
        break;
    }

    return 0;
}