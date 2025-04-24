package Mahat_Summer_2024_A;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        //String res = true ? "OK" : "Error";

        // ex1a
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(0);
        st.push(-1);
        System.out.println(isBalanced(st));


        // ex1b
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

            Output: Node(3)
            ספירת ערכים אי זוגיים בשרשרת. התוצאה היא 3 עבור הקלט הנתון.
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
                    returns a new Node with value of count
            what() - הפונקציה רצה על החוליות של השרשרת המקורית.
                    אחרי כל חוליה מקורית עם ערך זוגי - תדחף חוליה חדשה עם ספירת האי זוגיים בהמשך השרשרת
                    אחרי כל חוליה מקורית עם ערך אי זוגי - תדחף חוליה חדשה עם ספירת הזוגיים בהמשך השרשרת

         */


        // ex6
        /*
            c) סיבוכיות הפעולות
            הפעולה remove רצה בסיבוכיות O(n)
            מכיוון שהיא עוברת על מחסנית באופן סידרתי, מההתחלה עד הסוף

            הפעולה commonValues גם היא רצה בסיבוכיות O(n^2)
            שלב א: הפעולה מאחדת שתי מחסניות אל תוך מחסנית יחידה
            שלב ב: הפעולה פורקת את המחסנית המאוחדת אל תוך מחסנית חדשה,
            וקוראת לפעולה remove על כל אחד בודד שנפרק.
            מעבר על n ערכי המחסנית וקריאה לפונ' עם סיבוכיות n על כל אחד מהערכים,
            מניב סיבוכיות של n*n
         */

        // ex8a
        /*
                2
                 \
                  4
                 /
                6
                 \
                  8
                 /
                10
                  \
                  12
         */
        // ex8b
        BinNode<Integer> nd6 = new BinNode<>(12);
        BinNode<Integer> nd5 = new BinNode<>(10); nd5.setRight(nd6);
        BinNode<Integer> nd4 = new BinNode<>(8); nd4.setLeft(nd5);
        BinNode<Integer> nd3 = new BinNode<>(6); nd3.setRight(nd4);
        BinNode<Integer> nd2 = new BinNode<>(4); nd2.setLeft(nd3);
        BinNode<Integer> nd1 = new BinNode<>(4); nd1.setRight(nd2);
        System.out.println("Is tree an Ascending List? " + checkAscendingList(nd1));

        // ex9c
        /*
            a) הפונ' מריצה לולאה, ומבצעת פעולה על כל איבר במבנה הנתונים.
            לכן מבנה בגודל n יפיק n פעולות
            O(n)

            b) אנו מריצים לולאה חיצונית הרצה n פעמים,
            ובתוכה לולאה פנימית אשר רצה גם היא n פעמים.
            לכן O(n^2)
         */

        // ex10a
        /*
            1. "AA constructor"
            2. "BB constructor"
            3. "BB constructor"
            4. "one in AA"
            5. "one in BB"
            6. "one in BB"
            7. "one in AA"
            8. "two in BB"
            9. "two in BB"
            10. "one in AA"
            11. "one in AA"
         */
        /*
            1) a.three();
            הפקודה לא תקינה.
            האובייקט a הוא מטיפוס-רפרנס AA ולכן לא מוגדרת לו הפונ' three() בממשק
            שגיאת קומפילציה! הקומפיילר מבין שלא קיימת כזאת מתודה לטיפוס הנ"ל

            2) ((BB)a).three();
            הפקודה לא תקינה.
            למרות שההמרה לטיפוס BB מתקבלת ע"י הקומפיילר ובדיקת הממשק של BB,
            אבל לא קיימת שום מתודה three() עבור האובייקט a.
            זאת מכיוון שאיתחלנו אותו עם הבנאי AA שבכלל לא בונה כזאת מתודה.
         */

        // ex10b
        // המימוש למטה
        AA a = new BB();
        System.out.println(a instanceof BB);
        System.out.println(a instanceof AA);
        System.out.println(a instanceof Object);

        // ex11
        // המימוש למטה


        // ex12
        // a)
        // Before: 10 -> 12 -> 5 -> 3 -> 6 -> 1 -> 4
        // After: 10 -> 0 -> 12 -> 0 -> 5 -> 3 -> 6 -> 0 -> 1 -> 4 -> 0

        // b)
        /*
            .הפעולה הרקורסיבית סורקת את כל החוליות המקוריות של הרשימה המקושרת
            אחרי כל חוליה עם ערך זוגי, נוסיף חלויה חדשה עם הערך 0.
         */

        // c)
        // Before: 10 -> 12 -> 5 -> 3 -> 6 -> 1 -> 4
        // After: 10 -> 5 -> 3 -> 1

        // d)
        /*
            הפעולה מוחקת מהשרשרת את כל החוליות עם ערך זוגי, חוץ (!!) מהחוליה הראשונה.
            החוליה הראשונה נשארת לא נגועה, ולא נבדקת.
         */

        // e)
        /*
            הפעולה סורקת את השרשרת עד מציאת ערך אי-זוגי ראשון.
            הפעולה תחזיר רפרנס אל אותה חוליה אבל לאחר מחיקת כל הזוגיים שאחריה.
            אם לא נמצאו ערכים אי זוגיים כלל- הפעולה תחזיר null.
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

    // ex6a
    public static void remove(Stack<Integer> st, int num){
        Stack<Integer> helper = new Stack<>();
        while (!st.isEmpty()){
            if (st.peek() != num){  // peek() = top() אנחנו נשתמש במה"ט בפונ' top
                helper.push(st.pop());
            }
            else {
                st.pop();
            }
        }
        while (!helper.isEmpty()){
            st.push(helper.pop());
        }
    }
    // ex6b
    /*
        1. נאחד את שתי המחסניות
        2.1 נשלוף ערכים מתוך המחסנית המאוחדת, אחד אחרי השני
        2.2 לכל ערך ששלפנו, נפעיל את הפונ' מסעיף א למחיקת כפילויות
     */
    public static Stack<Integer> commonValues(Stack<Integer> s1, Stack<Integer> s2){
        Stack<Integer> temp = new Stack<>();
        while (!s1.isEmpty()){
            temp.push(s1.pop());
        }
        while (!s2.isEmpty()){
            temp.push(s2.pop());
        }

        Stack<Integer> s3 = new Stack<>();
        while (!temp.isEmpty()){
            int x = temp.pop();
            remove(temp, x);
            s3.push(x);
        }
        return s3;
    }

    // ex8
    public static boolean checkAscendingList(BinNode<Integer> root){
        // Initial validations:
        if (root == null)
            return false;
        if (root.getLeft()==null && root.getRight()==null){ // root is leaf
            return (root.getValue() > 0 && root.getValue() % 2 == 0);
        }

        // Recursive:
        return recursiveCheckAscendingList(root);

        // With loop:
        /*while (true) {
            // has 2 children:
            if ( root.hasLeft() && root.hasRight() )
                return false;
            // illegal value:
            if (root.getValue() <= 0 || root.getValue() % 2 != 0)
                return false;

            BinNode<Integer> parent = root;
            if (root.hasLeft()){    // has left child
                root = root.getLeft();
            }
            else if (root.hasRight()){    // has right child
                root = root.getRight();
            }

            if (parent == root) // root is leaf BUT legal
                return true;
            if (parent.getValue() > root.getValue())    // parent is larger than child
                return false;
        }*/
    }
    public static boolean recursiveCheckAscendingList(BinNode<Integer> root){
        // has 2 children:
        if ( root.hasLeft() && root.hasRight() )
            return false;
        // illegal value:
        if (root.getValue() <= 0 || root.getValue() % 2 != 0)
            return false;

        // Terminating condition:
        if (root.getLeft()==null && root.getRight()==null){ // root is a leaf
            /*
                all nodes to this point have been checked,
                including current node 'root'. So value is valid.
             */
            return true;
        }
        else {  // has a single child - keep on digging
            int parentVal = root.getValue();    // save parent value
            root = root.hasLeft() ? root.getLeft() : root.getRight(); // move root to child
            if (parentVal > root.getValue())    // assert child is greater than parent
                return false;
            return recursiveCheckAscendingList(root);   // recursive call
        }
    }

    // ex9
    public static int sizeQ(Queue<Integer> q){ // helper method
        return sizeOfQueue(q);
    }
    public static int valueAt(Queue<Integer> q, int pos){
        int size = sizeQ(q);

        int x = -1;
        for (int i = 1; i <= size; i++) {
            if (i == pos){
                x = q.peek();   // peek() = head()
            }
            q.add( q.remove() );    // add() = insert()
        }
        return x;
    }
    public static Queue<Integer> merge (Queue<Integer>q1, Queue<Integer>q2){
        int size = sizeQ(q2);
        Queue<Integer> q3 = new ArrayDeque<>();

        while (!q1.isEmpty()){
            q3.add(q1.remove());
            q3.add(valueAt(q2, size));
            size--;
        }
        return q3;
    }

    // ex10
    public static void countMyTypes(Object[] arr){
        int countBB = 0;
        int countAAnotBB = 0;
        int countNotAA = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i] instanceof BB)
                countBB++;
            else if ( arr[i] instanceof AA)
                countAAnotBB++;
            else
                countNotAA++;
        }
        System.out.println("BB: " + countBB);
        System.out.println("AA not BB: " + countAAnotBB);
        System.out.println("Not AA: " + countNotAA);
    }
}

