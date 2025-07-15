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

        // ex3
        /*
            1. לא נכון. Flower היא מחלקת האב
            2. כן נכון. מחלקה יורשת מקבלת את כל תכונות ומתודות האב
            3. כן נכון. התכונה היא protected ולכן נגישה ע"י הילד
            4. לא נכון. מחלקת אב לא יכולה לגשת אל תכונות הילד.
            5. לא נכון. מחלקת ילד יורשת את כל תכונות האב (גם אם הן private)
         */
        // ex3b
        /*
            1. שגיאת קומפילציה. לטיפוס Flower אין גישה למחלקה של הילד
            2. כנ"ל
            3. אין שגיאות. יחזיר true
            4. שגיאת זמן ריצה. ההמרה תעבור קומפילציה אבל בזמן ריצה ה-JVM לא ימצא
            מתודה כזאת בזיכרון.
            5. תקין. מחזיר true כי כל הפרחים מאותחלים עם מחיר 10
         */

        // ex4a
        /*
            public class Actor implements Dancer, Singer, Musician
            {
            private String name;
            private int age;

            public Actor(String name, int age){}
            public Actor(String name){}

            public void lonelyDance(){...}
            public void coupleDance(Dancer d){}

            public void sing(){}

            public void play(){}
            }
         */
        // ex4b
        /*
            (1) תקין. ההשמה נעשית מהכלל Dancer אל הפרט Actor
            (2) לא תקין. אין אפשרות להפעיל בנאי של ממשק. לא קיים.
            (3) תקין.
            (4) לא תקין. לא קיימת מתודה play בממשק Singer
            (5) תקין
            (6) תקין. כל ההמרות עוברות קומפילציה,
            ויש מימוש לכל המתודות עבור זמן ריצה.
         */
        // ex4c
        /*
            1. לא נכון. A יורשת מ-C
            2. תקין
            3. לא נכון. A יורשת מ-C
            4. לא תקין. B יורשת מ-C בעקיפין
            5. תקין
            6. תקין
         */

        // ex5c
        /*
            a) O(n^2)
            b) O(n^2)
         */

        // ex6a
        /*
            שתי המחלקות FamilyRoom ו-Suite יורשות
            מהמחלקה Room
         */
        // ex6c
        Room suite = new Suite();
        System.out.println(suite.calcCleaningTime());

        // ex7
        /*
            a)
                        100
                 200            300
              400   400             600
         */
        /*
            b)
            הפונקציה בודקת שערכי הצמתים גדולים מהרמה (קומה) שלהם בעץ
            מלמעלה (0) למטה
         */
        /*
            what
            פונ' רקורסיבית שמחזירה את הערך הקטן ביותר (שמאלי) של העץ
            where
            פונ' המחזירה את הערך הגדול ביותר (ימני) בעץ
         */
        // ex7d
        /*
            נסתמך על הגדרת הבסיס של עץ-בינארי - ללא כפילויות.
            עבור עץ עם 3 צמתים לפחות, לא מתאפשר שהערך הקטן ביותר
            יהיה גם הגדול ביותר.
         */

        // ex8a
        /*
            "aaa"
            "aaa"
         */
        // ex8b
        /*
            "B: 4/aaaaaaaaaaaa"
            "A: bbb"
            "B: 3/ccccccccc"
            "B: 1/aaa"
            "B: 2/dddddd"
            "aaa"
            "NULL"
            6 4
         */

        // ex9a
        /*
        1.
            Return: 3
        2.
            הטענה לא נכונה
            הפונ' עוצרת חיפוש ברגע שלא נמצא x בתחילת התור.
            יכול להיות ש-x כן קיים בתור במקום פנימי יותר,
            אבל החיפוש לא יתבצע כי הוא לא בראש התור.
            לכן התור לא ישתנה.
        3.
            [7,7,7,7,6,...]
            לאחר הפונ'
            [6,...]
        4.
            הפעולה סופרת כמה פעמים מופיע x ברצף
            מתחילת התור
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
        BinNode<Integer> first = chain;
        BinNode<Integer> last = chain;
        // כהקדמה, נריץ את last אל סוף השרשרת
        while (last.getRight() != null)
            last = last.getRight();
        // בדיקת השרשרת
        while (first != last){
            if (first.getValue() % 2 == 1){ // אי זוגי בהתחלה
                // swap
                int temp = first.getValue();
                first.setValue(last.getValue());
                last.setValue(temp);
                // נוריד את last
                last = last.getLeft();
            }
            else if (last.getValue() % 2 == 0){ // זוגי בסוף
                // swap
                int temp = first.getValue();
                first.setValue(last.getValue());
                last.setValue(temp);
                // נקדם את first
                first = first.getRight();
            }
            else
                first = first.getRight();
        }
    }

    // ex3c
    public static void checkFlowers(Object[] flowers){
        int countRose = 0;
        int countFlower = 0;
        int countNoFlower = 0;
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i] instanceof Rose)
                countRose++;
            else if (flowers[i] instanceof Flower)
                countFlower++;
            else
                countNoFlower++;
        }
        System.out.println(countRose);
        System.out.println(countFlower);
        System.out.println(countNoFlower);
    }

    // ex5a
    public static void buildFreqList(Node<Integer> chain){
        Node<Integer> head = chain;

        while (head != null){
            int count = 1;
            Node<Integer> runner = head;
            // count and remove duplicates
            while (runner.hasNext()){
                if (runner.getNext().getValue() == head.getValue()){
                    // נספור
                    count++;
                    // נמחק חוליה הבאה
                    runner.setNext(runner.getNext().getNext());
                }
                else
                    runner = runner.getNext();
            }
            // add new node with count value
            Node<Integer> newCount = new Node<>(count, head.getNext());
            head.setNext(newCount);
            // advance head
            head = head.getNext().getNext();
        }
    }
    // ex5b
    public static int mostPopularNumber(Node<Integer> chain){
        buildFreqList(chain);

        int maxVal = chain.getValue();
        int maxFreq = chain.getNext().getValue();
        Node<Integer> temp = chain;

        while (temp.getNext().getNext() != null){

            if (temp.getNext().getValue() > maxFreq){
                maxFreq = temp.getNext().getValue();
                maxVal = temp.getValue();
            }

            temp = temp.getNext().getNext();
        }

        return maxVal;
    }
}
