#include <stdio.h>
#include <stdlib.h>


int main()
{
    // יצירת מערך חדש
    size_t len = 5;
    char* arr = (char*) malloc(len * sizeof(char));
    printf("OG arr = %p\n", arr);
    for (size_t i = 0; i < len; i++)
    {
        arr[i] = '@';
    }


    // הגדלת המערך
    len = 1000;
    arr = (char*) realloc(arr, len * sizeof(char));
    for (size_t i = 5; i < len; i++)
    {
        arr[i] = '#';
    }

    for (size_t i = 0; i < len; i++)
    {
        printf("%p => %c\n", arr+i, *(arr+i));
    }

    // שחרור זיכרון
    free(arr);
    arr = NULL;
}