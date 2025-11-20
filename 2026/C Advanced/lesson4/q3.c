#include <stdio.h>

/*
יש לקלוט ערך char אל משתנה symb
וערך int אל משתנה בשם num.
אם אל symb נקלט הערך 'd'
יש להדפיס את שם הספרה שנקלטה אל num
אחרת אם אל symb נקלט הערך 'm'
יש להדפיס את שם החודש שנקלט אל num.

* ניתן להניח שהקלט אל symb הוא תקין.
** לכל קלט לא תקין שנקלט אל num יש
 להדפיס שגיאה ולהמנע מהבדיקות.
*/

int main()
{
    char symb;
    int num;
    scanf("%c %d", &symb, &num);
    printf("%c %d", symb, num);
    if (symb == 'd')
    {
        switch (num)
        {
        case 0:
            printf("Zero\n");
            break;
        case 1:
            printf("One\n");
            break;
        case 2:
            printf("Two\n");
            break;
        default:
            printf("Illegal digit\n");
            break;
        }
    }
    else if (symb == 'm')
    {
        switch (num)
        {
        case 1:
            printf("January\n");
            break;
        case 2:
            printf("February\n");
            break;
        case 3:
            printf("March\n");
            break;
        default:
            printf("Illegal month\n");
            break;
        }
    }
    

    return 0;
}
