import java.util.Scanner;

public class Ex150525 {
    public static void main(String[] args) {

        // Nested loops exercises
        // url: https://www.w3resource.com/c-programming-exercises/for-loop/index.php

        // ex
        /*
            כתבו קוד הקולט מהמשתמש 2 מספרים שלמים חיוביים.
            התוכנית תדפיס למסך מלבן של כוכביות על פי המידות שהתקבלו.
            Input:
                a = 5   (גובה)
                b = 10  (רוחב)
            Output:
                **********
                **********
                **********
                **********
                **********

             for () {   // לולאה חיצונית במימד הגובה. מעבירה אותנו משורה לשורה

                for () {}   // לולאה פנימית במימד הרוחב. מתקדמת על העמודות (לאורך השורה)

             }
         */
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();    // גובה
        int b = s.nextInt();    // רוחב
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // ex9
        /*
            Write a program in Java to display a pattern like a
            right angle triangle using an asterisk.
            The pattern like :
            *
            **
            ***
            ****
         */
        int N = 4;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // ex10
        /*
            Write a Java program to display a pattern like a
            right angle triangle with a number.
            The pattern like :
            1
            12
            123
            1234
         */
        N = 4;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // ex11
        /*
            Write a Java program to display a pattern like a
            right angle triangle with a number.
            The pattern like :
            1
            22
            333
            4444
         */
        N = 4;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }


        // ex12
        /*
           Write a program in Java to make such a pattern like a right angle triangle with the number increased by 1.
           The pattern like :
           1
           2 3
           4 5 6
           7 8 9 10

           i = 0 1 2 3
           r = 0 1 3 6
           r = 1 2 4 7
         */
        N = 4;
        int num = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }


        // ex14
        /*
            Write a Java program to make such a pattern as a pyramid
            with an asterisk.
               *
              * *
             * * *
            * * * *
         */
        N = 4;
        int middle = N / 2 + 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j < middle-i || j > middle+i){
                    System.out.print(" ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }


        // ex17
        /*
            Write a Java program to make such a pattern like a pyramid
            with a number which will repeat the number in the same row.
               1
              2 2
             3 3 3
            4 4 4 4
         */


        // ex13
        /*
            Write a program in Java to make a pyramid pattern
            with numbers increased by 1.
               1
              2 3
             4 5 6
            7 8 9 10
         */


        // ex20
        /*
            Write a Java program to display the pattern as a pyramid
            using asterisks, with each row containing an odd number
            of asterisks.
               *
              ***
             *****
         */


        // ex22
        /*
            Write a program in C to print Floyd's Triangle.
            1
            01
            101
            0101
            10101
         */


        // ex26
        /*
            Write a program in Java to find the sum of the
            series 1 +11 + 111 + 1111 + ... n-terms.
            Test Data :
            Input the number of terms : 5
            Expected Output :
            1 + 11 + 111 + 1111 + 11111
            The Sum is : 12345
         */


        // ex31
        /*
            Write a program in Java to display a pattern
            like a diamond.
                *
               ***
              *****
             *******
            *********
             *******
              *****
               ***
                *
         */







        // -- CHALLENGE --
        // url: https://www.w3resource.com/java-exercises/basic/index.php
        // ex14
        /*
            Write a Java program to print an American flag on the screen.
            Expected Output:

            * * * * * * ==================================
             * * * * *  ==================================
            * * * * * * ==================================
             * * * * *  ==================================
            * * * * * * ==================================
             * * * * *  ==================================
            * * * * * * ==================================
             * * * * *  ==================================
            * * * * * * ==================================
            ==============================================
            ==============================================
            ==============================================
            ==============================================
            ==============================================
            ==============================================
         */
    }
}
