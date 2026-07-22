package Mahat_2022_Spring_A;

public class Main {
    public static void main(String[] args) {
        areGolden(123, 456456);
    }


    // METHODS:

    // ex10a
    /*
        אפשר למצוא פתרונות יעילים יותר באופן הבא:
        1. שילוב שתי הלולאות לאחת, אבל (!!) עלינו לבדוק בתנאי הסופי
        שהערכים שנשארו ב-n1 וב-n2 שניהם אפס, אחרת זה אומר שהמספרים באורך שונה.
        2. המרה של הקלטים למחרוזות.
        מכאן כל הבדיקות נעשות ב-O(1)
     */
    public static boolean areGolden(int n1, int n2){
        int right1 = n1 % 10;
        int right2 = n2 % 10;

        int left1 = right1;
        int left2 = right2;
        int count1 = 0;
        int count2 = 0;

        while (n1 > 0){
            left1 = n1 % 10;
            n1 /= 10;
            count1++;
        }
        while (n2 > 0){
            left2 = n2 % 10;
            n2 /= 10;
            count2++;
        }
        System.out.println(right1);
        System.out.println(left1);
        System.out.println(count1);

        System.out.println(right2);
        System.out.println(left2);
        System.out.println(count2);

        /*if (right1==right2 && left1==left2 && count1==count2)
            return true;
        else
            return false;*/

        return right1==right2 && left1==left2 && count1==count2;
    }
    // ex10b
    public static void goldenPairs(int[] arr){
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if ( areGolden(arr[i], arr[j]) ){   // שימוש בפונ' קודמת לבדיקת הזוגות
                    count++;
                    System.out.println("Found pair " + arr[i] + " " + arr[j]);
                }
            }
        }

        if (count == 0) // אם לא מצאנו אף זוג - הספירה נשארה עך אפס
            System.out.println("No pairs");
    }
}
