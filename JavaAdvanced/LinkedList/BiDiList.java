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
        return this.head == null;
    }
    public BiDiNode<T> getFirst(){
        return this.head;
    }
    public BiDiNode<T> getLast(){
        return this.tail;
    }

    public BiDiNode<T> getPosition(T value){
        BiDiNode<T> temp = this.head;
        while (temp != null && temp.getInfo() != value)
            temp = temp.getNext();

        return temp;
    }
    public BiDiNode<T> insert(BiDiNode<T> pos, T value){
        BiDiNode<T> temp = new BiDiNode<>(value);

        if (pos == null){     // first node insertion
            this.head.getNext().setPrev(temp);
            temp.setPrev(null);

            temp.setNext(this.head);
            this.head = temp;


        }
        else {
            pos.getNext().setPrev(temp);
            temp.setPrev(pos);

            temp.setNext(pos.getNext());
            pos.setNext(temp);
        }

        return temp;
    }
    public BiDiNode<T> remove(BiDiNode<T> pos){

    }

    public String toString(){
    }





    public static void main(String[] args) {
    }
}
