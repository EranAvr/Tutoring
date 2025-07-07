package Mahat_Summer_2023_A;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        // ex1c
        /*
            a) O(n)
            b) O(n)
         */
    }








    // Methods
    // ex1a
    public static int putInPlace(Queue<Integer> q, int num){
        Queue<Integer> smaller = new ArrayDeque<>();
        Queue<Integer> bigger = new ArrayDeque<>();
        // מרוקנים תור מקורי אל תורי עזר
        while (!q.isEmpty()){
            if (q.peek() < num)
                smaller.add(q.remove());
            else if (q.peek() >= num)
                bigger.add(q.remove());
        }
        // מחזירים לפי הסדר
        int count = 0;
        while (!smaller.isEmpty()){
            q.add(smaller.remove());
            count++;
        }
        q.add(num); // מוסיפים את num עצמו
        while (!bigger.isEmpty())
            q.add(bigger.remove());

        return count + 1;
    }
    // ex1b
    public static void moveToFront(Queue<Integer> q, int k){
        Queue<Integer> helper = new ArrayDeque<>();
        int size = 0;
        // ספירת איברים בתור
        while (!q.isEmpty()){
            helper.add(q.remove());
            size++;
        }
        // שחזור התור המקורי
        while (!helper.isEmpty())
            q.add(helper.remove());

        // האלגוריתם שלנו בפועל-
        for (int i = 0 ; i < size-k; i++)
            q.add(q.remove());
    }

    // ex2a
    public static void order(BinNode<Integer> chain){
        // מכיוון שלא ניתן להפנות מחדש את ראש השרשרת
        // מתוך פונ', עלינו להזיז ערכים בין החוליות
    }
}
