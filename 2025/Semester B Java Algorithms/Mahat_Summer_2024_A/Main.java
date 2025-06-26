package Mahat_Summer_2024_A;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random rnd = new Random();

        // ex1
        /*int count2Digits = 0;
        int sumEven = 0;
        for (int i = 0; i < 20; i++) {
            int n1 = s.nextInt();
            int n2 = s.nextInt();

            if (n1 >= 10 && n1 <= 99)
                count2Digits++;
            if (n2 >= 10 && n2 <= 99)
                count2Digits++;
            if (n1 % 2 == 0)
                sumEven += n1;
            if (n2 % 2 == 0)
                sumEven += n2;
        }
        System.out.println(count2Digits);
        System.out.println(sumEven);*/

        // ex2
        /*String str = "";
        int count = 0;
        while (str.length() % 2 == 0){
            str = s.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'Z')
                    System.out.println("'Z' found at index " + i);
            }
            if (str.charAt(0) == str.charAt(str.length()-1))
                count++;

        }
        System.out.println(count);*/

        // ex3
        /*int[] counters = new int[100];
        // יצירת מספרים וספירה שלהם במערך-מונים:
        for (int i = 0; i < 40; i++) {
            int num = rnd.nextInt(10, 100); // 2-digit number
            counters[num]++;
        }

        // קוד עזר (לא קשור לתרגיל!!) להדפסת מערך המונים שלנו:
//        for (int i = 10; i < 100; i++) {
//            System.out.print(counters[i] + "\t");
//        }
//        System.out.println();
//        for (int i = 10; i < 100; i++) {
//            System.out.print(i + "\t");
//        }
//        System.out.println();

        // חיפוש הערך (אינדקס) שנוצר הכי הרבה פעמים:
        int maxCount = counters[10];
        int maxIndex = 10;
        for (int i = 10; i < 100; i++) {
            if (counters[i] > maxCount){
                maxCount = counters[i];
                maxIndex = i;
            }
        }
        System.out.println("Most common number: " + maxIndex);
        // מציאת המספרים הדו-ספרתיים שלא נוצרו בכלל:
        for (int i=10; i<100; i++){
            if (counters[i] == 0)
                System.out.println(i);
        }*/

        // ex4d
        /*
            סעיף ב': O(n)
            סעיף ג': O(n^2)
         */

        // ex5c
        /*
            סעיף א': O(n)
            סעיף ב': O(n^2)
            בסעיף ב', אמנם יש לולאה יחידה שרצה על המערך,
            אבל (!!) בכל איטרציה אנו מפעילים את הפונ' של סעיף א',
            שהיא בעצמה עוברת על כל המערך.
            לכן קיבלנו התנהגות של לולאה בתוך לולאה.
         */

        // ex6a
        /*
            a) num = 1777
            b)  הפונקציה סופרת כמה פעמים הספרה dig
                מופיעה בתוך המספר הארוך num
         */
        // ex6b
        /*
            a)
            arr = {24, 34783, 1245, 68, 468, 9445}
            two (arr, 4) = ?

            i   arr[i]  res
            ---------------
                        0
            0   24      1
            1   34783   2
            2   1245    3
            3   68      3
            4   468     4
            5   9445    6

            return = 6

            b)  הפעולה two סופרת כמה פעמים
                הספרה dig נמצאת בכל מספרי המערך
         */
        // ex6c
        /*
            a)  arr = [1, 22, 333, 4444, 55555, 666666]
            b)  הפעולה three
                עוברת על כל הספרות 0-9
                ומחזירה את הספרה שהופיעה הכי הרבה פעמים
                במערך arr.
         */

        // ex7a
        /*
            str = "@@@a@A@@@@@"
            return = 9
         */
        // ex7b
        /*
            str = "###$$$"
         */
        // ex7c
        /*
            str = "AAaa&&"
            output = %0#1#2?3?%
            return = 2
         */
        // ex7d
        /*
            הפעולה סופרת כמה תוים במחרוזת הם לא אותיות,
            לא גדולות ולא קטנות.
            עבור אות גדולה- יודפס האינדקס ו#
            עבור אות קטנה- יודפס האינדקס ו?
         */

        // ex9b
        /*
            d1 = Destination{ name="London", num=200, price=300.0  }
            Output: 60000.0
            d1 = Destination{ name="London", num=50, price=300.0  }
            d2 = Destination{ name="London", price=100.0, num=50}
            Output: 5000.0
         */

        // ex10a
        /*
            arr = {5 7 12 15 21 26 40 51 71 84}
            what(arr, 2, 6)

            start   end     temp    arr[start]  arr[end]
            --------------------------------------------
            2       6       12      40          12
            3       5       15      26          15
            4       4       -       -           -

            Result:
            before =    {5 7 12 15 21 26 40 51 71 84}
            after =     {5 7 40 26 21 15 12 51 71 84}
         */
        // ex10b
        /*
            הפעולה עוברת במערך arr על
            טווח האינדקסים start עד end
            והופכת את סדר האיברים בטווח זה.

            (בטווח start-end
            מה שהיא ראשון יהפוך לאחרון
            ומה שהיה אחרון יהפוך לראשון.
            לא נוגעים באינדקסים שמחוץ לטווח זה)
         */
        // ex10c
        /*
            הפונקציה:
            public static void why(int[] arr, int s) {
                s = s % arr.length;
                what(arr, 0, arr.length - 1);   // היפוך סדר הערכים במערך כולו
                what(arr, 0, s - 1);    // היפוך סדר הערכים מההתחלה ועד s-1
                what(arr, s, arr.length - 1);   // היפוך סדר הערכים מ-s ועד הסוף
            }

            מעקב:
            why(arr, 4)

            line 1: arr = {5 7 12 15 21 26 40 51 71 84} // arr.length=10
                    s = 4 % 10 = 4
            line 2: arr = {84 71 51 40 26 21 15 12 7 5}
            line 3: arr = {40 51 71 84 26 21 15 12 7 5}
            line 4: arr = {40 51 71 84 5 7 12 15 21 26}

            Result:
            arr = {40 51 71 84 5 7 12 15 21 26}
         */
        // ex10d
        /*
            אין ערכים של s שעבורם לא תשתנה הרשימה arr !!
            השורה השניה בפונ' why מפעילה את הפונ' what
            בלי להתייחס בכלל לערכו של s,
            ולכן תשנה את הרשימה, לא משנה מה ערכו של s.
         */
        // ex10e
        /*
            עבור המעקב שביצענו על הפונ' why, מתקבל:
            s = 4
            original:   arr = {5 7 12 15 21 26 40 51 71 84}
                                          s-1
            before s:   arr = {84 71 51 40 | 26 21 15 12 7 5}
            after s:    arr = {40 51 71 84 | 5 7 12 15 21 26}

            הסבר:
            הפונ' "חוצה" את הרשימה סביב האינדקס s-1
            ומחליפה בין הצד הימני והשמאלי של המערך.

            הפונ' עושה swap על חלקים שלמים
            מתוך המערך arr וסביב הציר s
         */

        // ex11
        /*
            במחלקה Number עבור מספר num שהתקבל בבנאי:
            num1 - number of digits
            num2 - sum of digits
         */
        // ex11a
        /*
            equals:
            מספר ספרות של x שווה למספר ספרות של y
            סכום ספרות של x שווה לסכום ספרות של y
            isSame:
            מס' ספרות של this כפול סכום ספרות של other
            שווה ל-
            מס' ספרות של other כפול סכום ספרות של this

            (1)
            x = 123     num1=3  num2=6
            y = 222     num1=3  num2=6
            return=2

            (2)
            x = 12     num1=2  num2=3
            y = 120    num1=3   num2=2
            return=3

            (3)
            x = 4       num1=1  num2=4
            y = 9       num1=1  num2=9
            return=4

            (4) + (5)
            הסעיפים לא ברורים, מכיוון שהם דורשים רק ערך x
            אבל לא מתייחסים אל ערך ה-y שנשלח אל הפונ'.

            בכל מקרה, בדוגמאות שלנו, הראנו מספרים
            תלת-ספרתיים שמחזירים תוצאות שונות ממה שדורשים
            סעיפים אלה.
            לכן, בשני הסעיפים, התשובה היא כן.
         */

    }








    // Methods

    // ex5
    public static boolean isPerfectK(int[] arr, int k){
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        return sum % k == 0;
    }

    public static boolean isSuperPerfect(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if ( !isPerfectK(arr, i) )
                return false;
        }
        return true;
    }

    // ex8a
    public static boolean isPalindrom(int[] arr){
        for (int i = 0; i < arr.length / 2; i++) {
            if(arr[i] != arr[arr.length-1 - i]){
                return false;
            }
        }
        return true;
    }
    // ex8b
    public static boolean isEvenPalindrom(int[] arr){
        int i = 0;
        int j = arr.length-1;

        while (i<j) {
            while (i < j && arr[i] % 2 != 0) // כל עוד לא מצאנו ב-i ערך זוגי
                i++;
            while (i < j && arr[j] % 2 != 0) // כל עוד לא מצאנו ב-j ערך זוגי
                j--;
            if (arr[i] != arr[j])
                return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }
    // ex8c
    /*
        a) O(n)
        b) O(n)
            כי בודקים כל תא במערך פעם אחת ויחידה,
            ולא חוזרים אליו יותר.
            יש n תאים במערך.
     */

    // ex9c
}
