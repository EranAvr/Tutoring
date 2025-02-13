#include <stdio.h>
#include <stdlib.h>
#include <string.h>


// Structs
struct Time{
    int hours;
    int minutes;
    int seconds;
};
struct Book{
    char title[30];
    char author[30];
    int price;
};


// Functions
void printTime(struct Time t){
    printf("%d:%d:%d\n", t.hours, t.minutes, t.seconds);
}

void printMostExpensive(struct Book b1, struct Book b2, struct Book b3){
    struct Book* winner;
    if(b1.price > b2.price){
        // b1 higher
        if (b1.price > b3.price){
            // b1 highest
            winner = &b1;
        }
        else {
            // b3 highest
            winner = &b3;
        }
    }
    else{
        // b2 higher
        if (b2.price > b3.price){
            // b2 highest
            winner = &b2;
        }
        else{
            // b3 highest
            winner = &b3;
        }
    }
    printf("%s, %s, %d\n", winner->title, winner->author, winner->price);
}

void printHighestAndLowest(struct Book arr[], size_t len){

    struct Book* highPtr = &arr[0];
    struct Book* lowPtr = &arr[0];
    for (int i=0; i<len; i++){
        if(arr[i].price > highPtr->price){
            highPtr = &arr[i];
        }
        if(arr[i].price < lowPtr->price){
            lowPtr = &arr[i];
        }
    }
    printf("Highest: %s, %s, %d\n", highPtr->title, highPtr->author, highPtr->price);
    printf("Lowest: %s, %s, %d\n", lowPtr->title, lowPtr->author, lowPtr->price);

}


int main(){

    // ex2
    /*
        Define a structure named Time with members
        hours, minutes, and seconds.
        Write a C program to input two times,
        add them, and display the result in proper time format.
    */
   struct Time time1 = {11, 12, 13};
   struct Time time2;
   time2.hours = 15;
   time2.minutes = 30;
   time2.seconds = 45;
   printTime(time1);
   printTime(time2);

   // ex3
   /*
    3. Create a structure named Book to store book 
    details like title, author, and price.
    Write a C program to input details for 3 books,
    find the most expensive and the lowest priced books,
    and display their information.
   */
    struct Book book1 = {"Moby-Dick", "Herman Melville", 635};
    struct Book book2 = {"The Hobbit", "J.R.R. Tolkien", 310};
    struct Book book3 = {"Don Quixote", "Miguel de Cervantes", 1072};
    printMostExpensive(book1, book2, book3);

    struct Book books[3] = {book1, book2, book3};
    size_t len = sizeof(books) / sizeof(books[0]);
    printf("len = %d\n", len);
    
    printHighestAndLowest(books, len);



    return 0;
}