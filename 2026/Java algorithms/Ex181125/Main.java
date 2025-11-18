package Ex181125;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        // ex2
        /*double num1, num2, max, min;
        num1 = s.nextDouble();
        num2 = s.nextDouble();
        if (num1 > num2){
            max = num1;
            min = num2;
        }
        else if (num1 < num2){
            max = num2;
            min = num1;
        }
        else {
            max = num1;
            min = num1;
        }
        System.out.println(max - min);*/

        // ex: odd or even
        /*int x = s.nextInt();
        if (x % 2 == 0){
            System.out.println(x + " is even");
        } else {
            System.out.println(x + " is odd");
        }*/

        // ex: positive or negative
        /*int x = s.nextInt();
        if (x > 0)
            System.out.println(x + " is positive");
        else if (x < 0)
            System.out.println(x + " is negative");
        else
            System.out.println("Zero!");*/

        int Y = s.nextInt();
        /*if (Y%4 == 0 && Y%100 != 0)
            System.out.println(Y + " is leap year");
        else if (Y%400 == 0)
            System.out.println(Y + " is leap year");
        else
            System.out.println(Y + " is NOT leap year");*/

        /*if (Y%4 == 0 && Y%100 != 0 || Y%400 == 0)
            System.out.println(Y + " is leap year");
        else
            System.out.println(Y + " is NOT leap year");*/

        // ex: largest of three numbers
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        /*if (a>b && a>c)
            System.out.println(a + " is largest");
        else if (b>a && b>c)
            System.out.println(b + " is largest");
        else
            System.out.println(c + " is largest");*/
        int largest = a;
        if (b > largest)
            largest = b;
        if (c>largest)
            largest = c;
        System.out.println(largest);

    }
}
