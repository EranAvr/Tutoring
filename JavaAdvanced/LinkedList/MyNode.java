package com.exercise;

public class MyNode<T> {
    private T info;
    private MyNode<T> next;

    public MyNode(T t){
        this.info = t;
        this.next = null;
    }
    public MyNode(MyNode<T> other){
        this.info = other.getInfo();
        this.next = other.getNext();
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public MyNode<T> getNext() {
        return next;
    }

    public void setNext(MyNode<T> next) {
        this.next = next;
    }
}
