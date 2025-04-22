package MyClasses;

/*
    אנקדותות:
    1. אם לא מציינים מאפיין גישה בעצמנו private/public
    ברירת המחדל היא תמיד private
    2. מאפייני הגישה חוסמים גישה אך ורק בקבצים אחרים,
    ומחוץ למחלקה.
    בתוך קוד המחלקה כולם יכולים לפנות לכולם.
    3. בנאי היא מתודה (פונ' פנימית של המחלקה) ליצירה של אובייקט חדש
    בקוד הmain.
    בתוך הבנאי נאתחל את השדות בערכים כרצוננו
    4. אם נרשום בנאי משלנו - יצירת אובייקט חדש יקרא לו.
    אם לא רשמנו בנאי משלנו - תמיד יופעל בנאי הברירת מחדל.
    5. ככלל אצבע- נרצה תמיד להגדיר את שדות המחלקה כ-private
    ולאפשר קריאה וכתיבה אליהם ע"י מתודות getter/setter.
    בעזרת מתודות שכאלה, תהליך הקריאה/כתיבה יהיה מבוקר,
    ונוכל למנוע שגיאות.
 */

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(){
        this.x = 1;
        this.y = 1;
        this.z = 1;
    }

    public int getX(){
        return this.x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
