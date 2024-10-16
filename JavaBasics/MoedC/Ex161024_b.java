package MoedC;

import java.util.Scanner;

///////////////////////////////////////////////
/////       Classes and Objects     ///////////
///////////////////////////////////////////////
/*
    Class - תבנית כללית של טיפוס משתנה מורכב.
    נוכל ליצור מחלקות רצוננות, שיכילו איזה פרמטרים פנימיים שנרצה.
    Object - משתנה בודד מטיפוס של מחלקה.
    ממחלקה אחת נתונה נוכל ליצור כמה אובייקטים שנרצה. לכל אובייקט
    בודד יהיו הפרמטרים הפנימיים שהגדרנו עבורו במחלקה.
    נשתמש באופרטור "נקודה dot" כדי לגשת אל מאפיינים/פרמטר פנימי, כך:
    obj.fieldName
 */
class Point{
    int x;
    int y;

    public Point(){}    // בנאי ריק
    public Point(int x, int y){ // בנאי פשוט
        System.out.println("this = " + this);
        this.x = x;
        this.y = y;
    }
    public Point(int x, int y, int mult){   // בנאי משופר
        System.out.println("this = " + this);
        this.x = x * mult;
        this.y = y * mult;
    }
    public Point(Point other){  // Copy Constructor - בנאי העתקה
        this.x = other.x;
        this.y = other.y;
    }
}

public class Ex161024_b {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // BAD example:
        int x1, y1; // first point
        int x2, y2; // second point
        /* To many variables! - יותר מידי משתנים, קשה לעקוב ולנהל*/

        // GOOD example:
        /* Use classes - בעזרת מחלקות אפשר לאגד משתנים הקשורים זה לזה יחד*/
        Point p = new Point();
        p.x = 2;
        p.y = 3;
        System.out.println(p.x + " " + p.y);

        Point p1 = new Point(5, 10);
        System.out.println("p1 = " + p1);
//        p1.x = 5;
//        p1.y = 10;
        System.out.println(p1.x + " " + p1.y);

        Point p2 = new Point(2, 2, 10);
        System.out.println("p2 = " + p2);
        System.out.println(p2.x + " " + p2.y);

        Point p3 = new Point(p);
        System.out.println("p3 = " + p3);
        System.out.println(p3.x + " " + p3.y);
    }
}
