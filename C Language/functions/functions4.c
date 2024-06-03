#include <stdio.h>
#include <functions5_stat_func.h>


int global;
static int statGlobal;


void testStaticVar(){
    static int funcStatLocal = 0;   // this line will execute only a single time

    printf("%d\n", funcStatLocal++);    // this line will execute repeatedly
}


int main(){

    global = 1;
    statGlobal = 2;

    {
        int local;
        static int statLocal;
    }

    // Illegal-
    /*
        local = 3;
        statLocal = 4;
    */

   testStaticVar();
   testStaticVar();
   testStaticVar();
   testStaticVar();
   testStaticVar();
    
    printf("%d\n", statFunc());


    return 0;
}