package MoedC;

import java.util.Scanner;

public class Ex081024_a {
    public static void main(String[] args) {

        // Testing code:
        Scanner s = new Scanner(System.in);

        // ex1
        // עלינו לקלוט מסםר שלם n מהמשתמש
        // התוכנית תדפיס למסך את n המספרים הראשוניים הקיימים
        // המספר n מייצג את כמות (!!) המספרים שתודפס למסך
        System.out.println("Enter number of prime numbers");
        int n1 = s.nextInt();
        ex1(n1);

        // ex2
        // עלינו לקלוט מספר c מהמשתמש אשר מייצג טמפרטורה בצלזיוס
        // התוכנית תבצע המרה של הטמפ' ליחידות קלווין ופרנהייט
        // ותדפיס את היחידות למסך
        System.out.println("Enter temp in celsius");
        double c = s.nextDouble();
        ex2(c);

        // ex3
        // כתבו תוכנית אשר מחשבת שטחים עבור 3 צורות שונות:
        // 1. מלבן
        // 2. מעגל
        // 3. משולש
        // התוכנית תקלוט בנפרד את הפרמטרים הנדרשים,
        // ותקראט לכל פונקציית חישוב בהתאם.
        ex3();

    }

    // Exercises
    // https://www.w3resource.com/c-programming-exercises/for-loop/index.php

    // ex1
    public static boolean isPrime(int num){
        // נבדוק בעזרת לולאה האם המספר num הוא ראשוני
        for (int i=2; i<=num/2; i++){
            if(num % i == 0){   // מחפשים מחלק שלם למספר num
                return false;   // אם מצאנו מחלק - המספר פריק (לא ראשוני)
            }
        }
        return true;    // אם עברנו את כל הבדיקות - המספר ראשוני
    }
    public static void ex1(int n){
        // רצה על מספרים עד שהודפסו n מספרים ראשוניים
        int count = 0;
        int value = 2;
        while (count < n){
            if(isPrime(value) == true){
                System.out.println(value + " is Prime");
                count++;
            }
            value++;
        }
    }

    // ex2
    public static double celsiusesToKelvin(double c){
        // T[K]= T[°C] + 273.15
        double k = c + 273.15;
        return k;
    }
    public static double celsiusesToFahrenheit(double c){
        // T(°F) = (T(°C) - 32) × 5/9)
        double f = (c - 32) * (5.0/9);
        return f;
    }

    public static void ex2(double cel){
        // test function celsiusesToKelvin:
        double k = celsiusesToKelvin(cel);
        System.out.println( k );
        // test function celsiusesToFahrenheit:
        double f = celsiusesToFahrenheit(cel);
        System.out.println( f );
    }

    // ex3
    public static double rectangleArea(double length, double height){
        double res = length * height;
        return res;
    }
    public static double circleArea(double radius){
        double res = Math.PI * radius * radius;
        return res;
    }
    public static double triangleArea(double base, double height){
        double res = base * height / 2;
        return res;
    }
    public static void ex3(){
        double check = rectangleArea(50, 10);
        System.out.println("rectangleArea(50, 10) = " + check);

        check = circleArea(10);
        System.out.println("circleArea(10) = " + check);

        check = triangleArea(10, 8);
        System.out.println("triangleArea(10, 8) = " + check);
    }
}
