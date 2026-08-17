package Mahat_2025_Spring_A;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        /*{
            String str, longy, shorty;
            int count = 0;

            str = in.nextLine();
            longy = str;
            shorty = str;
            if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z'
                    || str.charAt(str.length() - 1) >= 'A' && str.charAt(str.length() - 1) <= 'Z')
                count++;

            for (int i = 0; i < 29; i++) {
                str = in.nextLine();
                if (str.length() > longy.length()) longy = str;
                if (str.length() < shorty.length()) shorty = str;
                if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z'
                        || str.charAt(str.length() - 1) >= 'A' && str.charAt(str.length() - 1) <= 'Z')
                    count++;
            }
            System.out.println(longy);
            System.out.println(shorty);
            System.out.println(count);
        }*/

        // ex3
        /*int countEven = 0, countHasEvens = 0;
        for (int i = 0; i < 60; i++) {
            int num = rnd.nextInt(100, 1000);
            if (num % 2 == 0)
                countEven++;
            if ((num%10) % 2==0 || (num/10%10) % 2==0 || (num/100) % 2==0)
                countHasEvens++;
        }
        System.out.println(countEven);
        System.out.println(countHasEvens);*/

        // ex5
        int[] resArr = doItNice(7);
        for (int n : resArr) {
            System.out.print(n + " ");
        }

        // ex7
        /*
            b)
            str = "ABC"
            c)
            str1 = "ABC"
            str2 = "AABBCC"
            d)
            הפונ' מוחקת כפילויות של תוים כאשר הן מופיעות ברצף.
         */
    }

    // METHODS

    public static boolean isNice(int[] arr){
        int mid = arr.length / 2;
        int sumLeft=0, sumRight=0;

        for (int i = 0; i < mid; i++)
            sumLeft += arr[i];
        for (int i = mid+1; i < arr.length; i++)
            sumRight += arr[i];

        return arr.length%2==1 && arr[mid]==sumLeft && arr[mid]==sumRight;
    }

    public static int[] doItNice(int size){
        Random rnd = new Random();
        int[] arr;

        int count = 0;
        do {
            arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = rnd.nextInt(100, 1000);
            }
            count++;
        } while(!isNice(arr));
        System.out.println("Trials: " + count);

        return arr;
    }

    // ex6
    public static int excellent(int[] gradesCountingArray){
        int sum = 0;
        for (int i = 90; i < 101; i++) {
            sum += gradesCountingArray[i];
        }
        return sum;
    }
    public static int higherGrade(int[] gradesCountingArray){
        for (int i = 100; i <= 0; i--) {
            if (gradesCountingArray[i] > 0)
                return i;
        }
        return -1;  // לא אמרו בשאלה מה להחזיר אם אין תלמידים בכלל. לכן החזרנו מינוס-1
    }
    public static int mostCommonScore(int[] countArr){
        int max = 0;
        int index = 0;
        for (int i = 0; i < 101; i++) {
            if (countArr[i] > max){
                max = countArr[i];
                index = i;
            }
        }

        return index;
    }

    // ex8
    public static int median(int[] arr){
        // קל למצוא חציון אם המערך ממויין
        // לכן, נמיין את המערך
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr[arr.length / 2];
    }
    // גרסא נוספת - פשוטה יותר להבנה
    // בגלל שאין חזרות בערכי המערך - אפשר פשוט
    // לספור כמה מספרים קטנים מהערך ה-i
    // לחציון יש בדיוק len/2 מספרים שקטנים (או גדולים) ממנו, במערך
    // ללא חזרות
    public static int medianBetter(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int countSmaller = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[i])
                    countSmaller++;
            }

            if (arr.length/2 == countSmaller)
                return arr[i];
        }
        return arr[0];  // ברירת מחדל כלשהי. ניתן להתאים לערך נכון יותר
    }
}
