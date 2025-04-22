import MyClasses.Point;
import MyClasses.PositivePoint;
import MyClasses.Student;

public class Ex220425 {
    public static void main(String[] args) {
        /*
            מחלקה - תבנית כללית להגדרה של טיפוס נתונים חדש.
            (טיפוס נתונים, כדוגמת int, String, Array...)
            השדות (משתנים) שנגדיר בתוך המחלקה מגדירים איזה דאטה
            ישמר בה.

            אובייקט - יצירת משתנה בודד מטיפוס המחלקה.
            כל אובייקט הוא משתנה עצמאי, עם זיכרון נפרד משלו.

            אנו נכתוב מחלקה פעם אחת ויחידה, ונוכל ליצור ממנה אובייקטים
            רבים ככל שנרצה.
         */
        int a, b;
        String s1, s2;
        // ref      initializing
        // איתחול       רפרנס
        Point p1 = new Point();
        /*
            הביטוי Point p1 יוצר לנו משתנה חדש (רפרנס)
            הוא עוד לא מכיל מקום בזכירון. הוא רק דרך גישה/פנייה אל שדות המידע.
            הביטוי new Point() הוא זה שבעצם מפנה מקום חדש לאחסון
            בזיכרון המחשב.
         */
        System.out.println("Before: p1.x = " + p1.getX() + " p1.y = " + p1.getY() + " p1.z = " + p1.getZ());
        p1.setX(3);
        p1.setY(5);
        p1.setZ(6);
        System.out.println("After: p1.x = " + p1.getX() + " p1.y = " + p1.getY() + " p1.z = " + p1.getZ());

        Point p2 = new Point();
        p2.setX(5);
        p2.setY(5);
        p2.setZ(5);

        PositivePoint pp1 = new PositivePoint();
        System.out.println("Before: pp1.x = " + pp1.getX() + " pp1.y = " + pp1.getY());
        pp1.setX(-5);
        pp1.setY(-15);
        System.out.println("After: pp1.x = " + pp1.getX() + " pp1.y = " + pp1.getY());



        // ---------------------- Student class ----------------------

        Student stud = new Student();
        System.out.println("* Student * \nName: " + stud.getName()
                            + " Age: " + stud.getAge()
                            + " Gender: " + stud.getGender()
                            + " Grades: " + stud.getGrades());
    }
}
