#include <stdio.h>

/*
יש לקלוט מס' שלם n אשר גדול/שווה ל-2.
יש להדפיס למסך את n האיברים של סדרת פיבונאצ'י,
בשורה אחת.
*/

int main() {
    int n = 0;
    scanf("%d", &n);

    int a = 0;
    int b = 1;
    printf("%d %d ", a, b);
    n -= 2;

    for (size_t i = 0; i < n; i++)
    {
        int next = a + b;
        printf("%d ", next);
        a = b;
        b = next;
    }
    

    return 0;
}