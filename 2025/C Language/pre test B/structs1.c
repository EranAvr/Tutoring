#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// ex1)
/*
    כתבו מבנה המייצג נקודה במערכת צירים.
    המבנה יכיל שני שדות x, y
    מטיפוס עשרוני float
*/
struct Point
{
    float x;
    float y;
};

// ex2)
/*
    כתבו פונקציה המקבלת כפרמטרים שתי נקודות.
    הפונ' תחזיר את נק' האמצע שביניהן.
*/
struct Point calcMiddle(struct Point p1, struct Point p2){
    struct Point p3;
    p3.x = (p1.x + p2.x) / 2;
    p3.y = (p1.y + p2.y) / 2;

    return p3;
}
struct Point calcMiddle2(struct Point p1, struct Point p2){
    struct Point* p3 = (struct Point*) malloc(sizeof(struct Point));
    p3->x = (p1.x + p2.x) / 2;
    p3->y = (p1.y + p2.y) / 2;

    return *p3;
}
struct Point* calcMiddle3(struct Point p1, struct Point p2){
    struct Point* p3 = (struct Point*) malloc(sizeof(struct Point));
    p3->x = (p1.x + p2.x) / 2;
    p3->y = (p1.y + p2.y) / 2;

    return p3;
}

int findQuarter(struct Point p){
    if (p.x > 0){   // positive X
        if (p.y > 0){   // positive Y
            return 1;
        }
        else{   // negative Y
            return 4;
        }
    }
    else{   // negative X
        if (p.y > 0){   // positive Y
            return 2;
        }
        else{   // negative Y
            return 3;
        }
    }
}



int main(){
    struct Point p1 = {0,0};
    struct Point p2 = {5,5};
    struct Point mid = calcMiddle(p1, p2);
    printf("X = %f, Y = %f\n", mid.x, mid.y);

    struct Point p3 = {10,10};
    struct Point p4 = {10,-10};
    printf("Quarter = %d\n", findQuarter(p3));
    printf("Quarter = %d\n", findQuarter(p4));

    return 0;
}