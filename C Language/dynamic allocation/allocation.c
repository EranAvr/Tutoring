#include <stdio.h>


int main() {

    /*
        A word on memory allocation's pointers-
        Memory is referenced by an address, and address is defined by the OS,
        that's why all pointers have the same size.
        The type (int, char etc..) of the pointer is for defining operations
        per type.

        The malloc/calloc functions return a void* pointer,
        Which is a pointer of type void.
        Void is an empty data type, and that is the type of the allocated data
        before we use it.
        We should always cast the returned pointer to a proper type.
    */
    int x = 3 + 5;
    int* ptr = &x;

    char c;
    char* ptr2 = &c;

    // size of pointers:
    printf("sizeof(ptr) = %d\n", sizeof(ptr));
    printf("sizeof(ptr2) = %d\n", sizeof(ptr2));

    void* vPtr1 = &x;
    void* vPtr2 = &c;

    printf("sizeof(vPtr1) = %d\n", sizeof(vPtr1));
    printf("sizeof(vPtr2) = %d\n", sizeof(vPtr2));

    return 0;
}