#include <stdio.h>
#include <stdlib.h>



int main(){
    /*  Malloc  */
    // דוגמא רק כדי להדגים תחביר
    int* arr = (int*) malloc(10 * sizeof(int));  // allocate memory from computer
    printf("sizeof(arr) = %d\n", sizeof(arr));  // זה יתן את גודל המשתנה-מצביע! לא את גודל המערך
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    arr[3] = 4;
    for (int i=0; i<4; i++){
        printf("arr[%d] = %d\n", i, arr[i]);
    }
    /*
        פה נעשה פעולות שונות על הזיכרון שקיבלנו
        רק אחרי שסיימנו איתו לחלוטין - נבצע שחרור של הזיכרון
    */
    free(arr);  // free memory back to the computer


    // דוגמא דינאמית לחלוטין
    /*printf("Enter number of cells in array:\n");
    size_t length;
    scanf("%d\n", &length);
    char* a = (char*) malloc(length * sizeof(char)); // בהקצאה דינאמית
    
    for (int i=0; i<length; i++){
        scanf("%c", a+i);
        //scanf("%c", &a[i]);
    }
    for (int i=0; i<length; i++){
        printf("a[%d] = %c\n", i, a[i]);
    }

    free(a);    // שחרור זיכרון דינאמי*/



    /*  Calloc  */
    int* ptr = (int*) calloc(4, sizeof(int));   // הקצאה שינאמית
    for (int i=0; i<4; i++){
        printf("ptr[%d] = %d\n", i, ptr[i]);
    }
    free(ptr);  // שחרור זיכרון דינאמי
    ptr = NULL;
    /*
        אמנם שחררנו את הזיכרון ש-ptr
        מצביע עליו, אבל המשתנה עדיין מחזיק בכתובת
        כלומר, אסור לבצע שחרור כפול על אותו מצביע.
        הדבר יגרום לשחרור זכרון עבור תוכנית אחרת.

        נרצה להשים בפויינטר ערך NULL
    */



   /* Realloc  */
   char* characters = (char*) calloc(3, sizeof(char));
   characters[0] = 'a';
   characters[1] = 'b';
   characters[2] = 'c';
   for (int i=0; i<3; i++){
        printf("characters[%d] = %c\n", i, characters[i]);
    }

    characters = (char*) realloc(characters, 6*sizeof(char));
    characters[3] = '#';
    characters[4] = '$';
    characters[5] = '*';
    for (int i=0; i<6; i++){
        printf("new characters[%d] = %c\n", i, characters[i]);
    }

    free(characters);
    characters = NULL;

   

    return 0;
}