#include <stdio.h>
#include <string.h>

struct Student
{
    int id;
    char name[10];
    char semester;
};

struct Worker
{
    int id;
    char name[15];
    float salary;
};

void displayWorker(struct Worker worker){
    printf("#%d, name=%s salary=%f\n", worker.id, worker.name, worker.salary);
}

struct Worker createNewWorker(int id,char name[15],float salary){
    struct Worker newWorker;
    newWorker.id = id;
    strcpy(newWorker.name, name);
    newWorker.salary = salary;

    return newWorker;
}

int main()
{
    // ---------------- Student -------------------------
    struct Student s1;
    s1.id = 1;
    strcpy(s1.name, "Bobby");
    s1.semester = 'c';

    struct Student s2;
    s2.id = 2;
    strcpy(s2.name, "Dave");
    s2.semester = 'b';

    printf("Student #%d, Name=%s, Semester=%c\n", s1.id, s1.name, s1.semester);
    printf("Student #%d, Name=%s, Semester=%c\n", s2.id, s2.name, s2.semester);


    // ---------------- Worker -------------------------
    struct Worker w1 = {123, "Bobby Mcgee", 10000};
    struct Worker w2 = {456, "Hajar", 20000};
    displayWorker(w1);
    displayWorker(w2);

    struct Worker w3, w4;
    w3 = createNewWorker(10, "Jeff", 1234.56);
    w4 = createNewWorker(20, "Alin", 89.67);
    displayWorker(w3);
    displayWorker(w4);


    // ---------------- Pointers -------------------------
    struct Student* studentPtr;
    studentPtr = &s1;
    printf("Pointer ID = %d\n", studentPtr->id);
    printf("Pointer Name = %s\n", studentPtr->name);
    printf("Pointer Semester = %c\n", studentPtr->semester);


    return 0;
}