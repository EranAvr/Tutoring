#include <stdio.h>

// Prototypes:
int addTwoNumbers(int, int);
void changeValue(int n);
int reallyChangeValue(int n);
int giveMeID();

// function with body:
void hello(){
    printf("Hello World!\n");
}

int global = 1;

int main(){

    hello();

    int result = addTwoNumbers(3, 5);
    printf("result = %d\n", result);


    int num = 1;
    changeValue(num);
    printf("num = %d\n", num);

    num = reallyChangeValue(num);
    printf("num = %d\n", num);
    
    if (1) {
        num = 20;
        int newNumber = 100;
    }
    // newNumber = 200; // compilation error


    int user1 = giveMeID();
    int user2 = giveMeID();
    int user3 = giveMeID();
    printf("user ID 1: %d\n", user1);
    printf("user ID 2: %d\n", user2);
    printf("user ID 3: %d\n", user3);

    return 0;
}

int addTwoNumbers(int a, int b){
    // return a + b;
    int sum = a + b;
    return sum;
}
void changeValue(int n){
    n = 10;
}
int reallyChangeValue(num){
    return num * 2;
}
int giveMeID(){
    static int id = 0;
    return ++id;
}