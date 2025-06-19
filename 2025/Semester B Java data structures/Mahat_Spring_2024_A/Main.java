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
        // ex6c
        /*
            סעיף א': O(n)
            סעיף ב': O(n^2)
         */

        // ex7b
        /*
            סיבוכיות: O(n)
         */

        // ex9a
        /*
                arr[0]  arr[1]  arr[2]  arr[3]  arr[4]  arr[5]
            n1  2       1       3               1
            n2  -       4       6               4
            ref                         arr[0]          arr[1]

            Printing I:
            i   output
            0   "One: n1=2"
            1   "One: n1=1 Two: n2=4"
            2   "One: n1=3 Two: n2=6"
            3   "One: n1=2"
            4   "One: n1=1 Two: n2=4"
            5   "One: n1=1 Two: n2=4"

            After update:
                arr[0]  arr[1]  arr[2]  arr[3]  arr[4]  arr[5]
            n1  36      32      15              7
            n2  -       128     30              28
            ref                         arr[0]          arr[1]

            Printing II:
            i   output
            0   "One: n1=36"
            1   "One: n1=32 Two: n2=128"
            2   "One: n1=15 Two: n2=30"
            3   "One: n1=36"
            4   "One: n1=7 Two: n2=28"
            5   "One: n1=32 Two: n2=128"

         */
        // ex9b
        /*
            כן. הפלט השתנה.

            הסיבה היא, שבגלל שההדפסה באה באותה לולאה
            של העדכון, ומיד לאחר כל עדכון - היא
            תדפיס את הערך המיידי שלו.

            .יש כמה תאים שמצביעים אל אותו אובייקט
            כאשר היתה לולאה נפרדת לעדכונים, כל העדכונים נעשו על האובייקט
            לפני ההדפסות, ולכן קיבלנו הדפסות זהות לכמה רפרנסים.

            בקוד החדש, בגלל שמדפיסים לאחר כל עדכון,
            רפרנסים שונים אל אותו אובייקט ידפיסו תוצאות שונות.
         */

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
    public static int size(Queue<Integer> q){
        return 0;
    }
    public static boolean startWith(Queue<Integer> q1,
                                    Queue<Integer> q2){
        if (size(q1) > size(q2))
            return false;
        while (!q1.isEmpty()){
            if (q1.remove() != q2.remove())
                return false;
        }
        return true;
    }
    // ex6b
    public static boolean duplication(Queue<Integer> q1,
                                      Queue<Integer> q2){

        /*Queue<Integer> temp = new ArrayDeque<>();
        while (!q2.isEmpty() && !q1.isEmpty()){ // O(n)
            int n = q1.remove();
            temp.add(n);

            if (q2.remove() != n)
                return false;
            if (q1.isEmpty()){
                while (!temp.isEmpty())
                    q1.add(temp.remove());
            }
        }
        return true;*/

        // copy q1 into an array
        int[] arr1 = new int[size(q1)];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = q1.remove();
        }
        // check q2 repeatedly
        int idx = 0;
        while (!q2.isEmpty()){
            if (q2.remove() != arr1[idx % arr1.length])
                return false;
            idx++;
        }
        return true;
    }

    // ex7a
    public static boolean isUpDown(Node<Integer> chain){
        boolean up = false;
        boolean down = false;
        Node<Integer> pos = chain;

        while (pos.getNext() != null && pos.getNext().getValue() > pos.getValue()){
            pos = pos.getNext();
            if (!up)
                up = true;
        }

        while (pos.getNext() != null && pos.getNext().getValue() < pos.getValue()){
            pos = pos.getNext();
            if (!down)
                down = true;
        }

        return up && down && pos.getNext() == null;
    }

    // ex8
    // פונקציות עזר:
    // count number of nodes:
    public static int btSize(BinNode<Integer> bt){
        if (bt == null)
            return 0;

        int count = 0;
        count += btSize(bt.getLeft());
        count += btSize(bt.getRight());
        return count + 1;
    }
    // calc sum of nodes:
    public static double btSum(BinNode<Integer> bt){
        if (bt == null)
            return 0;

        int sum = 0;
        sum += btSize(bt.getLeft());
        sum += btSize(bt.getRight());
        return sum + bt.getValue();
    }
    // calc total avg of tree:
    public static double btAvg(BinNode<Integer> bt){
        return btSum(bt) / btSize(bt);
    }
    // זו הפונקציה שלמעשה עונה על השאלה
    public static void printUnderAvg(BinNode<Integer> bt){
        double avg = btAvg(bt);
        traverse(bt, avg);
    }
    public static void traverse(BinNode<Integer> bt, double avg){
        if (bt == null)
            return;
        traverse(bt.getLeft(), avg);
        traverse(bt.getRight(), avg);
        if (bt.getValue() < avg)
            System.out.println(bt.getValue());
    }
}
