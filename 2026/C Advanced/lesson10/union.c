#include <stdio.h>

union ID
{
    int num_id;
    char char_id;
};


int main(int argc, char const *argv[])
{
    union ID myId;
    printf("int: %d, char: %c\n", myId.num_id, myId.char_id);

    myId.num_id = 123456;
    printf("int: %d, char: %c\n", myId.num_id, myId.char_id);
    
    myId.char_id = '#';
    printf("int: %d, char: %c\n", myId.num_id, myId.char_id);
}