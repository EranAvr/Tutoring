package Mahat_Spring_2024_A;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // ex1:
        int countOdd = 0;
        /*
            נוסחא לספירת איטרציות בלולאה: אחרון - ראשון + 1
            29 - 0 + 1 = 30
         */
        for (int i=0; i<30; i++){
            int num = s.nextInt();
            // b)
            if (num % 2 == 1){
                countOdd++;
            }
            // a) 3 digits number
            if (num >= 100 && num <= 999){
                /*int sum = num % 10;
                sum *= (num /= 10) % 10;
                sum *= num / 10;*/
                int sum = (num % 10) * ((num /= 10) % 10) * (num / 10);
                System.out.println("mult digits is " + sum);
            }
        }
        System.out.println("Number of odd inputs: " + countOdd);

        // ex2:
        String str = s.nextLine();
        int countBig = 0, countNotSmall = 0;
        while (str.length() >= 6){
            if (str.length() % 2 == 1){
                System.out.println("Mid char: " + str.charAt(str.length()/2));
            }
            if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z'){
                countBig++;
            }
            int lastIdx = str.length()-1;
            if (str.charAt(lastIdx) < '0' || str.charAt(lastIdx) > '9'){
                countNotSmall++;
            }
            str = s.nextLine();
        }
        System.out.println("Starts with A-Z: " + countBig);
        System.out.println("Ends without a digit: " + countNotSmall);

        // ex3:
        // הפונ' ממומשות למטה

        // ex4:
        // TODO לפתור


        // ex5a:
        /*
            what() :
                a   b   output
                        3 7
                3   7
                10  7
                10  3
                7   3
                        7 3
             where() :
                arr[0]  arr[1]  output
                                3 7
                3       7
                10      7
                10      3
                7       3
                                7 3
              main() :
                output
                "x, y: 3 7"
                "z: 7 3"
         */

        // ex5b
        /*
            where() :
                arr[0]  arr[1]  output
                                3 7     // print in where()
                                3 7     // print in what()
                                7 3     // print in what()
                                3 7     // print in where()
         */


        // ex6a:
        /*
            s1 = EL
            s2 = HELLO

                pos     s1      s2
                        "EL"    "HELLO"
                1       "L"     "HLLO"
                1       ""      "HLO"
             הפונקציה מחפשת תוים מתוך s1 במחרוזת s2
             אם התו נמצא בs2 נקצץ אותו מהמחרוזת s1
             הפונ' תחזיר true רק אם כל התוים ב-s1
             נמצאו בתוך המחרוזת s2

             a) כל מחרוזת שהיא וריאציה של התווים "HELLO!"
             תחזיר לנו true

             b) כדי לקבל true
             כל התוים של s1 צריכים להמצא בתוך s2
             לכן, אם s1 הוא תת-מחרוזת של s2 ובהכרח קצר ממנו
             אז הקריאה secret(s1,s2) תחזיר true
             אבל הקריאה secret(s2,s1) תחזיר false
             לכן- הטענה לא נכונה!

             c) הפעולה בודקת האם כל התוים של מחרוזת s1
             נמצאים בתוך המחרוזת s2
         */
        // ex6b:
        /*
            a) arr = ["EL", "HELLO!", "sub", "submarine", "the", "then"]

            b) arr = ["EL", "EL", "sub", "sub", "the", "the"]
            הטענה לא נכונה!
            הראנו שגם עבור צמדי מילים זהות, כל האותיות של s1 ימצאו בתוך המילה הזהה s2
            ולכן נקבל true
            כלומר, ניתן לקבל צמדי מילים צמודות וזהות.

            c) הלולאה רצה n פעמים
                O(n)
               למעשה, הלולאה שלנו קופצת על זוגות של תאים כל פעם.
               כלומר, היא חוזרת רק חצי מהפעמים ביחד לאורך המערך n
               אבל! הפונ' O() שמסמלת את מספר החזרות בסיבוכיות לא מתייחסת
               לפעולות חשבון של מספר קבוע.
               כלומר
               O(n/2) = O(n)
               אנחנו מתעלמים לחלוטין מהכפלה/חילוק של מספר קבוע על הערך n
         */


        int[] a = {1,2,3,4,5};
        int n = a.length;
        for (int i = 0; i < n; i++) {

        }

    }

    // Methods:

    // ex3a:
    public static boolean isArranged(int[] arr){
        int minOfBigs = arr[0];  // ערך מינימלי מבין הגדולים (אינדקסים זוגיים)
        for (int i=0; i<arr.length; i+=2){
            if (minOfBigs > arr[i]){
                minOfBigs = arr[i];
            }
        }
        int maxOfSmalls = arr[1];    // ערך מקסימלי מבין הקטנים (אינדקסים אי-זוגיים)
        for (int i=1; i<arr.length; i += 2){
            if (maxOfSmalls < arr[i]){
                maxOfSmalls = arr[i];
            }
        }
        /*if (maxOfSmalls < minOfBigs){
            return true;
        }
        else {
            return false;
        }*/
        return maxOfSmalls < minOfBigs;
    }
    // ex3b:
    public static void fill(int[]arr, int a, int b){
        Random rnd = new Random();

        //int pivot = a + b / 2;
        int pivot = rnd.nextInt(a, b+1);

        for (int i=0; i< arr.length; i++){
            if (i % 2 == 0){    // אינדקסים זוגיים
                arr[i] = rnd.nextInt(pivot, b+1);
            }
            else {  // אינדקסים אי-זוגיים
                arr[i] = rnd.nextInt(a, pivot);
            }
        }
    }
}
