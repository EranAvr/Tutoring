package Ex060125;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        // ex10.5
        /*int[] temp = new int[10];
        // a)
        for (int i = 0; i < temp.length; i++) {
            temp[i] = 0;
        }
        // b)
        for (int i = 0; i < temp.length; i++) {
            temp[i] = s.nextInt();
        }
        // c)
        for (int i = 0; i < temp.length; i++) {
            temp[i] *= 2;
        }
        // d)
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i] / 2);
        }*/


        // ex10.6
        /*
        אלגוריתם:
        1) יצירת מערך בגודל 10
        2) קליטת 10 ציונים אל תאי המערך
        3) חישוב ממוצע של ערכי המערך
        4) הדפסת מרחקו של כל ציון מהממוצע
        יש להשתמש בערך מוחלט
         */
        /*int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        sum /= arr.length;

        for (int i = 0; i < arr.length; i++) {
            System.out.println( Math.abs(arr[i] - sum) );
        }*/


        // ex10.7
        /*int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i*i;
        }*/


        // ex10.8
        // a)
        /*
            התוכנית מדפיסה את איברי המערך
            אשר גדולים ממיקומם הסידורי
         */
        // b)
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i * 2)
                System.out.println(i);
        }

        // ex10.8
        // a)
        /*
            0
            3
            5
            7
            9
         */
        // b)
        /*
            התוכנית מדפיסה למסך את מיקומם (אינדקס)
            של הערכים השווים לערך התא האחרון במערך
         */
        // c)
        /*
        אם חייבים לקלוט תו-אחרי-תו, באופן נפרד,
        כן צריך מערך עזר. או לחלופין מחרוזת עזר לשרשור התוים.
        אם ניתן לשנות את אופי הקלט לקךליטת מחרוזת שלמה,
        לא צריך מערך עזר.
         */
    }
}
