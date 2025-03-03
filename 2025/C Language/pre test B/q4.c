#include <stdlib.h>
#include <string.h>

/*
    שאלה 4
    מבחן מועד א
*/
// a)
struct Student {
    char name[20];
    int* grades;
    float avg;
};

// b)
struct Student* createStudent(char name[20]){
    // check if length of name is 20 (at most)
    // create struct on heap-
    struct Student* newStudent = (struct Student*) malloc(sizeof(struct Student));
    // copy name string-
    strcpy(newStudent->name, name);
    // return pointer-
    return newStudent;
}

// c)
void addGrades(int* grades, int len, struct Student* std){
    // create new int array-
    int* newArray = (int*) calloc(len, sizeof(int));
    // copy from 'grades' array-
    for (int i=0; i<len; i++){
        //newArray[i] = grades[i];
        *(newArray+i) = *(grades+i);
    }
    // put new array address into std->grades -
    std->grades = newArray;
}

// d)
void deleteStudent(struct Student* std){
    free(std->grades);
    free(std);
    // std = NULL;
}