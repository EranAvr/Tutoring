package MidTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ex1a
        /*
            i   x   s   if(s>10)    Output
            ------------------------------
                    0
            1   2   2   false       "---"
            2   8   10  false       "---"
            3   6   16  true        "***"
            4   END-OF-LOOP
         */

        // ex1b
        // Input: 11, 1, 1

        // ex2a
        // boolean good = true  תיקון
        /*
            n>0     n%10==d     n       d   good
            ------------------------------------
                                8235    2   true
            true    false       823     2   true
            true    false       82      2   true
            true    true        8       2   false
            true    false       0       2   false
            false   END-OF-LOOP

            Output: false
         */
        // ex2b
        /*
            n = 30 (8, 11111111)
            d = 2
         */
        // ex2c
        /*
            קטע התוכנית מדפיס false
            אם נמצאה הספרה d בתוך
            המספר n,
            אחרת יודפס true.
         */

        // ex3
        /*
            סדר פעולות:
            1. צור לולאה החוזרת 20 פעמים
            1.1 קלוט מספר שלם דו ספרתי
            1.2 חשב סכום ספרות של המספר שנקלט
            1.3 אם מצאנו סכום ספרות גדול יותר-
            שמור אותו בתוך משתנה עזר max

            2. הדפס למסך את ערכו של max
         */
        Scanner s = new Scanner(System.in);
        int max = 0;
        for (int i=0; i<20; i++){
            int x = s.nextInt();
            // Extra: if we want to validate the input
            while (x<10 || x>99)
                x = s.nextInt();

            int sum = x/10 + x%10;
            if (sum > max)
                max = sum;
            /*if (x/10 + x%10 > max/10 + max%10)
                max = x;*/
        }
        System.out.println("Greatest sum: " + max);
    }
}
