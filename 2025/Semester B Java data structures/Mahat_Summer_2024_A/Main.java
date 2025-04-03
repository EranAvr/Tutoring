package Mahat_Summer_2024_A;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //String res = true ? "OK" : "Error";

        // ex1a:
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(0);
        st.push(-1);
        System.out.println(isBalanced(st));


        // ex1b:
        // Complexity = O(n)


        // ex2b
        // Complexity = O(n)


        // ex3c
        // Complexity = O(n)


        // ex5a
        /*
            why(chain, false)

            p.value     f     count
            10          true    0
            7           false   1
            14          true    1
            5           false   2
            7           false   3
            2           true    3
            4           true    3
         */
        // ex5b
        /*
            שרשרת לפני השינוי:
            10 -> 7 -> 14 -> 5 -> 7 -> 2 -> 4
            שרשרת לאחר שינוי:
            10 ->3-> 7 ->3-> 14 ->2-> 5 ->2-> 7 ->2-> 2 ->0-> 4 ->0
         */
        // ex5c
        /*
            why() - count odd numbers if flag==false
                    count even numbers if flag==true
                    returns a new node with value of count
            what() - הפונקציה רצה על החוליות של השרשרת המקורית.
                    אחרי כל חוליה מקורית עם ערך זוגי - תדחף חוליה חדשה עם ספירת האי זוגיים בהמשך השרשרת
                    אחרי כל חוליה מקורית עם ערך אי זוגי - תדחף חוליה חדשה עם ספירת הזוגיים בהמשך השרשרת

         */

    }

    public static boolean isBalanced(Stack<Integer> st){
        Stack<Integer> helper = new Stack<>();
        int countNeg = 0;
        int countZero = 0;
        int countPos = 0;

        while (!st.isEmpty()){
            int x = st.pop();

            if (x < 0) countNeg++;
            else if (x > 0) countPos++;
            else countZero++;

            helper.push(x);
        }

        while (!helper.isEmpty()){
            st.push(helper.pop());
        }

        return countZero == countNeg && countZero == countPos;
    }

    public static int sizeOfQueue(Queue<Integer> q){
        Queue<Integer> helper = new ArrayDeque<>();
        int count = 0;

        while (!q.isEmpty()){
            helper.add( q.remove() );   // המתודה insert נקראת פה add
            count++;
        }

        while (!helper.isEmpty()){
            q.add(helper.remove());
        }

        return count;
    }

    public static void changeMiddle(Queue<Integer> q, int x, int y){
        int size = sizeOfQueue(q);
        Queue<Integer> helper = new ArrayDeque<>();
        int middle = size / 2;

        if (size % 2 == 0){ // זוגי
            for (int i=0; i<middle-1; i++){
                helper.add(q.remove());
            }
            helper.add(x);
            helper.add(y);
            q.remove();
            q.remove();
            while (!q.isEmpty()){
                helper.add(q.remove());
            }
        }
        else {  // אי זוגי
            for (int i=0; i<middle; i++){
                helper.add(q.remove());
            }
            Random rnd = new Random();
            helper.add(rnd.nextInt(x,y+1));
            q.remove();
            while (!q.isEmpty()){
                helper.add(q.remove());
            }
        }

        while (!helper.isEmpty()){
            q.add(helper.remove());
        }
    }

    // ex3a
    public static boolean isDownList (Node<Integer> chain){
        if (chain == null || chain.getNext() == null)
            return false;
        Node<Integer> first = chain;
        Node<Integer> second = chain.getNext();

        while (second.getNext() != null){
            if (Math.abs(first.getValue()- second.getValue()) != second.getNext().getValue()){
                return false;
            }
            first = second;
            second = second.getNext();
        }
        return true;
    }
    // ex3b
    public static Node<Integer> buildDown (int num, int a, int b){
        Node<Integer> chain = new Node<>(a, new Node<>(b));

        Node<Integer> pos1 = chain;
        Node<Integer> pos2 = chain.getNext();

        // חשוב להפחית 2 מהמספר num אחרי שיצרנו 2 צמתים
        for (int i=0; i<num-2; i++){
            int newValue = Math.abs(pos1.getValue()-pos2.getValue());
            pos2.setNext(new Node<>(newValue));

            pos1 = pos2;
            pos2 = pos2.getNext();
        }

        return chain;
    }
}
