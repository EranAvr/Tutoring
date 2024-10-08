package MoedC;

import java.util.Scanner;

public class Ex081024_b {
    public static void main(String[] args) {

        // Testing code:
        Scanner s = new Scanner(System.in);

        // ex12
        System.out.println("Enter number of levels");
        int n = s.nextInt();
        ex12(n);

        // ex14
        System.out.println("Enter number of levels");
        int n1 = s.nextInt();
        ex14(n1);

    }

    // Exercises
    // https://www.w3resource.com/c-programming-exercises/for-loop/index.php

    // ex12
    public static void ex12(int n){
        int count = 1;

        for(int i=0; i < n; i++){
            for(int j=0; j < i+1; j++){
                System.out.print(count + "\t");
                count++;
            }
            System.out.println();
        }
    }

    public static void ex14(int n){
        int base = n + (n-1);
        int gaps = (base - 1) / 2;

        for (int line = 1; line <= n; line++){

            for (int i=0; i<gaps; i++){ // הדפסת רווחים בהתחלה
                System.out.print(" ");
            }
            for (int i=0; i<line; i++){ // הדפסת  כוכביות ורווחים שביניהן
                System.out.print("*");
                if (i < line-1){
                    System.out.print(" ");
                }
            }
            for (int i=0; i<gaps; i++){ // הדפסת רווחים בסוף
                System.out.print(" ");
            }

            System.out.println();   // ירידת שורה
            gaps--;
        }
    }
}
