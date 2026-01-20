#include <stdio.h>
#include <string.h>


struct User
{
    char type;  // 'A'=admin, 'S'=simple
    char name[20];
    int age;
};




int main(int argc, char const *argv[])
{

    struct User user1;
    
    user1.type = 'A';
    user1.age = 30;

    char tempName[] = "Some username aaaaaaaaaaaaaaaaaaa";
    strcpy(user1.name, tempName);

    printf("User: type=%c, name=%s, age=%d\n", user1.type, user1.name, user1.age);
}