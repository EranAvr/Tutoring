#include <stdio.h>
#include <string.h>



int main(int argc, char const *argv[])
{
    for (size_t i = 0; i < argc; i++)
    {
        printf("argv[%d] = %s\n", i, argv[i]);
    }

    if (strcmp(argv[1], "Eran") == 0)
    {
        printf("I see it's really you");
    }
    


    
    
    return 0;
}
