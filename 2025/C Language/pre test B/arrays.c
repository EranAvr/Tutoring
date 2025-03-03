#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// ex1)
/*
    כתבו פונ' המקבלת מצביע אל מערך מספרים ואת האורך שלו.
    הפונ' תקצה מערך מספרים חדש בהקצאה דינאמית, ותמלא אותו
    בריבועים (חזקה 2) של המספרים במערך הנתון.
    הפונ' תחזיר מצביע אל המערך החדש.
*/
int* arrSqr(int* a, size_t len){
    // create new array-
    int* arr = (int*) calloc(len, sizeof(int));
    // calc squares-
    for (size_t i = 0; i < len; i++)
    {
        arr[i] = a[i] * a[i];
    }
    // return pointer-
    return arr;
}

// ex2)
/*
    כתבו פונ' המקבלת מערך מספרים שלמים ואת האורך שלו.
    הפונ' תקצה מערך מספרים שלמים חדש בהקצאה דינאמית, ותמלא אותו
    בשורשים של המספרים מהמערך הנתון.
    עבור מס' חיובי - נחשב את השורש שלו ונכניס למערך החדש,
    אבל עבור מס' שלילי או מס' ללא שורש שלם - נכניס למערך החדש את הערך מינוס אחד (-1)
    הפונ' תחזיר מצביע אל המערך החדש שיצרנו.
*/
// 5 * 5 = 25
// sqr(25) = 5
int* calcSqrs(int* a, size_t len){
    // create new array on heap-
    int* newArray = (int*) calloc(len, sizeof(int));
    // search for squares-
    for (size_t i = 0; i < len; i++)    // for every element in a
    {
        if (a[i] < 0)
        {
            newArray[i] = -1;
            continue;
        }
        
        //int flag = 0;   // אין שורש
        newArray[i] = -1;
        for (size_t j = 1; j < a[i]; j++)  // search sqr in options
        {
            if (j * j == a[i])  // found sqr
            {
                newArray[i] = j;
                //flag = 1;
            }
        }
        /*if (flag == 0)  // לא נמצא שורש
        {
            newArray[i] = -1;
        }*/
    }
    // return pointer-
    return newArray;
}

// ex3)
/*
    כתבו פונ' בשם isdigit
    אשר מקבלת מצביע אל מחרוזת.
    הפונ' תחזיר ערך בוליאני באופן הבא:
    אם המחרוזת מורכבת רק מספרות - הפונ' תחזיר true
    אם המחרוזת מכילה סימנים אחרים (מלבד ספרות) - הפונ' תחזיר false
*/
int isdigit(char* str){
    while (*str != '\0')
    {
        if (*str < '0' || *str > '9')
        {
            return 0;
        }
        str++;
    }
    return 1;
}


void printArray(int* arr, size_t len){
    for (size_t i = 0; i < len; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int main(){
    int a1[5] = {1,2,-4,5,-10};
    int* sqA1 = arrSqr(a1, 5);
    printArray(sqA1, 5);
    free(sqA1);


    int a2[] = {9, 16, 25, -100, 64, 15};
    int* sqA2 = calcSqrs(a2, 6);
    printArray(sqA2, 6);
    free(sqA2);

    return 0;
}