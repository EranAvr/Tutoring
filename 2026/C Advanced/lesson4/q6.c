#include <stdio.h>

/*
יש ליצור קבוע בשם PASWORD עם ערך מספרי כרצונכם.
יש לקלוט מס' שלמים עד אשר יקלט ערך הזהה
ל-PASSWORD.
יש להוציא הודעות בהתאם.
*/

#define PASSWORD 1234

int main() {
    int pass;
    do
    {
        scanf("%d", &pass);
    } while (pass != PASSWORD);
    printf("Success!");
    

    return 0;
}