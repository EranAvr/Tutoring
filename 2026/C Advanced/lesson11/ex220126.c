#include <stdio.h>

struct Student
{
    char name[30];
    int grades[5];
    struct Student* bff;
};


void printStudent(struct Student s);
struct Student createStudent(struct Student* bFriend);


int main(int argc, char const *argv[])
{
    struct Student avi;
    scanf("%s", avi.name);
    for (size_t i = 0; i < 5; i++)
    {
        scanf("%d ", &avi.grades[i]);
    }

    struct Student bobby;
    scanf("%s", bobby.name);


    avi.bff = &bobby;
    printStudent(avi);
    
    

    return 0;
}


void printStudent(struct Student s){
    printf("Name: %s\n", s.name);
    for (size_t i = 0; i < 5; i++)
    {
        printf("%d ", s.grades[i]);
    }
    printf("\n");
    printf("Best friend: %s\n", s.bff->name);
}

struct Student createStudent(struct Student* bFriend){
    struct Student s;
    scanf("%s", s.name);
    for (size_t i = 0; i < 5; i++)
    {
        scanf("%d ", &s.grades[i]);
    }
    s.bff = bFriend;

    return s;
}