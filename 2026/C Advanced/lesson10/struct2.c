#include <stdio.h>

/*
    מבנה מגדיר תבנית ריקה של טיפוס נתונים.
    הגדרת המבנה לא מפנה שום זיכרון ממשי.
    רק כאשר ניצור משתנים מטיפוס זה,
    המחשב יפנה זיכרון בהתאם לשדות שתיארנו במבנה.
*/
struct User {
    char name[20];
    int age;
    int grades[3];
};
struct Order
{
    int id;
    float price;
    char address[30];
};


void printUser(struct User u);

struct Order createOrder(int id, float p);
void makeDiscount(struct Order* o);



int main(int argc, char const *argv[])
{
    struct User u1; // רק כאשר ניצור משתנה - מוקצה זיכרון פיזי עבור השדות שלו
    // נשים לב, שבתחביר הנ"ל המשתנה מוקצה ב-stack

    /*u1.age = 35;
    scanf("%s", u1.name);
    size_t len = sizeof(u1.grades) / sizeof(int);
    for (size_t i = 0; i < len; i++)
    {
        scanf("%d", u1.grades+i);
    }
    
    printUser(u1);*/

    /////////////////////////////////////


    /*struct Order o1;
    o1.id = 123456;
    scanf("%f", &o1.price);
    scanf("%s", o1.address);
    printf("ID: %d \t Price: %f \t Address: %s\n", o1.id, o1.price, o1.address);
    */
   struct Order o1 = createOrder(123456, 102.5);
   makeDiscount(&o1);
   printf("%f", o1.price);


    return 0;
}



void printUser(struct User u){
    printf("Age: %d \t Name: %s\n", u.age, u.name);
    size_t len = sizeof(u.grades) / sizeof(int);
    for (size_t i = 0; i < len; i++)
    {
        printf("%d ", u.grades[i]);
    }
}
/////////////////////////////////////////////
struct Order createOrder(int id, float p){
    struct Order o;
    o.id = id;
    o.price = p;

    return o;
}
void makeDiscount(struct Order* o){
    o->price = o->price * 0.9;
}