#include <stdio.h>



int str_compare(const char* s1, const char* s2){
    /*
        ערך שלילי - מחרוזת ראשונה קטנה
        ערך חיובי - מחרוזת שניה קטנה
        ערך 0 - שתי המחרוזות שוות
    */
   int i = 0;
   while (s1[i] == s2[i] && s1[i] != '\0')
   {
    i++;
   }

   return s1[i] - s2[i];

}

int main(int argc, char const *argv[])
{
    char s1[15] = "Avraham";    // "Avraham\0"
    char s2[15] = "Avr";    // "Avi\0"


    printf("Result: %d\n", str_compare(s1, s2));


    return 0;
}
