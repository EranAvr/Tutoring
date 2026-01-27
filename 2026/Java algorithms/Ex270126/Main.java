package Ex270126;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // ex1
        /*
            כתבו פונ' המקבלת מערך של מספרים שלמים.
            א) הפונ' תדפיס למסך את המס' שמופיעים פעם אחת בלבד
            ב) הפונ' תחזיר את כמות המספרים הייחודיים שנמצאו
         */
        int[] arr = {1,2,1,3,1,5};
        //System.out.println("Unique:" + findUnique(arr));


        // ex2
        /*
            כתבו פונ' המקבלת מערך של מספרים שלמים.
            א) הפונ' תדפיס למסך את המס' שמופיעים בכפילות במערך
            (כלומר, פעמיים או יותר)
            * אין להדפיס את אותו המס' יותר מפעם אחת
            ב) הפונ' תחזיר את כמות המספרים הכפולים שנמצאו
         */
        int[] arr2 = {1,2,3,1,2,1};
        //System.out.println("Multy:" + findMulty(arr2));


        // ex3
        /*
            כתבו פונ' המקבלת מערך של מספרים שלמים.
            הפונ' תחזיר מערך חדש שהוא שרשור של שני המערכים.
            כלומר:
            arr3 = arr1 + arr2
            יש לשמוא על הסדר
         */
        int[] a1 = {1,2,3};
        int[] a2 = {4,5,6,7};
        //int[] a3 = mergeArrays(a1, a2);
        //System.out.println(Arrays.toString(a3));


        // ex
        /*
            כתבו פונ' המקבלת 2 מערכים ממויינים (!!).
            הפונ' תחזיר מערך ממויין חדש, המכיל את כל
            ערכי המערכים המתקבלים.
         */
        int[] a10 = {1,2,5,8,9};
        int[] a20 = {2,100};
        int[] a30 = mergeSorted(a10, a20);
        System.out.println(Arrays.toString(a30));


        // ex4
        /*
            כתבו פונ' המקבלת שתי מחרוזות.
            הפונ' תבדוק האם מחרוזת אחת היא אנאגרם של השנייה.
            כלומר, אחת היא היפוך אותיות של השניה.
            א) פתרו ללא הגבלות
            ב) פתרו בסיבוכיות O(n)
         */


        // ex5
        /*
            כתבו פונ' המקבלת מערך מספרים, וסופרת
            כמה ערכים שונים קיימים במערך.
            כלומר, יש לספור את הערכים השונים במערך,
            ולהתעלם מכפילויות.
            הפונ' תחזיר את מס הערכים השונים שנמצאו.
         */

        // ex6
        /*
            כתבו פונ' המקבלת מערך מספרים.
            הפונ' תדפיס למסך את הערכים השונים של המערך
            וכמה פעמים הם מופיעים במערך.
            א) ניתן לפתור למערך של מס' חיוביים בלבד
            ב) לפתור למערך מספרים שלמים באופן כללי
         */
    }

    // ex1
    public static int findUnique(int[] arr){
        int globalCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int countI = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j])
                    countI++;
            }
            if (countI == 1) {    // מופיע פעם יחידה
                globalCount++;
                System.out.println(arr[i]);
            }
        }
        return globalCount;
    }


    // ex2
    public static int findMulty(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) // ראינו כבר, לכן נתעלם
                    found = true;
            }
            if (found)
                continue;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) { // מצאנו כפילות בפעם הראשונה
                    System.out.println(arr[i] + " ");
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    // ex3
    public static int[] mergeArrays(int[] a, int[] b){
        int[] c = new int[a.length + b.length];
        int j = 0;
        for (int i = 0; i < a.length; i++, j++) {
            c[j] = a[i];
        }
        for (int i = 0; i < b.length; i++, j++) {
            c[j] = b[i];
        }
        return c;
    }

    // ex4
    public static int[] mergeSorted(int[] a, int[] b){
        int i=0, j=0;
        int[] c = new int[a.length + b.length];
        int k=0;
        while (i<a.length && j< b.length){
            if (a[i] < b[j]){   // אם המספר הקטן מגיע מהמערך הראשון
                c[k] = a[i];
                i++;
            }
            else {  // אם מגיע מהמערך השני
                c[k] = b[j];
                j++;
            }
            k++;    // קידום ידני לאינדקס של המערך החדש c
        }
        while (i<a.length){
            c[k] = a[i];
            i++;
            k++;
        }
        while (j<b.length){
            c[k] = b[j];
            j++;
            k++;
        }

        return c;
    }
}
