#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Employee
{
    int id; // 4 bytes
    char name[5];   // 5 bytes
    float salary;   // 4 bytes
};

void displayEmployee(struct Employee* ptr){
    printf("id=%d name=%s salary=%f\n", ptr->id, ptr->name, ptr->salary);
}

void changeEmployee(struct Employee* ptr){
    int newId;
    scanf("%d", &newId);
    ptr->id = newId;

    char newName[5];
    scanf("%s", newName);
    strcpy(ptr->name, newName);

    float newSalary;
    scanf("%f", &newSalary);
    ptr->salary = newSalary;
}


int main()
{

    struct Employee e1;

    // ---------------- sizeof structs -------------------------
    printf("size of Employee = %d\n", sizeof(e1));  // output 16
    /*
        הקומפיילר מייצר ריפוד של אקסטרה זיכרון בין המשתנים.
        לכן, לא נרצה לדלג מצביע לפי כתובות בתוך המבנה.
        נעדיף תמיד להשתמש באופרטור "חץ" לפנייה אל שדות המבנה.
    */


    // ---------------- Structs on Heap -------------------------
    struct Employee* empPtr;
    empPtr = (struct Employee*) calloc(1, sizeof(struct Employee));
    empPtr->id = 1;
    strcpy(empPtr->name, "Ben");
    empPtr->salary = 3.14;

    displayEmployee(empPtr);
    
    changeEmployee(empPtr);
    
    displayEmployee(empPtr);

    free(empPtr);



    // ---------------- Array of structs -------------------------
    

    return 0;
}