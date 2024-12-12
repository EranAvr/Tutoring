package com.exercise;

public class BiDiList<T> {
    BiDiNode<T> head;
    BiDiNode<T> tail;

    public BiDiList(){
        // Initializing empty list-
        this.head = null;
        this.tail = null;
    }


    public boolean isEmpty(){
        return head == null;
    }
    public BiDiNode<T> getFirst(){
        return this.head;
    }
    public BiDiNode<T> getLast(){
        return this.tail;
    }


    /* TRAVERSING THE LIST: */
    public BiDiNode<T> getPosition(T value){
        BiDiNode<T> temp = head;
        while (temp != null && temp.getInfo() != value)
            temp = temp.getNext();

        return temp;
    }


    /* ADD NEW ELEMENT */
    public BiDiNode<T> insert(BiDiNode<T> pos, T value){
        // 1. We check whether to insert node to the head of the list, or else...
        // 2. We write the insertion algorithm in separate methods.
        //  NOTICE! That way, we can handle 'tail' reference separately.

        BiDiNode<T> temp = new BiDiNode<>(value);   // new node we want to insert

        if (pos == null){     // first node insertion
            insertAtBeginning(temp);
        }
        else {     // insert to middle/end of the list
            if (pos == tail){
                insertAtEnd(temp);
            }
            else {
                insertInBetween(pos, temp);
            }
        }

        return temp;    // return new node
    }
    private void insertAtBeginning(BiDiNode<T> newNode){
        if (head == null)   // if newNode is the first element, we need to set it as the list's tail too!
            tail = newNode;

        newNode.setNext(head);    // connect new node to the rest of the list
        head = newNode;   // make new node the new head of the list

        // If a second node exists (the former head of the list),
        // connect it backwards-
        if (head.getNext() != null)
            head.getNext().setPrev(newNode);
    }
    private void insertAtEnd(BiDiNode<T> newNode){
        // A simple insertion. Just connect current tail to newNode,
        // and connect newNode backward to current tail.
        tail.setNext(newNode);
        newNode.setPrev(tail);
        // Now, save newNode as new tail of the list-
        this.tail = newNode;
    }
    private void insertInBetween(BiDiNode<T> pos, BiDiNode<T> newNode){
        pos.getNext().setPrev(newNode);
        newNode.setPrev(pos);

        newNode.setNext(pos.getNext());
        pos.setNext(newNode);

        // Note: here, we don't need to take care the tail reference.
    }


    /* REMOVE ELEMENT */
    public BiDiNode<T> remove(BiDiNode<T> pos){
        // 1. We check if node-to-delete is head, tail or in-between in the list.
        // 2. For each case, we handle 'head' and 'tail' references accordingly.

        if (pos == null || isEmpty())    // always good to make sure
            return null;

        if(pos == head){
            if(head == tail){   // there is only a single element in the list-
                head = null;
                tail = null;
            }
            else {  // there is more than one element, replace the list's head-
                head = pos.getNext();
            }

            // disconnect 'pos' from the original list-
            pos.setNext(null);
        }
        else if(pos == tail){
            // set new tail for the list-
            tail = tail.getPrev();
            // disconnect list from pos-
            tail.setNext(null);
            // disconnect pos from list (backwards)-
            pos.setPrev(null);
        }
        else {
            pos.getPrev().setNext(pos.getNext());
            pos.setNext(null);
            pos.setPrev(null);
        }

        return pos;
    }


    public String toString(){
        String result = "";

        BiDiNode<T> temp = head;
        while (temp != null){
            result += temp.getInfo();
            if (temp != tail)
                result += ", ";
            temp = temp.getNext();
        }

        return result;
    }





    public static void main(String[] args) {
        BiDiList<Integer> myBDList = new BiDiList<>();
        // Building the list: 1 -> 2 -> 3 -> 4 -> 5
        // using different insertion types:
        myBDList.insert(null, 3);
        myBDList.insert(null, 2);
        myBDList.insert(null, 1);
        myBDList.insert(myBDList.getLast(), 5);
        myBDList.insert(myBDList.getPosition(3), 4);

        System.out.println("Doubly Linked-List:: " + myBDList);

        // Remove tail-
        myBDList.remove(myBDList.getLast());
        System.out.println("After removing tail: " + myBDList);

        // Remove head-
        myBDList.remove(myBDList.getFirst());
        System.out.println("After removing head: " + myBDList);

        // Remove in the middle-
        myBDList.remove(myBDList.getPosition(3));
        System.out.println("After removing middle element: " + myBDList);
    }
}
