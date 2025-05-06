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
        // ממומש למטה


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

        // ex7
        // מימוש למטה

        // ex8
        // מימוש למטה


        // ex9
        // מימוש למטה

        // ex10a
        /*
            הפונקציה מקבלת מערך, ופרמטרים x ו-k
            הפונקציה מחפשת את הערך x במערך החלקי מהאינדקס k.
            אם נמצא- תחזיר את האינדקס
            אחרת- תחזיר -1
         */
        // arr = [1,1,1,1,1,5]
        // נדרש מערך שמכיל את הערך 5 באינדקס 5
        // אבל לא מכיל את הערך 3 אחרי האינדקס k=5
        // arr = [1,1,3,1,1,5]

        // ex10b
        /*
            הפונקציה where מחפשת את ערכי
            מערך b בתוך המערך הראשון a.
            ברגע שערך מ-b לא נמצא ב-a
            או (!!) לחלופין לא מופיע במערך  a  החלר ב-k והלאה - החיפוש נכשל ויחזיר false.
            אם כל הערכים מ-b נמצאים ב-a ומופיעים אחריהם,
            החיפוש יסתיים יחזיר true.
         */
        // תוצאת הזימון של הקריאה where(a,b) תחזיר false
        /*
            i   b[i]    k+1     k
            ---------------------
                                -1
            0   2       0       0
            1   4       1       1
            2   0       2       3
            3   9       4       -1

            return false
         */

        /*
        -----------------------------------------------
        // שאלה לא קשורה
        String[] arr;
        int num = 5;
        for (int i=0; i<arr.length; i++){
            if(arr[i].length() == num){
            }
        }
        -----------------------------------------------
         */

        // ex10c
        /*
            a = [2,4,9,1,2,0]
            b = [2,4,0,9,3]
         */

        // ex11
        // מימוש למטה
        // a)
        Main m = new Main();
        System.out.println(m.NumOfDays(22, 1));
        System.out.println(m.NumOfDays(22, 3));
        System.out.println(m.NumOfDays(1, 5));
        // b)
        System.out.println(m.Weekday(1, 1));
        System.out.println(m.Weekday(8, 1));
        System.out.println(m.Weekday(1, 2));
        System.out.println(m.Weekday(22, 3));
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

    // ex4
    private String name; // שם
    private double[] height; // מדידת גובה חודשית
    private double[] weight; // מדידת משקל חודשית

    public void setData(int month, double h, double w){
        // month -> 1 to 12
        // indices -> 0 to 11
        this.height[month-1] = h;
        this.weight[month-1] = w;
    }
    public double avgWeight(){
        // סכום המשקלים
        double sum = 0;
        for (int i=0; i<weight.length; i++){
            sum += weight[i];
        }
        // חלוקה
        return sum / weight.length;
    }
    public double getLastBmi(){
        int index = 0;
        for (int i = height.length-1; i >= 0; i--){
            if(height[i] > 0){  // מצאנו ערך מדידה שהתקיימה
                index = i;
                break;
            }
        }

        double w = this.weight[index];
        double h = this.height[index];

        double BMI = w / (h*h);
        return BMI;
    }


    // ex7a
    private int code;
    private int year;
    private boolean isHebrew;

    public boolean oldBook(int year1){
        int diff = year1 - this.year;
        /*if (diff >= 10){
            return true;
        } else {
            return false;
        }*/
        return diff >= 10;
    }
    // ex7b
    /*
        Book b1 = new Book(1122, 1998, false);
        Book b2 = new Book (2233, 2010, true);

        b1.oldBook      b1.getIsHebrew()    b1.oldBook(2014)&& !b1.getIsHebrew()
        true            false               true

        Output: "###"

        b2.oldBook
        false
        b2.getIsHebrew()
        true

        Output: "???"
     */

    // ex7c
    // נוסיף את שורת הקוד הבאה
    // b1.setIsHebrew(true);


    // ex8a
    public static boolean isItBrothers(int num1, int num2){
        // שיטות שקולות להמרת מס' שלם אל מחרוזת:
        /*
        String str1 = Integer.toString(num1);
        String str1 = String.valueOf(num1);
        String str1 = "" + num1;
        */
        boolean numOfDigits = Integer.toString(num1).length() == Integer.toString(num2).length();
        int sum1 = 0, sum2 = 0;
        while (num1 > 0){
            sum1 += num1 % 10;
            num1 /= 10;
        }
        while (num2 > 0){
            sum2 += num2 % 10;
            num2 /= 10;
        }

        /*if (numOfDigits && sum1 == sum2){
            return true;
        } else {
            return false;
        }*/
        return numOfDigits && sum1 == sum2;
    }

    // ex8b
    // arr = [12, 34, 56, 346, 17]
    public static boolean isItBrothers(int[] arr){
        for (int i=0; i<arr.length; i++){   // אינדקס i עבור ערך לבדיקה

            for (int j = 0; j < arr.length; j++) {  // אינדקס j עבור מתמודדים למספרים אחים
                if ( !isItBrothers(arr[i], arr[j]) ){    // אם נמצא כשלון - נחזיר false
                    return false;
                }
            }
        }

        // אם עברנו את כל הבדיקות בהצלחה - המערך תקין
        // כל המספרים אחים זה של זה
        return true;
    }


    // ex9c
    public static void printByMonth(Worker[] arr, int month){
        for (int i=0; i < arr.length; i++){
            if (arr[i].getBirthday().getMonth() == month){
                System.out.println( arr[i].getName() );
            }
        }
    }
    // ex9d
    public static String youngest(Worker[] arr){
        Worker minWorker = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if ( minWorker.getBirthday().after(arr[i].getBirthday()) ){
                minWorker = arr[i];
            }
        }

        return minWorker.getName();
    }

    // ex11
    int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int NumOfDays(int day, int month){
        int sum = 0;
        month--;  // תיקון ממספר חודש אל אינדקס החודש במערך
        for (int i=0; i<month; i++){
            sum += days[i];
        }
        sum += (day - 1);

        return sum;
    }
    /*
    public int Weekday(int day, int month){
        int totalDays = NumOfDays(day, month);
        while (totalDays > 7){
            totalDays -= 7;
        }
        int finalDay = (2 + totalDays) % 7;

        return finalDay;
    }*/

    public int Weekday(int day, int month){
        int anchor = 2; // day in a week for date: 1.1.2024

        int daysPassed = NumOfDays(day, month);
        return (anchor + daysPassed % 7) % 7;
    }
}
