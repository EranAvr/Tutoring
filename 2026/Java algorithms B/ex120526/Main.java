package ex120526;

public class Main {
    public static void main(String[] args) {
        // ex1
        /*
            כתבו פונ' רקורסיבית המקבלת פרמטר יחיד: מס' שלם חיובי num
            ומדפיסה למסך את כל המספרים
            מ-1 עד num (סדר עולה)
         */
        recPrint1toNum(10);
        System.out.println("-----------------");

        // ex2
        /*
            כתבו פונ' רקורסיבית המקבלת פרמטר יחיד: מס' שלם חיובי num
            ומדפיסה למסך את כל המספרים
            מ-num עד 1 (סדר יורד)
         */
        recPrintNumnTo1(10);
        System.out.println("-----------------");


        // ex3
        /*
            כתבו פונ' רקורסיבית המדפיסה למסך את כל המספרים
            הזוגיים בין 0 ל-num.
            הפרמטר num הוא מס' שלם חיובי.
         */
        recPrintEvensToNum(100);
        System.out.println("-----------------");


        // ex4
        /*
            כתבו פונ' רקורסיבית המקבלת פרמטר יחיד של מחרוזת.
             הפונ' תדפיס למסך את המחרוזת בסדר הפוך.
            ללא שימוש בפונ' מובנות המבצעות את ההיפוך בשבילכם.
         */
        recPrintReverseString("Hello Worlds!");
        System.out.println("\n-----------------");


        // ex5
        /*
            כתבו פונ' רקורסיבית המקבלת מס' שלם חיובי
            ומדפיסה אותו למסך כשספרותיו בסדק הפוך.
         */
        recPrintReverseInteger(12345678);
        System.out.println("\n-----------------");


        // ex אתגר
        /*
            כתבו פונ' המקבלת 2 פרמטרים: מס' num ופרמטר עזר יחיד.
            הפונ' תחזיר true/false בהתאם להאם המספר ראשוני
            או לא.
         */

        // ex אתגר
        /*
            א)
            כתבו פונ' המקבלת 2 מספרים שלמים חיוביים.
            הפונ' תדפיס את 20 המספרים הראשונים של "סדרת פיבונאצ'י" המוכרת.
            ב)
            הוסיפו פרמטר שלישי לפונ'- מספר שלםפ חיובי num.
            הפונ' תדפיס למסך את num המספרים הראשונים של סדרת פיבונאצ'י.
         */
    }

    // ex1
    public static void recPrint1toNum(int num){
        // תנאי עצירה
        if (num == 0)
            return;

        // רקורסיה
        recPrint1toNum(num-1);

        // עבודה
        System.out.println(num);
    }

    // ex2
    public static void recPrintNumnTo1(int num){
        if (num == 0)
            return;
        System.out.println(num);
        recPrintNumnTo1(num-1);
    }

    // ex3
    public static void recPrintEvensToNum(int num){
        if (num < 0)
            return;

        recPrintEvensToNum(num-1);

        if (num % 2 == 0)
            System.out.println(num);
    }

    // ex4
    public static void recPrintReverseString(String str){
        if (str.length() == 0)
            return;

        recPrintReverseString(str.substring(1));

        System.out.print(str.charAt(0));
    }

    // ex5
    public static void recPrintReverseInteger(int num){
        if (num == 0)
            return;

        System.out.print(num % 10);

        recPrintReverseInteger(num / 10);


    }
}
