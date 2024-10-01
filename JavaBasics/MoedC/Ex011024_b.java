package MoedC;

import java.util.Scanner;

public class Ex011024_b {
    public static void main(String[] args) {
        /*      For Loop      */

        /*
            for ( <create variable>; <boolean condition>; <steps/update variable> ){
                // block of code
                // גוף הלולאה שירוץ שוב ושוב
            }
         */

        // Exercies
        Scanner s = new Scanner(System.in);

        // ex1
        for (int i=1; i<=10; i++){
            System.out.print(i + ",");
        }
        System.out.println();   // רק להוסיף ירידת שורה

        // ex2
        int sum = 0;
        for(int i=1; i<=10; i++){
            sum += i;
        }
        System.out.println("Sum is: " + sum);

        // ex5
        System.out.println("Enter limit:");
        int limit = s.nextInt();
        for(int i=1; i <= limit; i++){
            int pow3 = i*i*i;
            System.out.println("Number is : " + i + " and cube of the 1 is :"+pow3);
        }
        // ex6
        System.out.println("Enter num for multiplication table:");
        int num = s.nextInt();
        for(int i=1; i<=10; i++){
            int res = num * i;
            System.out.println(num + "*" + i + "=" + res);
        }

        // ex7
        int n = s.nextInt();
        for (int i=1; i<=10; i++){
            for (int j=1; j<=n; j++){
                int mul = i * j;
                System.out.print(mul + "\t");
            }
            System.out.println();
        }

    }
}
