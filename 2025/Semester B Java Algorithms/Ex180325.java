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

        // ex3:
        // כתבו פונ' המקבלת מספר שלם חיובי
        // הפונ' תבדוק האם המספר הוא פולינדרום,
        // ותחזיר תוצאה בוליאנית בהתאם
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
}
