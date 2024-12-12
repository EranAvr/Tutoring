package com.Mahat;

public class Node<T> {
    private T info;
    private Node<T> next;

    public Node(T t){
        this.info = t;
        this.next = null;
    }
    public Node(Node<T> other){
        this.info = other.getInfo();
        this.next = other.getNext();
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}