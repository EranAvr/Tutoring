package Mahat_2024_Spring_A;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // ex1
        /*int count = 0;
        for (int i = 0; i < 30; i++) {
            int num = s.nextInt();
            if (num >= 100 && num <= 999){
                int d1 = num / 100;
                int d2 = (num / 10) % 10;
                int d3 = num % 10;
                System.out.println(d1 * d2 * d3);
            }

            if (num % 2 == 1)
                count++;
        }
        System.out.println(count);*/

        // ex2
        /*int countStartWithCapital = 0;
        int countNoDigitAtEnd = 0;

        while (true){
            String str = s.nextLine();
            if (str.length() < 6)
                break;

            if (str.length() % 2 == 1)
                System.out.println(str.charAt(str.length()/2));

            char c = str.charAt(0);
            if (c >= 'A' && c <= 'Z')
                countStartWithCapital++;
            c = str.charAt(str.length()-1);
            if (c < '0' || c > '9')
                countNoDigitAtEnd++;
        }*/

        // ex3a
        // ex3b
        int[] a = new int[10];
        fill(a, 10, 20);

    }

    // ex3a
    public static boolean isArranged(int[] arr){
        int minOfEvens = arr[0];
        int maxOfOdds = arr[1];
        for (int i = 0; i < arr.length; i+=2) { // אינדקסים זוגיים
            if (arr[i] < minOfEvens)
                minOfEvens = arr[i];
        }
        for (int i = 1; i < arr.length; i+=2) {
            if (arr[i] > maxOfOdds)
                maxOfOdds = arr[i];
        }

        return minOfEvens > maxOfOdds;
    }

    // ex3b
    // זה פתרון לא אידיאלי!!! מכיוון שהוא הסתברותי
    // באופן תיאורטי, יכול להיות שלעולם לא נמצא מערך תקין ונמשיך בלולאה אינסופית
    /*public static void fill(int[] arr, int a, int b){
        Random rnd = new Random();
        do {
            System.out.println("Trial");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rnd.nextInt(a, b+1);
            }
        } while (!isArranged(arr));

        // רק לצורך הבדיקה
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }*/

    // זה פתרון תקין ודטרמיניסטי (וודאי)
    public static void fill(int[] arr, int a, int b){
        Random rnd = new Random();
        int mid = (a + b) / 2;
        // השתמשנו ב-2 לולאות במקום אחת - כדי לחסוך את הצורך בתנאים בקוד
        // פחות חישובים - יותר טוב
        for (int i = 0; i < arr.length; i+=2) { // מספרים גדולים
            arr[i] = rnd.nextInt(mid, b+1);
        }
        for (int i = 1; i < arr.length; i+=2) { // מספרים קטנים
            arr[i] = rnd.nextInt(a, mid);
        }
    }
}
