package Mahat_Spring_2024_B;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner s = new Scanner(System.in);

        // ex1:
        /*int num = rnd.nextInt(100, 1000);
        int min = num;
        for (int i=0; i<49; i++){
            num = rnd.nextInt(100, 1000);
            if (min > num){
                min = num;
            }
        }
        System.out.println(min);
        int sum = (num%10) + ((num/=10)%10) + (num/10);
        System.out.println(sum);*/


        // ex2
        /*int countEvenLen = 0;
        while (true){
            String str = s.nextLine();
            if (str.isEmpty())
                continue;
            if (str.charAt(0) == str.charAt(str.length()-1)){
                break;
            }
            int countA = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'A')
                    countA++;
            }
            System.out.println("countA = " + countA);
            if(str.length() % 2 == 0)
                countEvenLen++;
        }
        System.out.println("countEvenLen = " + countEvenLen);*/


        // ex3a
        // מימוש למטה
        /*int[] arr = {12, 3, 7, 15, 5, 12, 6};
        System.out.println(isBalanced(arr) + " " + isBalanced2(arr));
        int[] arr2 = {12, 3, 7, 15, 5, 12, 7};
        System.out.println(isBalanced(arr2) + " " + isBalanced2(arr2));
        // ex3b
        int[] arr3 = fill(10, 1, 100);
        for (int n : arr3)
            System.out.print(n + " ");
        System.out.println("\nis 'arr3' balanced? " + isBalanced2(arr3));
        */

        // ex5a
        /*
            1)
            num     x   y
            --------------
            12345   0   0
            12345   5   1
            1234    9   2
            123     12  3
            12      14  4
            1       15  5
            0 BREAK!

            return = x/y = 15/5 = 3

            2)
            הפונקציה מחזירה חישוב של סכום הספרות
            חלקי מספר הספרות.
            זהו בדיוק חישוב של ממוצע הספרות של מס' שלם חיובי
         */
        // ex5b
        /*
            1)
            int[] arr = {24, 34783, 1245, 68, 468, 95};

            i   res     arr[i]      arr[res]    res_after
            ---------------------------------------------
            1   0       34783       24          1
            2   1       1245        34783       1
            3   1       68          34783       3
            4   3       468         68          3
            5   3       95          68          3

            Output: 68

            2)
            הפונקציה רצה על תאי המערך, ומחפשת ממוצע-ספרות
            גדול ביותר.
            המשתנה res מתחיל מאינדקס 0 ושומר את התא עם
            הממוצע הגדול ביותר.
            לבסוף הפונ' מדפיסה את המס' שנמצא.
         */


        // ex6a
        /*
            s1 = "COMPUTERS"
            s2 = "CANNOTTHINK"

            i   ch      pos     out1        out2
            --------------------------------------
            0   C       0                   C
            1   O       4                   CO
            2   M       -1      M
            3   P       -1      MP
            4   U       -1      MPU
            5   T       5                   COT
            6   E       -1      MPUE
            7   R       -1      MPUER
            8   S       -1      MPUERS

            return = "MPUERS"+"COT" = "MPUERSCOT"
         */
        // ex6b
        /*
            הפונקציה מסדרת מחדש את האותיות של המחרוזת s1
            באופן הבא:
            אותיות ייחודיות (לא נמצאות ב-s2) יופיעו בהתחלה
            ואותיות משותפות יופיעו בסוף.

            הפלט הסופי יכיל מופע יחיד של כל אות מתוך s1,
            כלומר אנחנו מבטלים אותיות חוזרות.
         */

        // ex6c
        /*
            לא אפשרי לקבל תוצאה שווה על מחרוזות שונות.
            הסבר:
            מקרה 1 - אותיות זהות בסדר שונה
            s1 = "ABC"
            s2 = "CBA"
            המחרוזת s1 מכתיבה את סדר האותיות בפלט.
            הערך שנשלח אל s1 יקבע מה סדר האותיות בפלט ולכן
            על מחרוזות בסדר שונה נקבל פלט שונה.
            מקרה 2 - יש אותיות זרות
            s1 = "AAAZ"
            s2 = "AAA"
            אות שמופיעה רק במחרוזת s1 ולא ב-s2
            כן תופיע בפלט mystery(s1,s2)
            אבל לא תופיע בפלט של mystery(s2,s1)
            ניתן להכליל מקרה זה על מצב ש-s2 מכילה אות זרה
            שלא נמצאת ב-s1
         */


        // ex7
        /*
            b)
            t1 = {code=1122, age=10, price=120.0, isPossible=true}
            t2 = {code=2233,, age=10, price=55.0, isPossible=false}
            Output:
            2
            3

            c)
            t1.setIsPossible(false);
            t2.setPrice(101);
            t2.setIsPossible(true);
         */

        // ex8d
        /*
            a) O(n) אורך המספר הוא n ועוברים פעם אחת על כל ספרה
            b) O(n^2)   אורך המספרים הוא n ועבורים על כל ספרה של הראשון מול כל ספרה של השני
            c) O(n^2)   אורך המערך הוא n ועוברים על כל התאים מול כל התאים
         */

        // ex10
        /*
        1)
            arr = {12, 0, -344, -46, 670, 0}

            i   k   temp
            -------------
                0   [0,0,0,0,0,0]
     loop 1:
            0   0
            1   0
            2   0   [-344,0,0,0,0,0]
            3   1   [-344,-46,0,0,0,0]
            4   2
            5   2
     loop 2:
            0   2   [-344,-46,12,0,0,0]
            1   3   [-344,-46,12,0,0,0]
            2   4
            3   4
            4   4   [-344,-46,12,0,670,0]
            5   5   [-344,-46,12,0,670,0]
     loop 3:
            העתקה של תאי temp אל תאי arr בהתאמה
            תא אל תא על פי הסדר

            Result:
            arr = [-344,-46,12,0,670,0]
       2)
            הפעולה why מסדרת מחדש את המערך arr
            עם שליליים בהתחלה (משמאל)
             וחיוביים כולל 0 בסוף (מימין)
         */


        // ex11a
        /*
            s               if      else-if     else-else-if
            ------------------------------------------------
            aMrAdDYrM       true
            MrAdDYrM        false   false       false
            rAdDYr          true
            AdDYr           false   true
            AdDY            false   false       true

            Output:
            return false

            הפונ' בודקת האם האותיות הגדולות (בלבד!)
            מקיימות פולינדרום.
            כל שאר התוים במחרוזת קוצצו ממנה.
         */
        // ex11b
        /*
            s = "ABCCBA"
            s = "123321"
            s = "AAAAAA"
            s = "@#$$#@"
         */
        // ex11c
        /*
            הפעולה where בונה מחרוזת חדשה עם כל האותיות
            הגדולות של המחרוזת המקורית s (על פי סדר)
            ובודקת האם הן פולינדרום (בעזרת הפונ' what)

            הפעולות where ו-why שקולות לחלוטין!
         */

        // ex12a
        // מימוש למטה
        // ex12b
        /*
            סיבוכיות הפעולה המבוקשת היא:
            O(n)
            נשים לב!!
            הקוד מחולק לכמה פעולות עזר,
            כשכל אחת מהן רצה ב O(n)
            אבל (!!) ה-n של כל פעולה מוגדר אחרת

            הפרמטר n של isSuperBalanced הוא מס' השורות בטבלה
            הפרמטר n של isMinMaxBalanced הוא מספר התאים בשורה
            הפרמטר n של isNumBalanced הוא כמות הספרות של מספר
         */

        // ex14a
        /*
            a={2,4,7,13,18,21,30}
            num=20

            a   num     i   k   f       syso        return
            -----------------------------------------------
                        0   6   false
                        0   5   false
                        0   4   false
                                        "2  18"
                        1   3   true
                        2   3   true
                                        "7  13"
                        3   2   true                true

             Output: true
         */
        // ex14b
        /*
            הפונקציה בודקת האם קיימים
            שני מספרים במערך שסכומם
            שווה ל-num

            אם קיימים - מחזירה true
            אחרת - מחזירה false
         */
        // ex14c
        /*
            num = 5
            נמצא את ההפרש הזה בדיוק פעמיים
            עבור:
            i=0     k=2
            i=3     k=4
         */
        // ex14d
        /*
            הפונקציה מחפשת כמה פעמים
            מופיע ההפרש num בין שני ערכים במערך.
            הפונ' מקדמת מספרים לבדיקה ע"י
             גבול תחתון i וגבוול עליון k
             אם ההפרש קטן מידי - מקדמים את k
             אם ההפרש גדול מידי - מקדמים את i

             * האלגוריתם מתבסס על העובדה שהמערך ממויין בסדר עולה

         */

    }









    // Methods:
    public static boolean isBalanced(int[] arr){
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) // even index
                sumEven += arr[i];
            else    // odd index
                sumOdd += arr[i];
        }
        return sumEven == sumOdd;
    }


    public static boolean isBalanced2(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // subtract even-places and add odd-places
            sum += ((i%2) * arr[i]) - ((i+1)%2 * arr[i]);
        }
        return sum == 0;
    }

    public static int[] fill(int size, int x, int y){
        Random rnd = new Random();
        int[] arr = new int[size];
        int count = 0;
        do {
            count++;
            for (int i = 0; i < size; i++) {    // fill array with numbers
                arr[i] = rnd.nextInt(x, y+1);
            }
        } while ( !isBalanced(arr) );

        System.out.println("Number of trials: " + count);
        return arr;
    }

    // ex4
    public static void countProducts(){
        Scanner s = new Scanner(System.in);
        int[] counters = new int[4];

        while (true){
            int code = s.nextInt(); // code = מס' קטלוג
            if (code == 0)
                break;
            int q = s.nextInt();    // q = כמות

            int digit = code / 100;
            counters[digit-1] += q;
        }

        int total = 0;
        for (int i = 0; i < counters.length; i++) {
            System.out.println("Class " + (i+1) + " quantity = " + counters[i]);
            total += counters[i];
        }
        System.out.println("Total = " + total);
    }

    // ex8a
    public static boolean exist(int num, int digit){
        String myNum = Integer.toString(num);
        //String myNum2 = "" + num;

        // גירסא עם char
        /*for (int i=0; i<myNum.length(); i++){
            if (myNum.charAt(i) == ('0'+digit))
                return true;
        }*/

        // גירסא עם String
        /*String d = Integer.toString(digit);
        for (int i=0; i<myNum.length(); i++){
            String currentDig = "" + myNum.charAt(i);
            if (currentDig.equals(d))
                return true;
        }*/

        // גירסא מספרית int
        while (num > 0){
            if (num % 10 == digit)
                return true;
            num /= 10;
        }

        return false;
    }
    // ex8b
    public static boolean isStrangers(int num1, int num2){
        /*String n1 = Integer.toString(num1);
        String n2 = Integer.toString(num2);

        for (int i = 0; i < n1.length(); i++) {
            for (int j = 0; j < n2.length(); j++) {
                if (n1.charAt(i) == n2.charAt(j))   // מצאנו ספרות משותפות, לא זרים
                    return false;
            }
        }
        return true;*/

        while (num2 > 0){
            if ( exist(num1, num2%10) ) // הספרה נמצאה - לא זרים
                return false;
            num2 /= 10;
        }
        return true;
    }
    //ex8c
    public static boolean isItStrangers(int[] arr){
        // arr = {3333, 55555, 333333, 444}
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if ( !isStrangers(arr[i], arr[j]) )
                    return false;
            }
        }
        return true;
    }

    // ex12
    // פונקציות עזר:
    public static boolean isNumBalanced(int num){
        int sumOdd = 0;
        int sumEven = 0;

        while (num > 0){
            int digit = num % 10;   // קח את הספרה הימנית ביותר

            if (digit % 2 ==0)  // זוגי
                sumEven += digit;
            else // אי-זוגי
                sumOdd += digit;

            num /= 10;  // מקצצים את הספרה הימנית ביותר
        }

        return sumEven == sumOdd;
    }
    public static boolean isMinMaxBalanced(int[] arr){
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)   // מצאנו מספר גדול יותר מהמקסימלי
                max = arr[i];
            if (arr[i] < min)   // מצאנו מספר קטן יותר מהמינימלי
                min = arr[i];
        }

        return isNumBalanced(max) && isNumBalanced(min);
    }
    // זו הפונ' שבעצם ביקשו מאיתנו:
    public static boolean isSuperBalanced(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            if (!isMinMaxBalanced( matrix[i] )) // בדיקה על שורה בודדת מתוך הטבלה
                return false;
        }
        return true;
    }
}
