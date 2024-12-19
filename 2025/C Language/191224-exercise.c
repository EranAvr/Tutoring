#include <stdio.h>

int main(){
    // IO-

    // ex8:
    /*int n1, n2, n3;
    scanf("%d %d %d", &n1, &n2, &n3);
    printf("sum is %d\n", n1 + n2 + n3);*/

    // Conditions-

    // ex9:
    float x, y;
    scanf("%f %f", &x, &y);
    if (x > 0 && y > 0)
    {
        printf("Quarter I\n");
    }
    else if (x < 0 && y > 0)
    {
        printf("Quarter II\n");
    }
    else if (x < 0 && y < 0)
    {
        printf("Quarter III\n");
    }
    else if (x > 0 && y < 0)
    {
        printf("Quarter IV\n");
    }
    else 
    {
        printf("On axis\n");
    }

    


    return 0;
}