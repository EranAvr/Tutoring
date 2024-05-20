#include <stdio.h>

int main()
{
    /*   Switch   */
    char expression = 'c';
    switch (expression)
    {
    case 'a':
        printf("'a' was typed\n");
        break;
    case 'b':
        printf("'b' was typed\n");
        break;
    default:
        printf("other char was typed\n");
        break;
    }

    int expression2 = 100;
    switch (expression2)
    {
    case 10:
        printf("10 was typed\n");
        break;
    case 100:
        printf("100 was typed\n");
        break;
    default:
        printf("other number was typed\n");
        break;
    }

    // break-less example
    int expression3 = 3;
    switch (expression3)
    {
    case 5:
        printf("at least 5\n");
    case 4:
        printf("at least 4\n");
    case 3:
        printf("at least 3\n");
    case 2:
        printf("at least 2\n");
    case 1:
        printf("at least 1\n");
    default:
        printf("other number was typed\n");
        break;
    }

    /*
        char expression3 = 'a';
        switch (expression3)
        {
        case 'a':
            printf("'a' was typed\n");
            break;
        case 97:
            printf("97 was typed\n");
            break;
        default:
            printf("other char was typed\n");
            break;
        }
        */

    /*
       float expression4 = 3.14;
        switch (expression4)
        {
        case 3.14:
            printf("3.14 was typed\n");
            break;
        case 3.12:
            printf("3.12 was typed\n");
            break;
        default:
            printf("other char was typed\n");
            break;
        }
        */

    /*   If-Else   */
    int boolExpression = (3 < 5 && 10 < 'a');
    printf("%d", boolExpression);

    int boolExp2 = 98.14 - 0.14 == 'b';
    if (boolExp2)
    {
        printf("true\n");
    }
    else {
        printf("false\n");
    }

    int exp3 = 'a' + 5;
    if (exp3  < 100)
    {
        printf("less than 100\n");
    }
    else if (100 < exp3 && exp3 < 200)
    {
        printf("between 100-200\n");
    }
    else 
    {
        printf("something else..\n");
    }
    

    return 0;
}