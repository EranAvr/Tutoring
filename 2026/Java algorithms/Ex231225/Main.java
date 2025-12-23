package Ex231225;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // ex9.18
        /*
            הדוגמא הבאה מראה יצירת לולאה עם תנאי
            על המחרוזת שהתקבלה כקלט. כדי שלא נעבוד על מחרוזת הסיום
            'end'
            עלינו לדרוש פעמיים קלט: פעם אחת לפני הלולאה,
            ופעמים נוספות בתוך הלולאה ובסופה.
         */
        /*String str = s.nextLine();
        while ( !str.equals("end") ){
            // לולאה לפירוק המחרוזת
            str = s.nextLine();
        }*/

        /*
            הדומא הבאה מראה כיצד ליצור לולאה עם תנאי
            על מחרוזת הקלט, אבל אנו מעוניינים לבקש קלט
            פעם אחת יחידה.
            לשם כך ניצור לולאה שהיא כביכול אינסופית,
            אבל נוסיף את תנאי העצירה בתוך הלולאה בעזרת
            תנאי if.
         */
        /*String str = "";
        while (true){
            str = s.nextLine();
            if (str.equals("end"))
                break;
            // לולאה לפירוק המחרוזת
            for (int i = 4; i < str.length(); i++) {
                if(str.charAt(i) == '.')
                    System.out.print(" ");
                else
                    System.out.print(str.charAt(i));
            }
            System.out.println();
        }*/

        /*
        while (true){
            String company = "";
            String suffix = "";
            int count = 0;

            String str = s.nextLine();
            if (str.equals("end"))
                break;
            // לולאה לפירוק המחרוזת
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '.' && count < 2)
                    count++;
                else if (count == 1)
                    company += str.charAt(i);
                else if (count >= 2)
                    suffix += str.charAt(i);
            }
            System.out.println(company + " " + suffix);
        }
        */

        // ex9.19
        int n = s.nextInt();    // מס' התורות למשחק
        s.nextLine();
        String startingWord = "start";
        for (int i = 0; i < n; i++) {
            // הדפסת מילה לתחילת המשפט הבא
            System.out.println("Start sentence with: " + startingWord);
            // קליטת משפט מהמשתמש
            String str = s.nextLine();
            // בדיקת מילה ראשונה של המשפט
            String first = "";
            int j = 0;
            while (str.charAt(j) != ' '){
                first += str.charAt(j);
                j++;
            }
            if ( !first.equals(startingWord) ){
                System.out.println("Error! Bye bye...");
                break;
            }
            // חילוץ מילה אחרונה בשביל התור הבא
            // דרך ארוכה:
            /*j = str.length() - 1;
            while (str.charAt(j) != ' ')
                j--;
            j++;
            String last = "";
            while (j < str.length()) {
                last += str.charAt(j);
                j++;
            }*/
            // דרך קצרה:
            String last = "";
            j = str.length() - 1;
            while (str.charAt(j) != ' '){
                last = str.charAt(j) + last;
                j--;
            }

            startingWord = last;

            }
        }
    }
