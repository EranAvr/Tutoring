package Ex130126;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
/*
        String str = "Good Morning";
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                newStr += str.charAt(i);
        }
        System.out.println(newStr);
*/



        int[] numbers = {10,20,30,40,50};


        /*
        int size = s.nextInt(); // מס' התלמידים בכיתה
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {  // קליטת ציונים
            arr[i] = s.nextInt();
        }
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];  // סכום הציונים
        }
        avg /= arr.length;  // חישוב ממוצע
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > avg)
                count++;    // ספירת תלמידים שהצליחו יותר מהממוצע
        }
        System.out.println(count);*/



        // ex10.12
        // [0,0,0,0,0,1,1,1,1,1,]
/*
        int size;
        do {
            size = s.nextInt();
        } while (size%2 != 0);
        int[] arr = new int[size];*/

        // OK solution:
        /*for (int i = 0; i < arr.length; i++) {
            if (i < arr.length/2)
                arr[i] = 0;
            else
                arr[i] = 1;
        }*/
        // Better solution:
        /*for (int i = 0; i < arr.length/2; i++) {
            arr[i] = 0;
        }
        for (int i = arr.length/2; i < arr.length; i++) {
            arr[i] = 1;
        }*/
        // Best solution:
        /*for (int i = 0; i < arr.length/2; i++) {
            arr[i] = 0;
            arr[i + arr.length/2] = 1;
        }*/


        // ריצה על אינדקסים זוגיים
        /*for (int i = 0; i < arr.length; i+=2) { // כל האינדקסים הזוגיים

        }*/

        // ex10.13
        /*
            c)
            נכתוב לולאה שמקפיצה את i
            ב-5 כל פעם
         */

        // ex10.14
        /*
            a)
            הקטע קוד רץ על מערך מהתחלה ועד הסוף,
            ועוצר ברגע שנמצא ערך שהוא גדול/שווה
            לתא האחרון.
            הקוד ידפיס את האינדקס של הערך שנמצא.
            b)
            קטע הקוד בודק באינדקסים המתחלקים ב-10
            האם ערך התא שלהם קטן מהתא האחרון.
            התוכנית סופרת כמה ערכים שכאלה קיימים,
            ומפדפיסה למסך את התוצאה.
         */
        // c)
        /*for (int i = 0; i < arr.length; i+=10) {

        }*/

        // בעיה 3
        /*char[] board = new char[30];
        Random rnd = new Random();
        char[] symbols = {'T', 'F'};

        for (int i = 0; i < board.length; i++) {
            board[i] = 'T';
        }
        for (int i = 0; i < 5; i++) {
            int idx = rnd.nextInt(board.length);
            board[idx] = 'F';
        }
        board[0] = 'T';
        board[board.length-1] = 'T';

        for (int i = 0; i < board.length; i++) {
            System.out.print(board[i] + "|");
        }
        System.out.println();*/


        /*
            כתבו לולאה המריצה את מהלך המשחק:
            1) הטלת קובייה
            2) אם השחקן יכול להגיע למשבצת ריקה - נקדם אותו
            3) אחרת - לא נעשה דבר
         */
        /*int position = 0;

        while (position < board.length-1) {
            int dice = rnd.nextInt(1, 7);
            int newPos = position + dice;
            if (newPos < board.length && board[newPos] == 'T') {   // האם פנוי
                position = newPos;
                System.out.print(dice + ",");
            }
        }*/


        // ex10.18
        // פחות מומלץ:
        //char c1 = s.next().charAt(0);   // משאיר את התו Enter ב-buffer וצריך למחוק אותו ידנית
        // עדיף:
        //char c2 = s.nextLine().charAt(0);   // מוחק את התו Enter מה-buffer

        // ex10.18
        // abcabacadcababddaaab
        char[] chars = new char[6];
        // קליטה
        for (int i = 0; i < chars.length; i++) {
            chars[i] = s.nextLine().charAt(0);
        }
        // בדיקה
        String end = chars[chars.length-2] + "" + chars[chars.length-1];
        int count = 0;
        for (int i = 0; i < chars.length - 3; i++) {
            // ללא מחרוזות (יותר יעיל בזמן ריצה)
            if (chars[i]==chars[chars.length-2] && chars[i+1]==chars[chars.length-1])
                count++;
            // עם מחרוזות (פחות מהיר אבל יותר אינטואטיבי)
            /*String check = chars[i] + "" + chars[i+1];
            if (check.equals(end))
                count++;*/
        }
        System.out.println(count);
    }
}
