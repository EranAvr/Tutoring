#include <stdio.h>

int main()
{

    /* Switch */
    int x = 2;
    switch (x)
    {
    case 1:
        printf("Number is 1\n");
        break;
    case 2:
        printf("Number is 2\n");
        break;
    default:
        break;
    }

    char op = '+';
    switch (op)
    {
    case '+':
        printf("Result of 2+3 is: %d\n", (2 + 3) );
        break;
    case '-':
        printf("Result of 2-3 is: %d\n", (2 - 3) );
        break;
    default:
        break;
    }

    /* If-Else */
    int integers[] = {9, 10, 11};
    if (integers[0] == 0)
    {
        printf("integers starts with zero\n");
    }
    else if (integers[0] < integers[1] && integers[1] < integers[2])
    {
        printf("integers is an ascending array\n");
        if (integers[0] > 20)
        {
            printf("Also, all values are greater than 20\n");
        }
        if (integers[2] < 20)
        {
            printf("Also, all values are smaller than 20\n");
        }
    }
    else
    {
        printf("integers is a general array\n");
    }

    /* For loop */
    // size_t is actual an unsigned-int, which is more suitable for counting purposes;
    size_t count = 10;
    for (size_t i = 0; i < count; i++)
    {
        printf("#%d iteration!\n", i+1);
    }
    
    
    /* While loop */
    char c = 'a';
    while (c != 'z' + 1)
    {
        printf("Numeric value = %d,\tASCII value = %c\n", c, c);
        c++;
    }
    

    /* goto statement */

    goto label;
    printf("This would not be printed.\n");
    label:
    printf("This is printed after 'goto' execution.\n");

    return 0;
}
