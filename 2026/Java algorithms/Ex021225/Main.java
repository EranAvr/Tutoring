package Ex021225;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            *
            * *
            * * *
            * * * *
        */
        /*for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j <= i)
                    System.out.print("*");
            }
            System.out.println();
        }*/
        /*for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/



        /*for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }*/


        /*for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }*/


        /*int n = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }*/



        /*int n = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 7/2-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }*/

        // ex7.3 - min/max of songs
        Scanner s = new Scanner(System.in);

        double max = 0; // חשוב לבחור ערך ראשוני מתאים
        int maxNumber = 0;  // ערך ראשוני חסר חשיבות
        double min = 10000; // לא אידיאלי כי עשינו הנחות יסוד
        int minNumber = 0;
        for(int i=0 ; i<100; i++){
            double len = s.nextDouble();
            if (len > max) {
                max = len;  // מצאנו max חדש
                maxNumber = i;
            }
            if (len < min) {
                min = len;  // מצאנו max חדש
                minNumber = i;
            }
        }
        System.out.println(maxNumber + " : " + max);
    }
}
