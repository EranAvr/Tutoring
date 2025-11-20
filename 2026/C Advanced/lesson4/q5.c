#include <stdio.h>

/*
יש לקלוט מהמשתמש מספרים שלמים, עד
אשר נקלט מס' שלילי.
בסוף התוכנית יש להדפיס את סכום המס' החיוביים.
*/

int main() {

    int sum = 0;

    do
    {
        int num;
        scanf("%d", &num);
        if (num < 0)
            break;
        sum += num;

    } while (1);
    printf("sum = %d\n", sum);
    

    return 0;
}