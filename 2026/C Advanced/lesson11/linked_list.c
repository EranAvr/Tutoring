#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int value;
    struct Node* next;
};


struct Node* createNode(int value);
void addValue(struct Node* list, int value);
void printList(struct Node*);


int main(){
    struct Node* list = createNode(1);
    
    addValue(list, 2);
    addValue(list, 3);
    addValue(list, 4);

    printList(list);

    return 0;

}


struct Node* createNode(int value){
    struct Node* list = (struct Node*) calloc(1, sizeof(struct Node));
    list->value = value;
    list->next = NULL;

    return list;
}
void addValue(struct Node* list, int value){
    while (list->next != NULL)
    {
        list = list->next;
    }
    list->next = createNode(value);
}
void printList(struct Node* list){
    while (list != NULL)
    {
        printf("%d ", list->value);
        list = list->next;
    }
}