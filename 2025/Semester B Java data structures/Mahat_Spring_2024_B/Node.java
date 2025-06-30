package Mahat_Spring_2024_B;

public class Node<T> {
    private T value;
    private Node<T> next;

    public Node(T x){
        this.value = x;
        this.next = null;
    }
    public Node(T x, Node<T> next){
        this.value = x;
        this.next = next;
    }

    public T getValue(){
        return this.value;
    }
    public Node<T> getNext(){
        return this.next;
    }
    public void setValue(T x){
        this.value = x;
    }
    public void setNext(Node<T> next){
        this.next = next;
    }

    public boolean hasNext(){
        return this.next == null;
    }
    public String toString(){
        return "Mahat_Spring_2024_A.Node value="+value+" next="+next;
    }

}
