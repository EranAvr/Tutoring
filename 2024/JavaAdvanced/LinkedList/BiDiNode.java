package com.exercise;

public class BiDiNode<T> {

    private T info;
    private BiDiNode<T> next;
    private BiDiNode<T> prev;

    public BiDiNode(T value){
        this.info = value;
        this.next = null;
        this.prev = null;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public BiDiNode<T> getNext() {
        return next;
    }

    public void setNext(BiDiNode<T> next) {
        this.next = next;
    }

    public BiDiNode<T> getPrev() {
        return prev;
    }

    public void setPrev(BiDiNode<T> prev) {
        this.prev = prev;
    }
}
