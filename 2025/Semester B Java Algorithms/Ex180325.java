import java.util.Scanner;

public class Ex180325 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Hello Student!");

		/*
		int x = s.nextInt();
		System.out.println(x);
		float f = s.nextFloat();
		System.out.println(f);
		double d = s.nextDouble();
		System.out.println(d);
		boolean b = s.nextBoolean();
		System.out.println(b);
		char c = s.next().charAt(0);
		System.out.println(c);

		s.nextLine(); // Consume the leftover newline stored in the buffer

		String str = s.nextLine();
		System.out.println(str);
		*/



        // Exercises:

        // ex0:
        // כתבו פונקציה המקבלת מספר שלם חיובי
        // הפונקציה תדפיס למסך את ספרות המספר בשורות נפרדות
        // יש להדפיס את הספרות מימין לשמאל
        // num = 123
        printRightToLeft(10203);
        printRightToLeft(40);
        printRightToLeft(0);


        // ex1:
        // כתבו פונקציה המקבלת כפרמטר מספר שלם חיובי.
        // הפונקציה תחזיר מספר שלם שספרותיו הפוכות למספר המקורי
        // num = 1234
        // output = 4321
        System.out.println( reverseNumber(12345) );
        System.out.println( reverseNumber(9) );
        System.out.println( reverseNumber(0) );


        // ex2:
        // כתבו פונ' המקבלת מספר שלם חיובי או שלילי
        // הפונ' תחזיר מספר שלם שספרותיו הפוכות למספר המקורי
        // ניתן להעזר בפונ' מהשאלה הקודמת
        // קלט שלילי צריך להחזיר פלט שלילי
        System.out.println( reverseNegPos(12345) );
        System.out.println( reverseNegPos(-12345) );


        // ex3:
        // כתבו פונ' המקבלת מספר שלם חיובי
        // הפונ' תבדוק האם המספר הוא פלינדרום,
        // ותחזיר תוצאה בוליאנית בהתאם
        // ניתן להשתמש בפונ' מהסעיפים הקודמים
        // פולינדרומים:
        // 12321
        // 5665
        // 12345678987654321
        // 4444
        // לא פולינדרום:
        // 1234
        System.out.println( isPalindrome(12321) );
        System.out.println( isPalindrome(5665) );
        System.out.println( isPalindrome(123454321) );
        System.out.println( isPalindrome(4444) );

        System.out.println( isPalindrome(4234) );




    }

    // Methods:
    // ex0:
    public static void printRightToLeft(int num) {
        do {
            int digit = num % 10;
            System.out.println(digit);
            num /= 10;	// num = num / 10
        }while (num > 0);
    }

    // ex1:
    public static int reverseNumber(int num) {
        int rev = 0;
        do {
            // לחלץ ספרה ימנית
            int digit = num % 10;
            num /= 10;

            // הכנסת ספרות אל מספר חדש
            rev *= 10;
            rev += digit;
        }while (num > 0);

        return rev;
    }

    // ex2:
    public static int reverseNegPos(int num){
        if (num < 0){   // שלילי
            num *= -1;
            int result = reverseNumber(num);
            return result * -1;
        }
        else {  // חיובי או אפס
            int result = reverseNumber(num);
            return result;
        }
    }

    // ex3:
    public static boolean isPalindrome(int num){
        // example: num = 5665
        int temp = num;
        int divider = 1;
        // לרוץ על מס' הספרות ולבנות מחלק גדול
        while (temp > 10){
            divider *= 10;
            temp /= 10;
        }
        //System.out.println(divider);

        temp = num;
        // לרוץ כל עוד המספר הנבדק גדול מ-10
        while (temp > 10){
            // לבדוק ספרה ימנית ביותר עם שמאלית ביותר
            int right = temp % 10;
            int left = temp / divider;

            // בדיקת שיוויון
            if (left != right){
                return false;
            }

            // לקצץ ספרות קיצוניות משני הצדדים
            // ולעדכן את המחלק הגדול divider
            temp %= divider;
            temp /= 10;
            divider /= 100;
        }

        return true;
    }
}
