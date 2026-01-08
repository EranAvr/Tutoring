#include <stdio.h>
#include <stdlib.h>

int main()
{
    // יצירת מערך עם גודל ראשוני
    int len = 5, count = 0;
    int* arr = (int*) malloc(len * sizeof(int));

    // קליטת נתונים והגדלת המערך
    // בכל פעם שנדרש
    while (1)
    {
        // קליטה
        int x;
        scanf("%d", &x);
        if (x == -1)
        {
            break;
        }
        
        // שמירת ערך חדש
        arr[count++] = x;

        // הגדלת מערך
        if (count == len)
        {
            len += 5;
            arr = (int*) realloc(arr, len * sizeof(int));
        }
    }

    for (size_t i = 0; i < count; i++)
    {
        printf("%p => %d\n", arr+i, arr[i]);
    }
    
    // שחרור זיכרון
    free(arr);
    arr = NULL;

    return 0;
}
