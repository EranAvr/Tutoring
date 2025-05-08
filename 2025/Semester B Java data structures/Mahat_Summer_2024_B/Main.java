package Mahat_Summer_2024_B;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // ex1a
        // מימוש למטה
        // ex1b
        // O(n)

        // ex2a
        // מימוש למטה
        Queue<Integer> myQ = new ArrayDeque<>();
        myQ.add(8); myQ.add(10); myQ.add(11);
        myQ.add(2); myQ.add(3); myQ.add(16);
        myQ.add(12); myQ.add(4);
        // restore version-
        System.out.println(distance(myQ, 10, 12));
        System.out.println(distance(myQ, 12, 10));
        // doesn't restore version-
        System.out.println(distance2(myQ, 10, 12));
        System.out.println(distance2(myQ, 12, 10));
        // ex2b
        // O(n)

        // ex3a
        // מימוש למטה
        // ex3b
        // O(n)

    }


    // --------------- Methods ---------------

    // ex1
    public static boolean isParityStack(Stack<Integer> st){
        boolean onlyPos = true;
        int numEven = 0, numOdd = 0;
        int sumEven = 0, sumOdd = 0;

        Stack<Integer> temp = new Stack<>();
        while (!st.isEmpty()){
            int n = st.pop();

            if (n < 0)  // negative
                onlyPos = false;
            if (n % 2 == 0){    // even
                numEven++;
                sumEven += n;
            }
            else {
                numEven++;
                sumEven += n;
            }

            temp.push(n);
        }
        while (!temp.isEmpty()){
            st.push(temp.pop());
        }

        return onlyPos && (numEven == numOdd) && (sumEven == sumOdd);
    }

    // ex2
    public static int distance(Queue<Integer> q, int x, int y){
        Queue<Integer> temp = new ArrayDeque<>();
        boolean foundFirst = false;
        boolean foundLast = false;

        int count = 0;
        while (!q.isEmpty()){
            int n = q.remove();

            if (!foundFirst && (n==x || n==y)){  // found x or y for first time
                foundFirst = true;
            }
            else if (foundFirst && (n==x || n==y)){  // found x or y for second time
                foundLast = true;
            }
            else if (foundFirst && !foundLast){
                count++;
            }

            temp.add(n);
        }

        // restore values in original
        while (!temp.isEmpty()){
            q.add(temp.remove());
        }

        if (foundFirst && foundLast && count > 0)
            return count;
        else
            return -1;
    }

    public static int distance2(Queue<Integer> q, int x, int y){
        boolean foundFirst = false, foundLast = false;
        int count = 0;
        while (!q.isEmpty() && q.peek()!=x && q.peek()!=y){
            q.poll();
        }
        if (!q.isEmpty() && (q.peek() == x || q.peek() == y))
            foundFirst = true;
        q.poll();

        while (!q.isEmpty() && q.peek()!=x && q.peek()!=y){
            count++;
            q.poll();
        }
        if (!q.isEmpty() && (q.peek() == x || q.peek() == y))
            foundLast = true;
        q.poll();

        while (!q.isEmpty() && q.peek()!=x && q.peek()!=y){
            q.poll();
        }

        if (foundFirst && foundLast && count > 0)
            return count;
        else
            return -1;
    }

    public static int distance3(Queue<Integer> q, int x, int y){
        Queue<Integer> temp = new ArrayDeque<>();
        int iX = -1, iY = -1;
        int place = 0;

        while (!q.isEmpty()){
            place++;
            int n = q.remove();

            if (n == x)
                iX = place;
            else if (n == y)
                iY = place;

            temp.add(n);
        }

        // restore values in original
        while (!temp.isEmpty()){
            q.add(temp.remove());
        }

        if (iX > -1 && iY != -1)
            return Math.abs(iX - iY);
        else
            return -1;
    }

    // ex3
    public static boolean repeatList(Node<Character> chain){
        if (chain == null)
            return false;

        int[] counters = new int[256];
        while (chain != null){
            char c = chain.getValue();
            counters[Character.getNumericValue(c)]++;

            chain = chain.getNext();
        }

        for (int n : counters){
            if (n != 0 && n != 2){
                return false;
            }
        }
        return true;
    }
}
