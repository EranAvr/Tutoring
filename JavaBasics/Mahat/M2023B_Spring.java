package Mahat;

import java.util.Random;
import java.util.Scanner;

public class M2023B_Spring {
    public static void main(String[] args) {
        ex1();
    }

    public static void ex1(){
        Scanner s = new Scanner(System.in);
        int count = 0;  // counter לחישוב הממוצע
        int sum = 0;    // סכום לחישוב הממוצע

        while (true){
            int num = s.nextInt();
            if (num == 500){    // תנאי עצירה
                break;
            }

            // b) פרמטרים לחישוב הממוצע אחרי הלולאה
            count++;
            sum += num;

            // a) חישוב סכום ספרות למס' אי-זוגי
            if (num % 2 == 1){  // מצאנו מס' אי-זוגי
                int digitsSum = 0;
                while (num > 0){    // חישוב סכום ספרות של num
                    digitsSum += num % 10;
                    num /= 10;
                }
                System.out.println("Sum of digits: " + digitsSum);
            }
        }

        double avg = (double) sum / count;  // חייבים להמיר משתנה ראשון ל-double, כי אחרת החלוקה תיהיה על int ותפספס את החלק העשרוני
        System.out.println(avg);
    }

    public static void ex2(){
        Scanner in = new Scanner(System.in);
        int countGoodStr = 0;

        for (int i = 0; i < 23; i++) {  // נרוץ 23 פעמים לקליטת 23 מחרוזות
            String str = in.nextLine();

            int count = 0;
            boolean foundAA = false;
            for (int j = 0; j < str.length(); j++) {    // לכל מחרוזת שנקלטה- נרוץ על כל התוים שלה

                if(str.charAt(j) == 'A'){
                    count++;
                }

                /*
                    בחלק הבא אנחנו בודקים האם קיימים שני תוים 'A' ברצף.
                    הבדיקה נעשית ע"י השוואה בין התא j לבין התא j+1, ובודקים האם בשניהם יש תו 'A'.
                    אבל! בלולאה רגילה, נקבל חריגה באיטרציה האחרונה, מכיוון שכאשר j על התא האחרון
                    j+1 נמצא מחוץ למערך.
                    לכן- אנחנו מגבילים את j שיגיע עד לתא אחד-לפני-האחרון, ובכך אין חריגה מהמערך.
                 */
                if (j <= str.length()-2 && str.charAt(j) == 'A' && str.charAt(j+1) == 'A'){
                    foundAA = true;
                }
            }

            boolean res = count >= 2 && foundAA == false;
            System.out.println("Is string is OK: " + res);
            if (res)
                countGoodStr++;
        }

        System.out.println(countGoodStr);
    }

    class Box{
        String color;
        int length;
        int width;
        int height;

        public Box(){
            Random rnd = new Random();
            int low = 20;
            int high = 100;

            this.color = "black";
            this.length = rnd.nextInt(high - low +1) + low;
            this.width = rnd.nextInt(high - low +1) + low;
            this.height = rnd.nextInt(high - low +1) + low;
        }
    }
    public static boolean isBlackWhite(Box[] arr){
        boolean blackFlag = false, whiteFlag = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].color.equals("white") )
                whiteFlag = true;
            if(arr[i].color.equals("black") )
                blackFlag = true;
            if (!arr[i].color.equals("white") && !arr[i].color.equals("black"))
                return false;

            /*
            if (arr[i].color.equals("white") )
                whiteFlag = true;
            else if(arr[i].color.equals("black") )
                blackFlag = true;
            else {
                return false;
            }*/

        }
        boolean res = whiteFlag && blackFlag;
        return res;
    }

    // ex9a)
    // מימוש ראשון
    public static boolean isDivisible(String s, int k){
        /*
          במימוש זה, אנו שומרים את תת המחרוזת הראשונה,
            ומשווים אותה אל תתי-המחרוזות בשאר חלקי המחרוזת s.
         */
        if (s.length() % k != 0)    // המחרוזת לא מתחלקת לתתי מחרוזות באופן שווה
            return false;
        int lengthOfSubString = s.length() / k;
        String subStr = s.substring(0, lengthOfSubString);

        for (int i = 0; i < s.length(); i += lengthOfSubString) {
            /*
                Example - טבלת מעקב:
                    s = "AbcAbcAbc"
                    k = 3
                    lengthOfSubString = 3
                    s.length() = 9
                    i = 0, 3, 6
             */
            if ( !subStr.equals(s.substring(i, i + lengthOfSubString)) ){   // במידה והחלק הנבדק לא שווה לתת המחרוזת שחילצנו
                return false;
            }
        }
        return true;
    }
    // מימוש חלופי
    public static boolean isDivisible(String s, int k){
        /*
          במימוש זה, אנו שומרים את תת המחרוזת הראשונה,
            ומשווים אותה אל תתי-המחרוזות בשאר חלקי המחרוזת s.
         */
        if (s.length() % k != 0)    // המחרוזת לא מתחלקת לתתי מחרוזות באופן שווה
            return false;
        int lenSubStr = s.length() / k;

        /*
            Example - טבלת מעקב:
            s = "XyXyXyXy"
            k = 4
            lenSubStr = 2
            i = 0   j = 2, 4, 6
            i = 1   j = 3, 5, 7
         */
        for (int i = 0; i < lenSubStr; i++) {   // לכל תו בתת-המחרוזת הראשונה
            for (int j = i+lenSubStr; j < lenSubStr; j += lenSubStr) {  // נשווה עם תו במקום ה-j
                if ( s.charAt(i) !=  s.charAt(i)){   // במידה והתוים לא תואמים - אז תתי המחרוזות הנבדות לא תואמות
                    return false;
                }
            }
        }
        return true;
    }

    // ex9b)
    public static int maxDivisor (String s){
        // עוד לא פתרנו
        // נעשה שימוש בפונ' מסעיף א' בשביל בדיקת התנאי שמבקשים
    }
}
