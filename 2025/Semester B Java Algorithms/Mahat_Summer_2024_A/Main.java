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
}
