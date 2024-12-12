package MoedC;

import java.util.Scanner;

public class Ex221024_a {
    public static void main(String[] args) {
        // ex5
        /*
            a)
            int[] = {-2,-3,4,-1,-2,1,5,-3}

            m | s | i
           -----------
            -2| 0 | 0
            -2|-2 |
            -2| 0 |
            -2|-3 | 1
              | 0 |
            -2| 4 | 2
             4| 4 | 2
             4| 3 | 3
             4| 0 | 3
             4|-2 | 4
             4| 0 |
             4| 1 | 5
             4| 0 |
             4| 5 | 6
             5| 5 |
             5| 2 | 7
             return 5;

             int[] = {2,3,4,-10,20, -1, 4}
            m | s | i
           -----------
            2 | 0 | 0
            2 | 2 |
            5 | 5 | 1
            9 | 9 | 2
            9 |-1 | 3
            9 | 0 |
           20 |20 | 4
           20 |19 | 5
           23 |23 | 6

           b)   האלגוריתם מחשב סכום מצטבר של רצף תאים
                ושומר סכום גדול ביותר שנמצא עד כה.
                הפונקציה מחזירה סכום גדול ביותר של רצף תאים במערך.
           c) אם כל האיברים במערך הם אי שליליים, אז הסכום המצטבר רק יגדל!
                לכן, הסכום שנחזיר יהיה סכום כל איברי המערך.
        */

        // ex6
        Subject algoA = new Subject("algorithmic_A", 8, 70, 3);
        Subject oop = new Subject("OOP", 4, 60, 4);

        algoA.getPoints(5, 80);  // עבור התלמיד דני
        algoA.getPoints(4, 70);  // עבור התלמיד עזרא

        oop.getPoints(3, 90);    // עבור דני
        oop.getPoints(10, 100);    // עבור עזרא

        // ex7
        /*
            a)
            str = "aBbCdDeFggHi3"
                        ij
            str.length = 13

             i | j | temp
           -----------
            0 | 12
            1 | 12
            1 | 11
            1 | 10
            2 | 9  | BbCdDeFggH
            3 | 9
            3 | 8
            3 | 7  | CdDeF
            4 | 6
            5 | 6
            5 | 5  | D
            6 | 4
              |

         */

        // ex8
        // d) סיבוכיות הפעולה היא O(n)
        //      זאת בגלל שפועלת רק לולאה רגילה (לא מקוננת) שרצה על המערך
        //      לולאה נוספת שנמצאת ב-if מגיעה אחרי הראשונה, ולכן לא משפיעה
        //      על הסיבוכיות
        /*
            תזכורת בחישוב סיבוכיות:
            לולאה בתוך לולאה = n*n = O(n^2)
            לולאה אחרי לולאה = n+n = 2n = O(n)
         */

    }

    // ex6
    public static void result(Subject[] arr){
        Scanner s = new Scanner(System.in);

        int sum = 0;
        for(int i=0; i< arr.length; i++){
            int x = s.nextInt();    // מספר המטלות שביצע התלמיד
            int g = s.nextInt();    // ציון סופי שהתלמיד קיבל בבחינה
            // בדיקת נקודות של התלמיד במקצוע הנוכחי
            sum += arr[i].getPoints(x, g);
        }

        System.out.println(sum);
    }

    // ex8
    public static void checkGifts(Gift[] arr, int sum){
        int[] goodCodes = new int[arr.length];  // מערך עזר לשמירת קודים של מתנות
        int count = 0;  // משתנה לספירת המתנות עבור גברים שמצאנו
        // המשתנה count משמש אותנו גם כאינדקס כאשר נפנה אל מערך-הקודים

        // נחפש מתנות טובות, ונשמור את הקודים שלהן במערך goodCodes
        for (int i=0; i< arr.length; i++){
            if (arr[i].isForMan() && arr[i].getPrice() == sum){
                goodCodes[count] = arr[i].getCode();
                count++;
            }
        }

        // נבדוק האם מצאנו לפחות 3 מתנות שעומדות בבדיקה שעשינו
        if(count >= 3){
            System.out.println("At least 3 gifts were found:");
            for (int i=0; i<3; i++){    // בתרגיל ביקשו להדפיס רק 3 מתנות
                System.out.println(goodCodes[i]);
            }
        }
        else {
            System.out.println("Not enough gifts were found.");
        }
    }
}
