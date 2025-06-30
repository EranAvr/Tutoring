package Mahat_Spring_2024_B;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // ex1b
        /*
            O(n)
         */

        // ex2b
        /*
            O(n)
         */

        // ex4a
        Shape s1 = new Shape();
        Shape s2 = new Square();
        Shape s3 = new Rectangle();
        Square sq = new Rectangle();
        //1.
        //Square sq1 = new Shape();   // קומפילציה
        //2.
        //Square sq2 = s1;    // קומפילציה
        //3.
        Square sq3 = (Square)s2;
        //4.
        Square sq4 = (Square)s3;
        //5.
        //Square sq5 = (Square) s1;   // זמן-ריצה
        //6.
        Triangle t = new Triangle();
        Shape s6 = t;
        //Square sq6 = (Square)s6;    // זמן-ריצה
        //7.
        Shape s7 = (Square)(new Rectangle());
        //8.
        //Square sq8 = (Shape)(new Rectangle());  // קומפילציה

        // ex4b
        /*
            ראשית, הפונ' area חייבת להופיע במחלקה Shape,
            מכיוון שטיפוס המערך Shape קובע איזה פונ'
            נוכל להפעיל על התאים שלו.
            שנית, נדרוס את המתודה area בתוך המחלקות
            Triangle ו-Rectangle כדי לתת מימוש
            ספציפי ונכון עבורן.
         */

        // ex5a
        /*
            chain= {10 7 14 5 7 2 4}
            p           x       y       chain               x-after
            ----------------------------------
            Node-1      10      -       -
            Node-1      10      7       10 10 14 5 7 2 4    7
            Node-2      10      14       10 10 7 5 7 2 4    14
            Node-3      14      5       10 10 7 14 7 2 4    5
            Node-4      5       7       10 10 7 14 5 2 4    7
            Node-5      7       2       10 10 7 14 5 7 4    2
            Node-6      2       4       10 10 7 14 5 7 2    4
            מחוץ ללולאה:
            -           4       -       4 10 7 14 5 7 2     -
         */
        // ex5b
        /*
            chain = {10 7 14 5 7 2 4}
            השרשרת לפני ביצוע הפעולה:
            chain = {7 14 5 7 2 4 10}
         */
        // ex5c
        /*
            הפעולות miracle ו-mystery מבצעות הזזה מעגלית
            על איברי השרשרת.
            כל הערכים נדחפים קפיצה אחת קדימה,
            והאיבר האחרון נדחף אל תחילת השרשרת.
         */

        // ex6c
        /*
            O(n)
            מכיוון שעוברים פעם יחידה על כל איבר במחסנית
         */
    }



    // Methods
    // ex1a
    public static boolean isOrdered(Stack<Integer> st){
        while (!st.isEmpty()){
            //          odd             even
            if (st.pop()%2!=0 && st.peek()%2==0)
                return false;
        }
        return true;
    }

    // ex2a
    public static void eraseMiddle(Queue<Integer> q){
        Queue<Integer> temp = new ArrayDeque<>();
        int count = 0;
        // ספירת גודל התור
        while (!q.isEmpty()){
            count++;
            temp.add(q.remove());
        }
        int half = count % 2 == 0 ? count/2 - 1 : count / 2;

        for (int i = 0; i < half; i++) {
            q.add(temp.remove());
        }

        temp.remove();
        if (count % 2 == 0){
            temp.remove();
        }

        for (int i = 0; i < half; i++) {
            q.add(temp.remove());
        }
    }

    // ex3
    public static boolean isMiracle(Node<Integer> chain){
        int count = 0;

        int first = chain.getValue();
        int last = chain.getValue();

        int min = chain.getValue();
        int minPos = 1;


        Node<Integer> temp = chain;
        while (temp != null){
            // ספירת איברים
            count++;

            // מציאת איבר אחרון
            if (temp.getNext() == null){
                last = temp.getValue();
            }

            // מציאת מינימום
            if (temp.getValue() < min){
                min = temp.getValue();
                minPos = count;
            }

            // קידום
            temp = temp.getNext();
        }
        return count%2==1 && first==last && minPos==count/2+1;
    }

    // ex4c
    public static Triangle maxArea(Shape[] arr){
        double maxA = 0;
        int pos = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Triangle && arr[i].area() > maxA){
                maxA = arr[i].area();
                pos = i;
            }
        }

        return pos>=0 ? (Triangle) arr[pos] : null;
    }

    // ex6a
    public static boolean isBottomStack(Stack<Integer> s1,
                                        Stack<Integer> s2){

        Stack<Integer> helper1 = new Stack<>();
        while (!s1.isEmpty())
            helper1.push(s1.pop());
        Stack<Integer> helper2 = new Stack<>();
        while (!s2.isEmpty())
            helper2.push(s2.pop());

        while (!helper1.isEmpty()){
            if (helper1.pop() != helper2.pop())
                return false;
        }
        return true;

    }
    // ex6b
    public static Stack<Integer> commonBottom(Stack<Integer> s1,
                                              Stack<Integer> s2){
        Stack<Integer> helper1 = new Stack<>();
        while (!s1.isEmpty())
            helper1.push(s1.pop());
        Stack<Integer> helper2 = new Stack<>();
        while (!s2.isEmpty())
            helper2.push(s2.pop());

        Stack<Integer> bottom = new Stack<>();

        // הגירסא הנ"ל תזרוק חריגה במידה ופנינו אל מחסנית
        // ריקה, ולכן דורשת מעט יותר עבודה סביב זה
        /*while (helper1.peek() == helper2.peek()){
            bottom.push(helper1.pop());
            helper2.pop();
        }*/

        // הגירסא הנ"ל יותר מתאימה למבחן,
        // כי היא נמנעת מזריקת חריגות
        while (!helper1.isEmpty() && !helper2.isEmpty()){
            if (helper1.peek() == helper2.peek()){
                bottom.push(helper1.pop());
                helper2.pop();
            }
            else
                return bottom;
        }

        return bottom;
    }

    // ex7a
    public static boolean isFibonacci(Node<Integer> chain){
        // בדיקת תנאים התחלתיים:
        // יש לפחות 2 חוליות-
        if (chain==null || chain.getNext() == null)
            return false;
        // שתי החוליות הראשונות מכילות ערכים 1, 1
        if (chain.getValue() != 1 || chain.getNext().getValue() != 1)
            return false;
        // אם יש 2 חוליות ומעלה - נבדוק תנאי פיבונאצ'י
        Node<Integer> next = chain.getNext();
        while (next.hasNext()){
            if (chain.getValue()+ next.getValue()
                    != next.getNext().getValue())
                return false;
            // תנאי קידום
            chain = next;
            next = next.getNext();
        }

        return true;
    }

}
