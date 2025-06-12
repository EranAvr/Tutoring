package Mahat_Spring_2024_A;


import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // ex1a
        // מימוש למטה
        // ex1b
        // Complexity: O(n)

        // ex2a
        // מימוש למטה
        // ex2b
        // Complexity: O(n)

        // ex3a
        // מימוש למטה
        // ex3b
        // Complexity: O(n^2)

        // ex5a
        /*
            s = {4, 6, 3, 1, 4, 1, 4, 1}

            s                           x   y => x<y    found   temp2
            ----------------------------------------------------------
            {4, 6, 3, 1, 4, 1, 4, 1}                    false
            {6, 3, 1, 4, 1, 4, 1}       4   6   true    true
            {3, 1, 4, 1, 4, 1}          6   -   false   false   {6}
            {1, 4, 1, 4, 1}             3   4   true    true
            {4, 1, 4, 1}                1   4   true    true
            {1, 4, 1}                   4   -   false   false   {4, 6}
            {4, 1}                      1   4   true    true
            {1}                         4   -   false   false   {4, 4, 6}
            {}                          1   -   -       false   {1, 4, 4, 6}

            Result:
            s = {6, 4, 4, 1}
         */
        // ex5b
        /*
            s = {5,4,3,2,1}
            הערכים שנפלו מהמחסנית המקורית הם כל המספרים
            שאחריהם מצאנו מספר שגדול מהם.
            לכן, עבור מחסנית בסדר יורד,
            לכל מספר לא יהיו אחריו מספרים גדולים יותר.
        */
        // ex5c
        /*
            הפונקציה what מוחקת מהמחסנית את כל המספרים,
            שאחריהם הופיע מספר כלשהו שגדול מהם
         */

        // ex6a
        // מימוש למטה

    }


    // Methods:
    public static boolean isUniform(Stack<Integer> st){
        int x = st.pop() % 2;

        while (!st.isEmpty()){
            if (st.pop() % 2 != x)
                return false;
        }
        return true;
    }

    // ex2
    public static int removeLast(Queue<Integer> st){
        Queue<Integer> helper = new ArrayDeque<>();
        int count = 0;

        while (!st.isEmpty()){
            helper.add(st.remove());
            count++;
        }
        for (int i = 0; i < count - 1; i++) {
            st.add(helper.remove());
        }

        return helper.remove();
    }

    // ex3
    public static boolean uniqNeg(Node<Integer> chain){

        while (chain != null){  // מצביע אל ערך "עוגן" נבדק

            Node<Integer> chain2 = chain.getNext();
            while (chain2 != null){
                if(chain.getValue() < 0 &&
                        chain.getValue() == chain2.getValue()){
                    return false;
                }
                chain2 = chain2.getNext();
            }

            chain = chain.getNext();
        }
        return true;
    }

    // ex6a
    public static boolean startWith(Queue<Integer> q1,
                                    Queue<Integer> q2){
        while (!q1.isEmpty()){
            if (q1.remove() != q2.remove())
                return false;
        }
        return true;
    }
}
