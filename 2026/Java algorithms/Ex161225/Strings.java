package Ex161225;

public class Strings {
    public static void main(String[] args) {
        String str = "Over the hills and far away";
        System.out.println(str);
        System.out.println(str.length());

        str = "Other string";
        System.out.println(str);
        System.out.println(str.length());

        str = str + " with other words";
        System.out.println(str);

        // ex0
        /*
            כתבו תוכנית המדפיסה למסך את
            התו הראשון, האמצעי והאחרון של מחרוזת.
            ללא שימוש בלולאה!!
         */
        str = "ABCDE";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt( str.length()/2 ));
        System.out.println(str.charAt( str.length()-1 ));


        // ex1
        /*
            כתבו תוכנית המדפיסה את כל התוים
            של מחרוזת נתונה שורה אחרי שורה
         */
        String str1 = "Sultan of swings";
        for (int i = 0; i <= str1.length(); i++) {
            /*
                שימו לב! הקוד
                בצורתו הנוכחית תקול ולא תקין.
                זאת מכיוון שהאינדקס האחרון הוא אינדקס לא חוקי
                (גבוה מידי). עלינו להשתמש ב-debugger כדי
                לאתר את התקלה ולתן את התנאי.
             */
            System.out.println(str1.charAt(i));
        }



        // ex2
        /*
            כתבו תוכנית המדפיסה מחרוזת נתונה למסך
            באופן הפוך, מהסוף להתחלה
         */
    }
}
