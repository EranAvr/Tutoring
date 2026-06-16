package Mahat_2024_Spring_A;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // ex1
        /*int count = 0;
        for (int i = 0; i < 30; i++) {
            int num = s.nextInt();
            if (num >= 100 && num <= 999){
                int d1 = num / 100;
                int d2 = (num / 10) % 10;
                int d3 = num % 10;
                System.out.println(d1 * d2 * d3);
            }

            if (num % 2 == 1)
                count++;
        }
        System.out.println(count);*/

        // ex2
        /*int countStartWithCapital = 0;
        int countNoDigitAtEnd = 0;

        while (true){
            String str = s.nextLine();
            if (str.length() < 6)
                break;

            if (str.length() % 2 == 1)
                System.out.println(str.charAt(str.length()/2));

            char c = str.charAt(0);
            if (c >= 'A' && c <= 'Z')
                countStartWithCapital++;
            c = str.charAt(str.length()-1);
            if (c < '0' || c > '9')
                countNoDigitAtEnd++;
        }*/

        // ex3a
        // ex3b
        int[] a = new int[10];
        fill(a, 10, 20);

        // ex7
        int[] arr = {123, 321, 114, 5, 231};
        System.out.println( isItBrothers(arr) );
        int[] arr2 = {123, 321, 114, 501, 231};
        System.out.println( isItBrothers(arr2) );


        // ex10
        // a1) [2,2,2,2,2,5]
        // a2)  הפעולה מחפשת את הערך x החל באינדקס k ומעלה
        //      אם מצאה- תחזיר אינדקס, אם לא מצאה- תחזיר -1
        // b)
        /*
            הפעולה בודקת שכל המספרים מהמערך b נמצאים גם במערך a
            ושומרים על הסדר היחסי המקורי ביניהם
            זימון הפעולה יחזיר false
         */
        // c)
        /*
            שתי הפונ' מוודאות שכל המספרים מהמערך b נמצאות גם במערך a,
            והסדר היחסי בין המספרים נשמר.
         */
    }

    // ex3a
    public static boolean isArranged(int[] arr){
        int minOfEvens = arr[0];
        int maxOfOdds = arr[1];
        for (int i = 0; i < arr.length; i+=2) { // אינדקסים זוגיים
            if (arr[i] < minOfEvens)
                minOfEvens = arr[i];
        }
        for (int i = 1; i < arr.length; i+=2) {
            if (arr[i] > maxOfOdds)
                maxOfOdds = arr[i];
        }

        return minOfEvens > maxOfOdds;
    }

    // ex3b
    // זה פתרון לא אידיאלי!!! מכיוון שהוא הסתברותי
    // באופן תיאורטי, יכול להיות שלעולם לא נמצא מערך תקין ונמשיך בלולאה אינסופית
    /*public static void fill(int[] arr, int a, int b){
        Random rnd = new Random();
        do {
            System.out.println("Trial");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rnd.nextInt(a, b+1);
            }
        } while (!isArranged(arr));

        // רק לצורך הבדיקה
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }*/

    // זה פתרון תקין ודטרמיניסטי (וודאי)
    public static void fill(int[] arr, int a, int b){
        Random rnd = new Random();
        int mid = (a + b) / 2;
        // השתמשנו ב-2 לולאות במקום אחת - כדי לחסוך את הצורך בתנאים בקוד
        // פחות חישובים - יותר טוב
        for (int i = 0; i < arr.length; i+=2) { // מספרים גדולים
            arr[i] = rnd.nextInt(mid, b+1);
        }
        for (int i = 1; i < arr.length; i+=2) { // מספרים קטנים
            arr[i] = rnd.nextInt(a, mid);
        }
    }

    // ex7a
    public static boolean isItBrothers(int num1, int num2){
        int c1=0, s1=0;
        int c2=0, s2=0;

        while(num1 > 0){
            c1++;
            s1 += num1 % 10;
            num1 /= 10;
        }

        while(num2 > 0){
            c2++;
            s2 += num2 % 10;
            num2 /= 10;
        }

        return c1==c2 && s1==s2;
    }
    // ex7b
    /*public static boolean isItBrothers(int[] arr){
        for (int i = 0; i < arr.length; i++) {  // לכל מספר שנבדק
            for (int j = i+1; j < arr.length; j++) {    // לכל המספרים שמולו
                if( !isItBrothers(arr[i], arr[j]) ){
                    return false;
                }
            }
        }
        return true;
    }*/
    // better solution:
    public static boolean isItBrothers(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {  // לכל מספר שנבדק
            if( !isItBrothers(arr[i], arr[i+1]) )
                return false;
        }
        return true;
    }


    // ex7c
    /*
        a) O(n)
        b) O(n^2)
            ניתן להוריד לסיבוכיות O(n)
     */

    // ex9c
    public static void printByMonth(Worker[] arr, int month){
        for (int i = 0; i < arr.length; i++) {  // נרוץ על כל העובדים
            if (arr[i].getBirthday().getMonth() == month){  // נפנה לחודש של תאריך יום-הולדת של עובד
                System.out.println(arr[i].getName());   // נדפיס את השם
            }
        }
    }

    // ex9d
    public static String youngest(Worker[] arr){
        Worker youngest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (youngest.getBirthday().after( arr[i].getBirthday()))
                youngest = arr[i];
        }
        return youngest.getName();
    }
}
