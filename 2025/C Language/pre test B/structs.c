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




int main(){
    

    return 0;
}