class AA{}
class BB extends AA{}

class Student{
    private String id;
    private String name;
    private String city;
    private boolean driving;
    private String lang;
    private String secondLang;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public boolean isDriving() {
        return driving;
    }

    public String getLang() {
        return lang;
    }

    public String getSecondLang() {
        return secondLang;
    }
}

class StudentsData{
    private Node<Student> students;

    public void eraseStudent(String id){
        // מקרה קצה - מחיקת החוליה הראשונה
        if (students.getValue().getId().equals(id))
            students = students.getNext();

        // שאר המקרים - מחיקת חוליה בהמשך השרשרת
        //  Node(2) -> Node(5) -> Node(3) -> null;
        //    |
        //  temp
        Node<Student> temp = students;
        Node<Student> prev = null;
        while (temp != null){
            if (temp.getValue().getId().equals(id))
                break;
            prev = temp;
            temp = temp.getNext();
        }

        if (temp != null)
            prev.setNext(temp.getNext());
    }

    public void print(String city, String lang){
        boolean flag = false;

        Node<Student> temp = students;
        while (temp != null){
            Student s = temp.getValue();
            if (s.getCity().equals(city) && (s.getLang().equals(lang) || s.getSecondLang().equals(lang))){
                flag = true;
                System.out.println(s.getName());
            }
            temp = temp.getNext();
        }

        if (!flag){
            temp = students;
            while (temp != null){
                Student s = temp.getValue();
                if (s.isDriving() && (s.getLang().equals(lang) || s.getSecondLang().equals(lang))){
                    System.out.println(s.getName());
                }
            }
        }
    }

    public int numStudents(String city){
        int count = 0;
        Node<Student> temp = students;

        while (temp != null){
            if (temp.getValue().getCity().equals(city))
                count++;
            temp = temp.getNext();
        }

        return count;
    }

    public String cityName(String[] cities){
        String maxCity = cities[0];
        int maxy = numStudents(maxCity);

        for (int i=1; i<cities.length; i++){
            int temp = numStudents(cities[i]);
            if (temp > maxy){
                maxy = temp;
                maxCity = cities[i];
            }
        }

        return maxCity;
    }
}