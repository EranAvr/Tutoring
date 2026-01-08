#include <stdio.h>

/*
    ex1
    כתבו פונ' המקבלת מחרוזת כפרמטר,
    ומחזירה מס' שלם חיובי של אורך המחרוזת.
    הפונ' לא סופרת את תו הסיום \0
*/

/*
    ex2
    ממשו את הפונ' toUpper של שפת ג'אווה.
    הפונ' מקבלת מחרוזת, וממירה את כל האותיות הקטנות
    שבה לאותיות גדולות.
    שימו לב! הפונ' צריכה לשנות את המחרוזת המקורית.
*/

/*
    ex3
    ממשו את הפונ' replace
    הפונ' מקבלת כפרמטרים:
    char str[]
    char c
    char n
    הפונ' תחליף במחרוזת את כל התוים ששוים ל c
    בתו החדש n
*/

/*
    ex4
    כתבו פונ' המקבלת 2 מחרוזות באופן הבא:
    char* word
    char* text
    הפונ' תבדוק האם המחרוזת word
    מוכלת בתוך המחרוזת text.
    המחרוזת word צריכה להופיע באופן מדוייק
*/


// prototype - אבטיפוס
size_t strLength(char* str);
void toUpper(char* str);
void replace(char* str, char c, char n);


int main(){
    char* s1 = "123456";
    size_t len1 = strLength(s1);
    printf("len1 = %d\n", len1);

    char s2[] = "AaBb@5CcDd";
    toUpper(s2);
    printf("s2 = %s\n", s2);

    return 0;
}


// implementation - מימוש
size_t strLength(char* str){
    size_t count = 0;
    /*for (char* ptr = str; *ptr != '\0'; ptr++)
    {
        count++;
    }*/
   while (str[count] != '\0')
    count++;
   
    return count;
}

void toUpper(char* str){
    for (char* ptr = str; *ptr != '\0'; ptr++)
    {
        if (*ptr >= 'a' && *ptr <= 'z')
        {
            *ptr -= 32;
        }
    }
}

void replace(char* str, char c, char n){
    for (char* ptr = str; *ptr != '\0'; ptr++)
    {
        if (*ptr == c)
            *ptr = n;
    }
}