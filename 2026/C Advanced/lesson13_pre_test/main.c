#include <stdio.h>


int haveNumber(const char* str){
    const char* start = str;
    while (*start != '\n')
    {
        const char* end = start;
        while(*end>='0' && *end<='9') end++;

        // The following conditions could be easily
        // merged down into fewer if statement
        if (start==str && *end=='\0')
            return 1;
        if (start==str && *end==' ')
            return 1;
        if (*(start-1)==' ' && *end=='\0')
            return 1;
        if (*(start-1)==' ' && *end==' ')
            return 1;

        start++;
    }
    return 0;
}

int main(int argc, char const *argv[])
{
    const char* strings[] = {
        "1234", // true
        "call 911", // true
        "take 3 bags", // true
        "20 is even", // false
        "abc32 e" // false
    };

    size_t len = sizeof(strings) / sizeof(char*);
    for (size_t i = 0; i < len; i++)
    {
        int res = haveNumber(strings[i]);
        printf("'%s'=%d\n", strings[i], res);
    }
    

    return 0;
}
