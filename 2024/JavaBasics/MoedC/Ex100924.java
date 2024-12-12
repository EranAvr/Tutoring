package MoedC;

import java.util.Scanner;

public class Ex100924 {
    public static void main(String[] args) {
        // ex1
        System.out.println("Hello World");
        // ex2
        System.out.println(74 + 36);
        // ex3
        System.out.println(50 / 3);
        // ex4
        System.out.println(-5 + 8 * 6); // 43
        System.out.println( (55+9) % 9 );   // 1
        System.out.println(20 + -3*5 / 8);  // 19
        System.out.println(5 + 15 / 3 * 2 - 8 % 3); // 13
        //  כפל, חילוק ומודולו הם שווי קדימות ולכן מחושבים זה אחר זה לפי סדר הופעתם

        // ex5
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        System.out.println( s.nextInt() * s.nextInt() );

        // ex6
        int x = s.nextInt();
        int y = 10;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);

        // ex7
        int a = 8;
        System.out.println(a * 1);
        System.out.println(a * 2);
        System.out.println(a * 3);
        /*
        .
        .
        .
         */
        System.out.println(a * 10);

        // ex44
        int b = s.nextInt();
        int sum = b + b*11 + b*111;
        System.out.println(sum);

        // ex70
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        System.out.println(str1 + str2 + str1);

        // ex72
        System.out.println("Enter string:");
        String str = s.nextLine();
        if (str.length() < 3){
            System.out.println("###");
        }
        else {
            System.out.println( str.substring(0, 3) );
        }

        // ex73
        String strFirst = s.nextLine();
        String strSecond = s.nextLine();
        String newStr = "";
        // handle first string
        if(strFirst.length() == 0){ // one way to check for empty string
            newStr += "#";
        } else {
            newStr += strFirst.charAt(0);
        }
        // handle second string
        if (strSecond.equals("")){ // another way to check for empty string
            newStr += "#";
        } else {
            newStr += strSecond.charAt(strSecond.length() - 1);
        }
        System.out.println(newStr);

        // ex74
        int[] arr = {10, -20, 0, 30, 40, 60, 10};   // array initializer list
        // first way:
        if (arr[0] == 10 || arr[arr.length - 1] == 10){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        // another way:
        System.out.println(arr[0] == 10 || arr[arr.length - 1] == 10);

        // ex77
        int[] Array1 = {50, -20, 0};
        int[] Array2 = {5, -50, 10};
        int[] newArray = { Array1[0], Array2[Array2.length-1] };
    }
}
