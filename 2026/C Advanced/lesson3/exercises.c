#include <stdio.h>
#include <math.h>

#define PI 3.14
#define F_TO_C(f) ((f - 32) * (5.0/9))

int main()
{
    // ex1
    /*float f;
    scanf("%f", &f);
    //float c = (f - 32) * (5.0/9);
    float c = F_TO_C(f);
    printf("c = %f\n", c);*/

    // ex2
    /*float r;
    scanf("%f", &r);
    float v = (4.0/3) * PI * r * r * r;
    printf("v = %f\n", v);*/


    // ex11
    double a, b, c;
    scanf("%lf %lf %lf", &a, &b, &c);
    double delta = b*b - 4*a*c;
    if (delta > 0)
    {
        double x1 = (-b + sqrt(delta)) / 2*a;
        double x2 = (-b - sqrt(delta)) / 2*a;
        printf("x1 = %.2lf, x2 = %.2lf\n", x1, x2);
    }
    else if (delta == 0){
        double x = (-1*b) / 2*a;
        printf("x1 = x2 = %.2lf\n", x);
    }
    else {
        printf("No roots!\n");
    }


    // ex
    /*
        כתבו תוכנית הקולטת ציונים עד אשר
        יקלט הערך -1
        (מינוס 1)
        התוכנית תדפיס למסך את ממוצע הציונים
    */
   int count = 0, grade = 0;
   float sum = 0;
   while (1)
   {
        scanf("%d", &grade);
        if (grade == -1)
        {
            break;
        }
        sum += grade;
        count++;
   }
   printf("Average is %f\n", sum/count);
   
    

    
    return 0;
}
