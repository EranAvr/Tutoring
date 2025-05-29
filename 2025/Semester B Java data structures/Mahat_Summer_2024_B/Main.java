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
        //Node<Domino> head = new Node(new Node<>(d1, new Node<>(d2, new Node<>(d3, new Node<>(d4)))));

        Domino test1 = new Domino(3,3);
        Domino test2 = new Domino(6,5);
        System.out.println(Deck.addStone(deck, test1));
        System.out.println(Deck.addStone(deck, test2));


        // ex9c:
        /*
            a) isPyramid() = O(n^2)
                הגודל N מבטא את גודל המספר הגדול ביותר
            b) isPyramidStack() = O(n)
                הערך n מבטא את גודל המחסנית - מס' הערכים שבה
         */

        // ex10a
        // C -> B -> A
        // C <>-- A
        // ex10b
        /*
            Static memory:
            countA=7     countB=4     countC=2
            ---------------------------------------------
                arr[0]  arr[1]  arr[2]  arr[3]  arr[4]
            x   13      5       2       3       0
            y   -       10      7       3       5
            A   -       -       A{x=9}  A{x=6}  -
         */
        // ex10c
        /*
            A objects: 7
            B objects: 4
            C objects: 2
         */
        // ex10d
        /*
            A:13
            B:A:5:10
            C:B:A:2:7[A:9]
            C:B:A:3:3[A:6]
            B:A:0:5
         */
        // ex10e
        /*
            return super.doIt(z) + this.y;
            super.doIt(z) = this.x * z;

            arr[1] = new B(5, 10);
            return = x*z + y = 5*2 + 10 = 20

            arr[2] = new C(2, 7);
            return = x*z + y = 2*3 + 7 = 13

            arr[3] = new C(3, 3);
            return = x*z + y = 3*4 + 3 = 15
         */

        // ex11e
        /*
            גישה ראשונה: לולאה
            1. נוסיף למחלקה Service משתנה קאונטר לספירת
            הלקוחות שהיא שירתה
            1.2 נוסיף פונ' getter/setter
            2. על כך לקוח שהעמדה שירתה, נגדיל את הקאונטר שלה ב-1
            3. בפונ' theBest במחלקה Support נרוץ בלולאה
            על מערך העמדות ונבדוק למי הקאונטר הגדול ביותר
            (חיפוש מקסימום במערך)
         */
        /*
            גישה שניה: משתנים סטטיים
            1. נוסיף למחלקה Service שדה
            מספרי קאונטר לספירת לקוחות ושדה מספרי
            עם המספר הסידורי שלה במערך העמדות. נאתחל
            אותו בבנאי.
            2. נוסיף למחלקה Service שני שדות סטטיים: שדה מספרי
            למספר לקוחות מקסימלי ושדה מספרי עבור מס' העמדה שהגיעה
            למקסימום לקוחות.
            3. בכל פעם שעמדה סופרת לעצמה לקוח נוסף שטופל-
            נשווה אותה אל מול המקסימום הסטטי (הגלובלי) ואם היא עקפה אותו-
            נשמור אותה שם.
         */

        // ex12a
        /*
            After changing:
            chain -> 12 -> 5 -> 3 -> 6 -> 1 -> 4 -> 0

            הפעולה רצה על השרשרת,
            ומקדמת כל ערך צעד אחד לכיוון הראש (ההתחלה).
            כלומר, ערך של כל חוליה מועתק אל החוליה שלפניה.
            הערך הראשון ברשימה יזרק לפח, והחוליה האחרונה
            תקבל את הערך 0
         */
        // ex12b
        /*
            num = 10
            After changing:
            chain -> 10 -> 12 -> 5 -> 3 -> 6 -> 1 -> 10

            הפעולה רצה על השרשרת באופן רקורסיבי,
            עד הגעה אל החוליה האחרונה.
            כאשר הגענו אל סוף השרשרת,
            נחליף את ערך החוליה האחרונה עם הערך num.
         */
        // ex12c
        /*
            After changing:
            x = n.getValue() = 10
            chain -> 12 -> 5 -> 3 -> 6 -> 1 -> 4 -> 10
            
            הפעולה מעתיקה את הערך של החוליה הראשונה אל סוף השרשרת.
            ראשית היא שומרת את הערך בצד
             ומדגלת ערכים שמאלה בעזרת הפונ' one,
            ולבסוף מכניסה את הערך x אל סוף הרשימה בעזרת הפונ' two
         */
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


    // ex8
    public static boolean isArranged(BinNode<Integer> root){
        if (root == null){
            return true;
        }

        if ((root.hasLeft() || root.hasRight()) && root.getValue()%2!=0)    // found inner node with odd value
            return false;
        if (!root.hasLeft() && !root.hasRight() && root.getValue()%2==0)    // found leaf node with even value
            return false;

        if (root.hasLeft() && root.getLeft().getValue() < root.getValue())  // found smaller left child
            return false;
        if (root.hasRight() && root.getRight().getValue() < root.getValue())  // found smaller right child
            return false;


        return isArranged(root.getLeft()) && isArranged(root.getRight());
    }

    // ex9a
    public static Stack<Integer> buildPyramid(int N){
        Stack<Integer> pyramid = new Stack<>();
        while (N > 0){
            for (int j = 0; j < N; j++) {
                pyramid.push(N);
            }
            N--;
        }
        return pyramid;
    }
    // ex9b
    public static boolean isPyramidStack(Stack<Integer> s){
        int val = 1;
        while (!s.isEmpty()){
            for (int j = 0; j < val; j++) {
                if (s.pop() != val)
                    return false;
                if (s.isEmpty())
                    return false;
            }
            val++;
        }
        return true;
    }
}
