#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// ex1)
/*
    כתבו מבנה המגדיר עובד בחנות.
    שם המבנה יהיה Employee
    המבנה יכיל את השדות הבאים:
    שם - מערך תוים בגודל 15
    משכורת ממוצעת - משתנה מטיפוס float
    משכורות אחרונות - מערך מספרים שלמים בגודל 3
*/
struct Employee{
    char name[15];
    float avg;
    int salaries[3];
};

// ex2)
/*
    כתבו פונקציה ליצירת משתנה מאותחל מטיפוס Employee
    הפונ' תיצור מבנה בהקצאה דינאמית ותחזיר מצביע אליו.
    הפונ' תקבל פרמטר מחרוזת עם שם העובד,
    ותעתיק אותו אל תוך השדה name.
    יש לבצע השמה של ערכי 0 אל שאר השדות.
*/
struct Employee* createEmployee(char name[15]){
    struct Employee* e = (struct Employee*) calloc(1, sizeof(struct Employee));
    strcpy(e->name, name);

    return e;
}

// ex3)
/*
    כתבו פונקציה המקבלת מצביע אל מבנה Employee.
    הפונ' תבצע הדפסה מסודרת למסך של כל שדות המבנה.
*/
void printEmployee(struct Employee* e){
    printf("Name=%s\nAverage=%f\n", e->name, e->avg);
    printf("Salaries: %d, %d, %d\n", e->salaries[0], e->salaries[1], e->salaries[2]);
}

// ex4)
/*
    כתבו פונ' אשר מקבלת פרמטרים כך:
    1) מצביע אל מבנה Employee
    2) מערך מספרים שלמים בגודל 3
    3) את גודל המערך
    הפונ' תעתיק את ערכי המערך המתקבל אל תוך השדה salaries
    שבמבנה-עובד שהתקבל כפרמטר.
    בנוסף, הפונ' תחשב את ממוצע 3 המשכורות ותשמור אותו בתוך
    השדה avg.
*/
void setSalaries(struct Employee* e, int* sals, int len){
    // copy salaries-
    for (int i=0; i<len; i++){
        e->salaries[i] = sals[i];
    }
    // calc average-
    float sum = 0;
    for (int i=0; i<len; i++){
        sum += sals[i];
    }
    e->avg = sum / len;
}

// ex5)
/*
    כתבו פונקציה המקבלת את הפרמטרים הבאים:
    1) מצביע אל מבנה-עובד קיים
    2) מחרוזת עם שם עובד חדש
    הפונ' תיצור עובד חדש עם השם שהתקבל,
    ותעתיק אליו את השדות avg, salaties
    מתוך העובד שהתקבל כפרמטר.
    הפונ' תחזיר מצביע אל העובד החדש שהוקצה.
*/
struct Employee* copyEmployee(struct Employee* src_e, char name[15]){
    struct Employee* e = createEmployee(name);
    e->avg = src_e->avg;

    /*size_t len = sizeof(e->salaries) / sizeof(int);
    for (size_t i = 0; i < len; i++)
    {
        e->salaries[i] = src_e->salaries[i];
    }*/
    memcpy(e->salaries, src_e->salaries, sizeof(e->salaries));
    return e;
}




int main(){
    struct Employee e1;
    printf("size = %d\n", sizeof(e1));
    printEmployee(&e1);

    struct Employee* e2 = createEmployee("Dave");
    printEmployee(e2);

    int arr[] = {10, 20, 30};
    setSalaries(e2, arr, 3);
    printEmployee(e2);

    struct Employee* e3 = copyEmployee(e2, "Jamie");
    printEmployee(e3);

    free(e2);
    free(e3);


    return 0;
}