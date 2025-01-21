package Ex210125;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		/*
		 * הלולאה תמיד תבצע את הגוף בפעם הראשונה,
		 * ולאחר מכן- כל ביצוע חוזר ונוסף יהיה מותנה
		 * בבדיקת התנאי הבוליאני
		 * 
		 * do {
		 * 	// ...קוד לביצוע
		 * 
		 * } while( <ביטוי בוליאני לבדיקה> );
		 */
		
		
		// Exercises:
		Scanner s = new Scanner(System.in);
		
		// ex1
		/*
		 * Write a Java program to print numbers from 1 to 10 
		 * and 10 to 1 using a do-while loop.
		 * כתבו תוכנית, אשר תשתמש בלולאות do-while
		 * בכדי לכתוב למסך את המספרים 1-10 ולאחר מכן 10-1
		 */
		/*int i = 1;
		do {
			System.out.println("i = " + i);
			i++;
		} while(i <= 10);
		
		i = 10;
		do {
			System.out.println("i = " + i);
			i--;
		} while(i >= 1);*/
		
		
		// ex2
		/*
		 * Write a Java program that prompts the user to 
		 * input a series of integers until the user 
		 * stops by entering 0 using a do-while loop.
		 * Calculate and print the sum of all positive integers entered.
		 * כתבו לולאת do-while
		 * אשר קולטת מספרים שלמים מהמשתמש, עד אשר נקלט 0.
		 * הלולאה תחשב סכום של המספרים החיוביים בלבד.
		 * יש להדפיס את הסכום המחושב למסך, בתום פעולת הלולאה.
		 */
		/*int num;
		int sum = 0;
		do {
			num = s.nextInt();
			if (num > 0) {	// check if 'num' is positive
				sum += num;
			}
			
		} while(num != 0);
		System.out.println("Sum = " + sum);*/
		
		// ex3:
		/*
		 * Write a Java program that calculates the sum of
		 * even and odd numbers from 1 to 50 using do-while loops.
		 * כתבו תוכנית, אשר תשתמש בלולאת do-while
		 * בכדי לרוץ על המספרים מ-1 עד 50 (כולל)
		 * התוכנית תחשב ותדפיס למסך את סכום המספרים הזוגיים ואת סכום האי-זוגיים
		 */
		/*int x = 1;
		int sumOdd = 0;
		int sumEven = 0;
		do {
			if (x % 2 == 0) {	// אם זוגי
				sumEven += x;
			}
			else {	// אם אי-זוגי
				sumOdd += x;
			}
			
			x++;
		} while(x <= 50);
		System.out.println("Sum of odds: " + sumOdd);
		System.out.println("Sum of evens: " + sumEven);*/
		
		// ex4:
		/*
		 * Write a Java program that prompts the user to enter
		 * a series of numbers until they input a negative number.
		 * Calculate and print the sum of all entered
		 * numbers using a do-while loop.
		 * כתבו תוכנית אשר מריצה לולאת do-while
		 * לקליטת מספרים שלמים מהמשתמש עד אשר יקלט מספר שלילי.
		 * הלולאה תחשב סכום של המספרים שנקלטו,
		 * ותדפיס אותו למסך בסופה.
		 */
		/*int n;
		int summy = 0;
		do {
			summy += n;
			n = s.nextInt();
		} while(n >= 0);
		System.out.println("Summy = " + summy);*/
		
		// ex6
		/*
		 * Write a Java program that prompts the user to enter
		 * a positive integer and then calculates and prints
		 * the sum of the squares of each digit in that
		 * number using a do-while loop
		 * כתבו תוכנית אשר קולטת מספר שלם חיובי מהמשתמש.
		 * התוכנית תחשב את הערך הריבועי (חזקה 2) על כל אחת מהספרות של המספר,
		 * ותחשב סכום של ערכי הריבועים של הספרות.
		 * התוכנית תדפיס בסופה את הסכום.
		 * יש להשתמש בלולאת do-while.
		 */
		int y = s.nextInt();
		int sumOfSqrs = 0;
		do {
			int digit = y % 10;
			sumOfSqrs += digit * digit;
			
			y = y / 10;
		} while(y > 0);
		System.out.println("Sum of squares: " + sumOfSqrs);
	}
}
