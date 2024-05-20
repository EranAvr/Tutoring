#include <stdio.h>

int main(){
    // Rectangle:
    int width=0, height=0;
    printf("Enter width: ");
    scanf("%d", &width);
    printf("Enter height: ");
    scanf("%d", &height);

    printf("Perimeter is: %d\n", width*2+height*2);
    printf("Area is: %d\n", width*height);


    // Days to Year/weeks/days:
    int totalDays = 0;
    printf("Enter number of days: ");
    scanf("%d", &totalDays);

    printf("Years: %d\n", totalDays/365);
    //totalDays = totalDays - (totalDays/365) * 365;
    totalDays %= 365;

    printf("Weeks: %d\n", totalDays/7);
    totalDays %= 7;

    printf("Remaining days: %d", totalDays);

    // Swap two variables, without a third-variable:
    int x = 5, y = 7;
    printf("x = %d ; y = %d\n", x, y);

    x = x + y;
    y = x - y;
    x = x - y;

    printf("x = %d ; y = %d\n", x, y);


    return 0;
}