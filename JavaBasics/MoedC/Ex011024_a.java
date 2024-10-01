package MoedC;

import java.util.Scanner;

public class Ex011024_a {
    public static void main(String[] args) {
        /*      While Loop      */

        /*
        while ( <boolean condition - תנאי בוליאני> ) {
            // block of code - שורות קוד שירוצו שוב ושוב
            // כל עוד התנאי מתקיים
        }
         */

        // Exercises
        Scanner s = new Scanner(System.in);

        // ex6
        // factorial(n) = 1*2*3*4*5*6*......*n
        System.out.println("Enter a number: ");
        int n = s.nextInt();    // מספר סף - גבול עליון
        int x = 1;
        int fact = 1;

        while (x <= n){
            fact *= x;
            x++;
        }
        System.out.println("Factorial of " + n + " = " + fact);

        // ex7
        String userName = "";

        while ( userName.length() < 8 ){
            System.out.println("Enter username, longer than 8 chars:");
            userName = s.nextLine();
        }
        System.out.println("Username entered: " + userName + " Length: " + userName.length());

        // ex10 - Fibonacci sequence
        /*
            https://en.wikipedia.org/wiki/Fibonacci_sequence

            1. משתני עזר התחלתיים
            2. לולאה עם תנאי עצירה עצמאי (כי איכפת לנו רק ממספר האיברים שחישבנו)
            3. חישוב האיבר הבא בסדרה
            4. עדכון של המשתנים a ו-b
         */
        int limit = 11, i = 0;   // לניהול הלולאה
        int a=0, b=1;

        System.out.print(a + ", " + b);
        while (i < limit){  // limit is the number of EXTRA values we want to compute
            // נייצר איבר חדש לסדרה
            int sum = a + b;
            System.out.print(", " + sum);

            // נעדכן את a ו-b
            a = b;
            b = sum;

            // עדכון משתנה בקרה
            i++;
        }

    }
}
