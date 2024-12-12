package MoedC;

import java.util.Scanner;

public class Ex011024_c {
    public static void main(String[] args) {
        /*      Functions with Algorithms      */

        /*
            <func name and signature> ( parameters - מידע שנשלח אל הפונקציה) {

                // body of function
                פה נכתוב קוד שירוץ בקיראה לפונקציה

                // return - ערך מוחזר (תשובה)
            }
         */

        // Testing code:
        Scanner s = new Scanner(System.in);

        String res = myFunc(true, 'a', 8.5, "Eran");
        System.out.println(res);

        // ex8
        System.out.println("Enter num of odd numbers:");
        int num = s.nextInt();
        ex8(num);

        // ex9
        System.out.println("Enter num for levels:");
        num = s.nextInt();
        ex9(num);

    }

    // Example:
    public static String myFunc(boolean b, char c, double f, String str){
        // הגדרת משתני עזר מקומיים של הפונקציה
        String result = "";
        // ביצוע חישובים כרצוננו
        result += "b=" + b + "; ";
        result += "c=" + c + "; ";
        result += "f=" + f + "; ";
        result += "str=" + str + "; ";
        // החזרת ערך בהתאם לערך ההחזרה בחתימה של הפונקציה
        return result;
    }

    // Exercises
    // https://www.w3resource.com/c-programming-exercises/for-loop/index.php

    // ex8
    public static void ex8(int n){
        int a = 1;
        for(int i=0; i<n; i++){
            System.out.print(a + " ");
            a += 2;
        }
        System.out.println();   // לא קשור לתרגיל, רק כדי להוסיף ירידת שורה בסוף ההדפסה
    }

    // ex9
    public static void ex9(int n){
        for(int i=0; i < n; i++){
            for(int j=0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
