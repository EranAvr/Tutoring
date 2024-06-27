package com.Mahat;

interface  Able{
    void inter();
}
class Base{
    public void basing(){
        System.out.println("Base say: basing");
    }
}
class Derived extends Base implements Able{
    public void driving(){
        System.out.println("Derived say: driving");
    }
    public void basing(){
        System.out.println("Derived say: basing");
    }
    public void inter(){
        System.out.println("Derived say: inter");
    }

}
public class Test {
    public static void main(String[] args) {
        Able obj = new Derived();
        ((Derived)obj).driving();
    }
}
