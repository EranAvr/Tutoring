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

}
