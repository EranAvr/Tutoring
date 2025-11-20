#include <stdio.h>

/*
יש לקלוט 3 אורכי צלעות במספרים שלמים.
1) יש לקבוע האם האורכים הם תקינים, עפ"י המשפט:
סכום כל 2 צלעות גדול ממש מהשלישית.
2) יש לקבוע האם המשולש:
2.1) שווה שוקיים
2.2) שווה צלעות
2.3) ישר זווית
*/

int main(){
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);

    if (a+b>c && a+c>b && b+c>a)
    {
        if (a==b && a!=c || a==c && a!=b || b==c && b!=a)
        {
            printf("Triangle is Isosceles");
        }
        if (a==b && a==c || a==c && a==b || b==c && b==a)
        {
            printf("Triangle is Equilateral");
        }
        if (a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a)
        {
            printf("Triangle has right angle");
        }
    }
    else {
        printf("Not a triangle.");
    }
    


    return 0;
}