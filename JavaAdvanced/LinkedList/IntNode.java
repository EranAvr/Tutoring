package com.example.MyLinkedList;

public class IntNode {
    private int value;
    private IntNode next;

    // Constructors:
    public IntNode(int v){
        this.value = v;
        this.next = null;
    }
    public IntNode(int v, IntNode nxt){
        // We don't need to define 'value' here again.
        // Instead of duplicating code, we can use
        // the existing constructor above by calling 'this(v)'.
        this(v);
        this.next = nxt;
    }

    // Copy constructor:
    public IntNode(IntNode node){
        this.value = node.value;
        this.next = node.next;
    }


    // Getters and Setters:
    public int getValue(){
        return this.value;
    }
    public void setValue(int v){
        this.value = v;
    }

    public IntNode getNext(){
        return this.next;
    }
    public void setNext(IntNode nxt){
        this.next = nxt;
    }

    // Override the 'toString()' method
    // Now we can print this object to the screen,
    // and see the following string-
    public String toString(){
        return "["+value+", "+next+"]";
    }
}
