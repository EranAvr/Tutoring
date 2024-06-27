package com.Mahat;

import com.Mahat.Node;

public class List<T> {

    private Node<T> head;

    public List() {
        this.head = null;
    }


    public boolean isEmpty(){
        return this.head == null;
    }
    public Node<T> getFirst(){
        return this.head;
    }
    public Node<T> getPosition(T value){
        Node<T> temp = getFirst();
        while ((temp != null) && (temp.getInfo() != value))
            temp = temp.getNext();

        return temp;
    }
    public Node<T> insert(Node<T> pos, T value){
        Node<T> temp = new Node<>(value);

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
    public Node<T> remove(Node<T> pos){
        Node<T> prevNode = getFirst();
        while ((prevNode != null) && (prevNode.getNext() != pos))
            prevNode = prevNode.getNext();

        if (prevNode != null)
            prevNode.setNext(pos.getNext());


        Node<T> nextNode = pos.getNext(); // retrieve next node to pos.
        pos.setNext(null);  // to disconnect pos from original list.
        return nextNode;
    }

    public String toString(){
        String res = "[";

        Node<T> temp = getFirst();
        while ((temp != null)){
            res += temp.getInfo() + ",";
            temp = temp.getNext();
        }
        res += "]";

        return res;
    }





    public static void main(String[] args) {
        List<Integer> lst = new List<>();
        lst.insert(null, 1);
        lst.insert(null, 2);
        lst.insert(null, 3);

        System.out.println(lst);



    }
}
