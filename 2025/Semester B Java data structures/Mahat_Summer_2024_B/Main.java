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


        // ex4c
        MailItem[] items = {
                new MailItem("Avi", "", 100),
                new MailItem("Bobby", "", 150),
                new MailItem("John", "", 120),
        };
        System.out.println(MailItem.bigSender(items));

        // ex5a
        /*
            הפונקציה what סופרת את מס' החוליות בשרשרת,
            ומחזירה אותו.
         */
        // ex5b
        /*
            הפונקציה why מקבלת שתי שרשראות, ch1 ו-ch2.
            אם ch1 ארוכה יותר -
            הפונ' משווה סוף עם סוף (של שתי השרשראות)
            אם ch2 ארוכה יותר -
            הפונ' משווה התחלה עם התחלה
         */
        /*
        for loop:
            len1    len2    len1-len2   i   ch1
            -----------------------------------
            7       4        3              10
                                        0   7
                                        1   14
                                        2   5
                                        3   -
        while loop:
            ch1     ch2     ch1.getValue()!=ch2.getValue()
            5       5       false
            7       7       false
            2       1       true

            return false

         */
        // ex5c
        /*
            נרצה לתת שרשרת ch3 שהיא בדיוק הסוף של ch1, כלומר:
            ch3 = 5 -> 7 -> 2 -> 4
         */
        // ex5d
        /*
            נרצה לתת שרשרת ch4 שהיא בדיוק ההתחלה של ch1,
            כי אמרנו שאם השרשרת הראשונה קצרה יותר - אז משווים התחלה מול התחלה.
            דוגמא:
            ch4 = 10 -> 7 -> 14 -> 5
         */
        // ex5e
        /*
            הפונ' what(ch) מחזירה את אורך השרשרת

            הפונ' why(ch1, ch2) משווה את סוף השרשראות זו עם זו
            אם השרשרת ch1 ארוכה יותר,
            או לחלופין משווה התחלה עם התחלה בין שתי השרשראות
            אם השרשרת ch1 קצרה יותר.
         */

        // ex7
        Deck deck = new Deck();
        Domino d4 = new Domino(3,4);
        Domino d3 = new Domino(1,3);
        Domino d2 = new Domino(5,1);
        Domino d1 = new Domino(0,5);
        deck.setHead(new Node<>(d1, new Node<>(d2, new Node<>(d3, new Node<>(d4)))));

        Domino test1 = new Domino(3,3);
        Domino test2 = new Domino(6,5);
        System.out.println(Deck.addStone(deck, test1));
        System.out.println(Deck.addStone(deck, test2));
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

    // ex6a
    public void one(Queue<Integer> q, int k){
        Queue<Integer> temp = new ArrayDeque<>();
        while (!q.isEmpty()){
            temp.add(q.remove());
        }
        while (!temp.isEmpty()){
            int num = temp.remove();
            for (int i = 0; i < k; i++) {
                q.add(num);
            }
        }
    }
    // ex6b
    public void two(Queue<Integer> q, int k){
        int[] numbers = new int[q.size()];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = q.remove();
        }

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < numbers.length; j++) {
                q.add(numbers[i]);
            }
        }
    }
    // ex6c
    /*
        one: O(n*k)
        two: O(k*n)
     */
}
