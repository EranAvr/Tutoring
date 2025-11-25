package Ex251125;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // While loop
        int num = 0;    // ערך התחלתי
        while (num <= 5) {  // תנאי בוליאני
            System.out.println(num);
            num++;  // קידום
        }


        // Do-While loop
        /*int a = 10;
        do {
            System.out.println(a);
            a--;
        } while (a > 0);*/


        // For loop
        for (int i=0; i<=20; i += 2){
            System.out.println(i);
        }


        // ex
        /*
            כתבו תוכנית הקולטת מהמשתמש
            רצף של מספרים שלמים וחיוביים,
            ומחשבת את סכומם.
            התוכנית תסיים את ריצתה ברגע שיקלט מס'
            שלילי.
            שימו לב! אין לסכום את המס' השלילי
         */
        Scanner s = new Scanner(System.in);
        /*int n=0, sum = 0;
        //n = s.nextInt();
        while (n >= 0){
            sum += n;
            n = s.nextInt();
        }
        System.out.println(sum);*/


        // ex
        /*
            כתבו תוכנית הקולטת מהמשתמש מספר
            שלם חיובי n,
            ומדפיסה למסך את ערך העצרת שלו.
            n! = 1*2*3*......*n
         */
        /*int n, fact = 1;
        n = s.nextInt();
        for (int i = 1; n > 0 && i <= n; i++) {
            System.out.println(i);
            fact *= i;
        }
        System.out.println(fact);*/


        // ex
        /*
            נוסחת פיתגורס: a*a + b*b = c*c
            המושג "שלשה פיתגורית" אומר 3 מספרים
            שמקיימים את נוסחת פיתגורס.
            עליכם לקלוט 3 מספרים שלמים וחיוביים,
            עד אשר נקלטו מספרים שהם שלשה-פיתגורית.
            שימו לב! לא ידוע בקלט מה ניצב ומי יתר.
         */
        int a,b,c;
        do{
            a = s.nextInt();
            b = s.nextInt();
            c = s.nextInt();
        } while ( !(a*a+b*b == c*c ||
                a*a+c*c == b*b ||
                b*b+c*c == a*a) );
        System.out.println(a + " " + b + " " + c);
    }
}
