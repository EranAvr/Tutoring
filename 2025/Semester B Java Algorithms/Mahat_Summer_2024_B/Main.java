package Mahat_Summer_2024_B;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random rnd = new Random();

        // ex1
        /*
        int countNegative = 0;
        int countPos = 0;
        double sumPos = 0;

        int num = 0;
        do {
            if (num < 0)
                countNegative++;
            if (num > 0){
                sumPos += num;
                countPos++;
            }
            num = s.nextInt();
        }while (num != 0);
        System.out.println("Count of negatives: " + countNegative);
        if (countPos == 0)
            System.out.println("No positives");
        else
            System.out.println("Average: " + (sumPos / countPos));

         */

        // ex2
        /*int count = 0;
        for (int i = 0; i < 20; i++) {
            String str = s.nextLine();
            if (str.length() % 2 == 0)
                System.out.println(str.charAt(0) + " " + str.charAt(str.length()-1));
            if (str.charAt(0)=='A' || str.charAt(str.length()-1)=='A')
                count++;
        }
        System.out.println("Count = " + count);*/

        // ex3
        /*int count = 0;
        for (int i = 0; i < 365; i++) {
            int num = rnd.nextInt(100, 1000);
            if ( num % 7 == 0 &&
                    (num/100==7 || num/10%10==7 || num%10==7) )
                count++;
        }
        System.out.println(count);*/

        // ex12c
        /*
            O(n^2)
         */

        // ex14a
        /*
            secret(12) -> return 6
            secret(7) -> return 2
            secret(15) -> return 4
         */
        // ex14b
        /*
            הפונ' סופרת את מספר המחלקים של המספר n,
            מ-1 ועד n כולל.
         */
        // 14c
        /*
            return 17
         */
        // 14d
        /*
            הפעולה מחזירה מספר מהמערך עם מינימום מחלקים
         */


    }






    // Methods
    // ex4
    public static boolean isTripple(int[] arr){
        if (arr.length % 3 == 1)
            return false;

        int sum1=0, sum2=0, sum3=0;
        /*
        // פתרון עם כמה לולאות
        for (int i = 0; i < arr.length / 3; i++) {
            sum1 += arr[i];
        }
        for (int i = arr.length/3; i < 2*arr.length/3; i++) {
            sum2 += arr[i];
        }
        for (int i = 2*arr.length/3; i < arr.length; i++) {
            sum3 += arr[i];
        }*/
        // פתרון עם לולאה אחת
        for (int i = 0; i < arr.length / 3; i++) {
            sum1 += arr[i];
            sum2 += arr[i + arr.length/3];
            sum3 += arr[i + 2*arr.length/3];
        }

        if (sum1%3==1 || sum2%3==1 || sum3%3==1 )
            return false;

        int count3 = 0;
        for (int i = 0; i < arr.length; i++) {
            count3++;
        }
        if (count3 != 3)
            return false;

        return true;
    }

    // ex12a
    public static boolean isExtreme (int[][] mat, int col, int value){
        int max = mat[0][col];
        int min = mat[0][col];

        for (int i = 0; i < mat.length; i++) {
            if (mat[i][col] > max)
                max = mat[i][col];
            if (mat[i][col] < min)
                min = mat[i][col];
        }

        return value==max || value==min;
    }
    // ex12b
    public static boolean isPair (int[][] mat, int[] arr){
        if (arr.length != mat[0].length)
            return false;
        for (int i = 0; i < arr.length; i++) {
            if (!isExtreme(mat, i, arr[i]))
                return false;
        }

        return true;
    }
}
