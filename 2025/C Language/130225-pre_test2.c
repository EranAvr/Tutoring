#include <stdio.h>
#include <stdlib.h>
#include <string.h>


// Structs
struct User {
    int password;
    char name[10];
};

int main(){
    // Dynamic allocation
    // 1. נשאל את המשתמש מה כמות הערכים לקליטה
    /*int num;
    printf("Enter number of elements:");
    scanf("%d", &num);
    printf("Entered: %d\n", num);

    // 2. נקצה דינאמית מערך באורך מתאים
    int* ptr = (int*) calloc(num, sizeof(int));

    // 3. נקלוט ערכים למערך עפ"י המספר שנתן המשתמש
    for (size_t i = 0; i < num; i++){
        scanf("%d", ptr+i);
    }
    for (size_t i = 0; i < num; i++){
        printf("Element in index %d = %d\n", i, ptr[i]);
    }
    
    // 4. שחרור של זכרון שקיבלנו
    free(ptr);*/


    // Structs

    struct User user1;
    user1.password = 123;
    strcpy(user1.name, "James");

    struct User user2;
    user2.password = 999;
    strcpy(user2.name, "Dave");
    //user2.name = user1.name;

    printf("User 1: %s, %d\n", user1.name, user1.password);
    printf("User 2: %s, %d\n", user2.name, user2.password);
    
    struct User* userPtr;
    userPtr = (struct User*) malloc(sizeof(struct User));

    userPtr->password = 111;
    strcpy(userPtr->name, "Bob");
    printf("User 3: %s, %d\n", userPtr->name, userPtr->password);

    struct User user4 = {555, "Jeff"};
    

    return 0;
}