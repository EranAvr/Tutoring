package ex140426;



/*
    תרגילים:
    לכל המחלקות, יש לממש getters/setters, בנאי-העתקה
    ופונ' toString.

    ex1)
         a) Rectangle
            - width: double
            - height: double
            + area() - מתודה המחזירה את שטח המלבן
            + perimeter() - מתודה המחזירה את היקף המלבן
         b)
            כתבו פונ' בקובץ הראשי Main המקבלת שני מלבנים,
            ומחזירה את השטח של המלבן הגדול מבין השניים
         c)
            כתבו בפונ' הmain קטע קוד היוצר 2 אובייקטים מטיפוס Rectangle,
            מדפיס אותם למסך, ומדפיס את תוצאת הפונ' המשווה שטחים (סעיף ב').

    ex2)
        a) BankAccount
            - owerName: String
            - balance: double
            + deposit(double sum) - מתודה המקבלת סכום כסף ומוסיפה אותו לסכום הכסף בחשבון
            + withdraw(double sum) - המתודה בודקת האם הסכום למשיכה קיים בחשבון.
                                אם כן- נפחית את הסכום מהחשבון ונחזיר אותו.
                                אחרת, יוחזר ערך 0.
         b) כתבו קטע קוד בתוכנית הראשית, היוצר אובייקט של BankAccount
         עם סכום התחלתי. בצעו הפקדה, משיכה-קטנה ומשיכה-גדולה על החשבון.
         יש להדפיס למסך את תוצאות המשיכות.
         שלבו הדפסות של מצב החשבון בין הפעולות השונות, כדי לראות עדכון מצב.


     ex3)
        a) Student
            - name: String
            - grades: double[10]
            + constructors
                בנאי מאתחל את מערך הציונים עם -1 (מינוס אחד) בכל תאיו
            + averageGrade() - מתודה המחשבת ומחזירה את ממוצע הציונים של התלמיד
            + isPassing() - מתודה בוליאנית המחזירה true
                            אם ממוצע הציונים הוא מעל 60
                            וגם אין ציון נכשל (מתחת ל-55)
                            אחרת, תחזיר false
            + addGrade(double grd)  - מוסיפה ציון אל מערך הציונים אל תא ריק,
                                        אם יש כזה.

     ex4)
        a) Movie
            - title: String
            - genres: String[5]
            - rating: double
            + getters/setters
                הערך של rating חייב לנוע בין 0 ל-5
            + addGenre(String genre) - מתודה המוסיפה רישום סיווג חדש אל
                                        המערך genres, אך ורק אם יש מקום פנוי.
                                        אם כל המערך כבר מלא, המתודה לא תעשה דבר.
            + howSimilar(Movie other) - מתודה המקבלת אובייקט של סרט אחר,
                                        ומחשבת ומחזירה בכמה אחוזים שני הסרטים דומים,
                                        עפ"י סיווגים (genres) זהים בשני הסרטים.
                                        הנוסחא לחישוב אחוז דימיון היא:
                                        מספר ה-genres הזהים
                                        ------------------- X 100
                                                5
 */


public class Main {
    public static void main(String[] args) {
        DemoClass dc1 = new DemoClass();
        System.out.println(dc1);

        /*
        DemoClass dc2 = dc1;    // השמה של כתובת בלבד.
                                // שני האובייקטים מצביעים אל אותו הזיכרון
        dc2.setName("Bobby");
        System.out.println(dc1);
        System.out.println(dc2);
        */

        /*
        // יעבוד אבל לא אידיאלי
        DemoClass dc2 = new DemoClass();    // יצירת אובייקט חדש ונפרד
        // העתקת שדות אחד אחרי השני
        dc2.setName(dc1.getName());
        dc2.setNum(dc1.getNum());
        dc2.setFloatingValue(dc1.getFloatingValue());
        */


        //------------------------------------------------------
        // ex1c
        Rectangle r1 = new Rectangle(3,5);
        Rectangle r2 = new Rectangle(5,4);
        System.out.println(r1);
        System.out.println(r2);

        System.out.println( getLargerArea(r1, r2) );

        // ex2
        BankAccount ba = new BankAccount("Bobby");  // חשבון עם סכום 0
        System.out.println(ba);

        BankAccount ba2 = new BankAccount(ba);
        ba2.deposit(1000);
        System.out.println(ba2);

        System.out.println( ba2.withdraw(100) );
        System.out.println(ba2);

        System.out.println( ba2.withdraw(1000) );
        System.out.println(ba2);
    }

    // ex1b
    public static double getLargerArea(Rectangle r1, Rectangle r2){
        if (r1.area() > r2.area())
            return r1.area();
        return r2.area();
    }
}
