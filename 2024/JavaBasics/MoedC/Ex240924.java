package MoedC;

import java.util.Random;
import java.util.Scanner;

public class Ex240924 {
    public static void main(String[] args){
        // יישור קו משיעורים קודמים

        // פלט
        System.out.println(true);
        System.out.println('@');
        System.out.println(5555);
        System.out.println(3.14);
        System.out.println("This is a program");
        // קלט
        Scanner scan = new Scanner(System.in);
        int x;
        x = scan.nextInt();
        System.out.println("Number received: " + x);
        // תנאים
        // תנאי פשוט
        if(5 < 10) {
            // אם התנאי מתקיים - הבלוק הזה ירוץ
            System.out.println("This is an 'if' block");
        }
        else {
            // במידה והתנאי לא התקיים - הבלוק הזה ירוץ
            System.out.println("This is an 'else' block");
        }
        // תנאי יותר מורכב
        if('d' < 'c') {
            // אם התנאי מתקיים - הבלוק הזה ירוץ
            System.out.println("'d' < 'c'");
        }
        else if('d' == 'c'){
            System.out.println("'d' == 'c'");
        }
        else {
            // במידה והתנאי לא התקיים - הבלוק הזה ירוץ
            System.out.println("'c' < 'd'");
        }


        // Exercises:
        // https://www.w3resource.com/java-exercises/basic/index.php

        // ex81
        int[] arr1 = {20, 30, 40};
        //arr1[0];  // תמיד האינדקס הראשון
        //arr1[arr1.length - 1];    // תמיד האינדקס האחרון
        int temp = arr1[0];
        arr1[0] = arr1[arr1.length - 1];
        arr1[arr1.length - 1] = temp;

        System.out.println(arr1[0] + "," + arr1[1] + "," + arr1[2]);

        // ex82
        int[] arr2 = {20, 30, 67, 50, 40};
        int first = arr1[0];  // תמיד האינדקס הראשון
        int middle = arr1[arr1.length / 2];     // תמיד האינדקס האמצעי
        int last = arr1[arr1.length - 1];    // תמיד האינדקס האחרון
        // דרך ראשונה:
        if (first > middle && first > last){
            System.out.println("First is largest: " + first);
        }
        else if (middle > first && middle > last){
            System.out.println("Middle is largest: " + middle);
        }
        else {
            System.out.println("Last is largest: " + last);
        }
        // דרך שניה:
        if (first >= middle){   // take 'first'. we don't care about 'middle'
            if (first >= last){     // first is largest
                System.out.println("First is largest: " + first);
            } else {     // last is largest
                System.out.println("Last is largest: " + last);
            }
        }
        else {  // take 'middle'. we don't care about 'first'
            if (middle >= last){     // middle is largest
                System.out.println("Middle is largest: " + middle);
            } else {     // last is largest
                System.out.println("Last is largest: " + last);
            }
        }

        // ex83
        String str1 = "Python";

        String subStr = str1.substring(str1.length()-3);
        String finalStr = subStr + str1 + subStr;

        System.out.println(finalStr);
        //System.out.println(str1.substring(str1.length()-3) + str1 + str1.substring(str1.length()-3)); // one-line solution. less readable.


        // While Loop:
        /*
            while( <condition> ) {
                // code to run in loop..
            }

        */
        /*
            // Bad example (לולאה אינסופית):
            while (3 < 9){
                System.out.println("OK");
            }

            // Good example:
            int a = 0;
            while (a < 9){
                System.out.println("a=" + a);
                a++;
            }
        */

        // Exercises:
        //https://www.w3resource.com/c-programming-exercises/while-loop/index.php

        Scanner s = new Scanner(System.in);

        // ex1
        int b = 0;
        while (b <= 10){
            System.out.println(b);
            b++;
        }
        b = 10;
        while (b >= 0){
            System.out.println(b);
            b--;
        }

        // ex2
        // a) write while loop to read integers from user, until the number 0
        // b) inside the loop, calculate the sum of positive numbers
        System.out.println("Enter number");
        int sum = 0;

        // 1) create variable - צור משתנה בקרה
        int num = s.nextInt();
        // 2) add variable to condition -  הכנס משתנה בקרה אל תנאי של לולאה
        while (num != 0){
            if (num > 0)    // num is positive
                sum += num;
            // 3) update variable - עדכן משתנה בקרה
            num = s.nextInt();
        }
        System.out.println("Sum = " + sum);

        // ex3
        int n = 1;
        int prod = 1;
        while (n < 6){
            prod *= n;

            n++;
        }
        System.out.println("Product = " + prod);

        // ex4
        // משתני בקרה
        int num1 = s.nextInt();
        int temp1 = num1 + 1;
        // תנאי עצירה שמערב משתני בקרה
        while (num1 != temp1){
            System.out.println("num1=" + num1 + " temp=" + temp1);
            temp1 = num1;
            // עדכון משתנה הבקרה
            num1 = s.nextInt();
        }

        // ex5
        // Great minds think alike
        Random rnd = new Random();
        int randNum = rnd.nextInt(1, 21);    // 1-20
        System.out.println("Computer entered: " + randNum);
        int userNum = 0;

        while (userNum != randNum){
            userNum = s.nextInt();

            while (userNum > 20 || userNum < 1){
                userNum = s.nextInt();
            }
            System.out.println("User entered: " + userNum);
        }
    }
}
