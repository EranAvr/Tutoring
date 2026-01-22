#include <stdio.h>
#include <stdlib.h>

struct Song{
    char title[30];
    float length;
};


void printSong(struct Song* sPtr);
struct Song* createSong();


int main()
{

    struct Song* songPtr = createSong();
    printSong(songPtr);

    free(songPtr);

    return 0;
}


void printSong(struct Song* sPtr){
    printf("Name: %s\n", sPtr->title);
    printf("Length: %f\n", sPtr->length);
}
struct Song* createSong(){
    struct Song* songPtr = (struct Song*) malloc(sizeof(struct Song));
    scanf("%s", songPtr->title);
    scanf("%f", &songPtr->length);

    return songPtr;
}