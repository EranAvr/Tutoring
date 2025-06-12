package Mahat_Spring_2024_A;

public class BinNode<T> {
    private T value;
    private BinNode<T> left;
    private BinNode<T> right;

    public BinNode(T x){
        this.value = x;
    }
    public BinNode(BinNode<T> left, T x, BinNode<T> right){
        this.left = left;
        this.value = x;
        this.right = right;
    }

    public boolean hasLeft(){
        return this.left != null;
    }
    public boolean hasRight(){
        return this.right != null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public BinNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinNode<T> left) {
        this.left = left;
    }

    public BinNode<T> getRight() {
        return right;
    }

    public void setRight(BinNode<T> right) {
        this.right = right;
    }
}
