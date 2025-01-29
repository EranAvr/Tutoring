package Ex280125_Extra;

import java.util.Scanner;
import java.util.Random;

public class PrepareToTest {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Random rnd = new Random();
		
		// ex:
		/*
		* כתבו תוכנית אשר מדמה הטלה של 2 קוביות.
		* התוכנית תבצע הטלות חוזרות, שוב ושוב, של צמד הקוביות - עד קבלת דאבל.
		* יש לרשום למסך את מספר ההטלות שבוצע עד שהתקבל הדאבל.
		*/
		// While-loop:
		/*int dice1 = rnd.nextInt(1, 7);
		int dice2 = rnd.nextInt(1, 7);
		int count = 1;
		while (dice1 != dice2) {
			count++;
			dice1 = rnd.nextInt(1, 7);
			dice2 = rnd.nextInt(1, 7);
			System.out.println(dice1 + " : " + dice2);
		}
		System.out.println("Double! count is " + count);
		
		// Do-While-loop:
		int count2 = 0;
		do {
			count++;
			dice1 = rnd.nextInt(1, 7);
			dice2 = rnd.nextInt(1, 7);
			System.out.println(dice1 + " : " + dice2);
		} while (dice1 != dice2);
		System.out.println("Double! count is " + count2);*/
		
		
				
		// ex:
		/*
		* write Java program to accept an integer
		* and prints its digits (right-to-left) in separate lines.
		* כתבו תוכנית ג'אווה המקבלת מספר שלם חיובי.
		* התוכנית תדפיס את ספרות המספר בשורות נפרדות.
		* הספרות נלקחות מימין לשמאל.
		* input: 1648
		* output:
		* 8
		* 4
		* 6
		* 1
		* 
		* num = 123
		* num/10 = 12
		* num/100 = 1
		*/
		/*int num = rnd.nextInt(100, 1000000);
		System.out.println("num = " + num);
		while (num > 0) {
			int num2 = num % 10;	// שליפת ספרה ימנית ביותר
			System.out.println(num2);
			//num = num / 10;
			num /= 10;	// נקצר את המספר הראשי בספרה אחת מימין
		}*/
		
		
		
		// ex:
		/*
		 * כתבו תוכנית ג'אווה המקבלת מספר שלם וחיובי.
		 * התוכנית תשמור אל תוך משתנה את המספר ההפוך
		 * input: 34567 (int)
		 * output: 76543 (int)
		 * אלגוריתם:
		 * 1. לקלוט מספר
		 * 2. כל עוד המספר גדול מ-0
		 * 2.1. חלץ ספרה ימנית
		 * 2.2. הכפל מס' חדש ב-10 והוסף לו את הספרה
		 * 2.3. קצץ ספרה ימנית מהמספר המקורי
		 */
		int n = rnd.nextInt(100, 1000000);
		System.out.println("Original: " + n);
		int reverse = 0;
		while (n > 0) {
			int digit = n % 10;	// לחלץ ספרה ימנית
			reverse = reverse * 10;	// נכפיל ב-10 כדי להזיז ספרות שמאלה (לפנות מקום לספרה חדשה)
			reverse += digit;	// נוסיף ספרה בודדת אל המספר החדש
			n /= 10;	// נקצץ ספרה ימנית
		}
		System.out.println("Reversed: " + reverse);
		
			
		
		// ex:
		/*
		* write Java program to accept an integer
		* and prints its digits (left-to-right) in separate lines.
		* כתבו תוכנית ג'אווה המקבלת מספר שלם חיובי.
		* התוכנית תדפיס למסך את ספרות המספר בשורות נפרדות.
		* הספרות ילקחו משמאל לימין.
		* input: 93756
		* output:
		* 9
		* 3
		* 7
		* 5
		* 6
		*/
		
		// דרך ראשונה
		//  ניצור מספר מחלק פאקטור, שכמות האפסים בו שווה לכמות הספרות
		// אם נחלק בפאקטור נקבל את המספר הימני ביותר.
		// בהמשך, נקצץ את המחלק באפסים כך שכל חלוקה תתן את הספרה הבאה
		
		// דרך שניה
		// אם ראינו בתרגילים האחרונים איך להפוך מספר, ואיך להדפיס ספרות משמאל לימין,
		// נוכל לשלב את שני האלגוריתמים (אחד אחרי השני) כדי לקבל את התוצאה הרצויה
		// ראשית, נהפוך את המספר המקורי ב-reverse
		// לאחר מכן, נדפיס את ספרות המספר ההפוך מימין לשמאל
		// התוצאה: הדפסת הספרות של המספר המקורי משמאל לימין
	}

}
