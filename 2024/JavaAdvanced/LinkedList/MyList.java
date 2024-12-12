package com.exercise;

public class MyList<T> {

    private MyNode<T> head;

    public MyList() {
        this.head = null;
    }


    public boolean isEmpty(){
        return this.head == null;
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
        MyList<Integer> lst = new MyList<>();
        lst.insert(null, 1);
        lst.insert(null, 2);
        lst.insert(null, 3);

        System.out.println(lst);
    }
}
