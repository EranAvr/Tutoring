package com.exercise;

public class MyBetterList<T> {

    private MyNode<T> head;
    private int size;

    public MyBetterList() {
        this.head = null;
        this.size = 0;
    }


    public boolean isEmpty(){
        return this.head == null;
    }

    public int getSize() {
        return size;
    }

    public MyNode<T> getFirst(){
        return this.head;
    }
    public MyNode<T> getPosition(T value){
        MyNode<T> temp = getFirst();
        while ((temp != null) && (temp.getInfo() != value))
            temp = temp.getNext();

        return temp;
    }
    public MyNode<T> getTail(){
        MyNode<T> temp = getFirst();
        while ( temp.getNext() != null )
            temp = temp.getNext();

        return temp;
    }
    public MyNode<T> insert(MyNode<T> pos, T value){
        MyNode<T> temp = new MyNode<>(value);

        if (pos == null){
            temp.setNext(this.head);
            this.head = temp;
        }
        else {
            temp.setNext(pos.getNext());
            pos.setNext(temp);
        }

        this.size++;
        return temp;
    }
    public MyNode<T> remove(MyNode<T> pos){
        MyNode<T> prevNode = getFirst();
        while ((prevNode != null) && (prevNode.getNext() != pos))
            prevNode = prevNode.getNext();

        if (prevNode != null)
            prevNode.setNext(pos.getNext());


        MyNode<T> nextNode = pos.getNext(); // retrieve next node to pos.
        pos.setNext(null);  // to disconnect pos from original list.

        this.size--;
        return nextNode;
    }

    public String toString(){
        String res = "[";

        MyNode<T> temp = getFirst();
        while ((temp != null)){
            res += temp.getInfo() + ",";
            temp = temp.getNext();
        }
        res += "]";

        return res;
    }





    public static void main(String[] args) {
        MyBetterList<Integer> lst = new MyBetterList<>();
        lst.insert(null, 1);
        lst.insert(null, 2);
        lst.insert(null, 3);

        System.out.println(lst);

        MyNode<Integer> nodeToRemove = lst.getPosition(2);
        lst.remove(nodeToRemove);

        System.out.println(lst);
    }
}
