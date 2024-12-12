package com.Mahat;


class Testy{
    static int count = 0;
    int id;

    public Testy() {
        this.id = count++;
    }
}

public class Mid2024 {
    public static void main(String[] args) {
        Testy t1 = new Testy();
        Testy t2 = new Testy();

        System.out.println(t1.id);
        System.out.println(t2.id);

        System.out.println("Before: " + Testy.count);
        Testy.count += 1;
        System.out.println("After: " + Testy.count);

        System.out.println(t1.id * Testy.count);
        System.out.println(t2.id * Testy.count);


    }



    /*
    public static boolean check (BinTreeNode<Integer> t) {
        if (t==null)
            return true;
        if (t.getLeft() != null)
            if ( t.getValue() % 10 != (t.getLeft().getValue()) )
                return false;

        if (t.getRight() != null)
            if ( t.getValue() % 10 != (t.getRight().getValue()) )
                return false;

       return check (t.getLeft()) && check (t.getRight());
    }*/

}
