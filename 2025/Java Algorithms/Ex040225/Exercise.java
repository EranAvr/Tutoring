package Ex040225;

import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) {

		// Switch-Case examples:
		int x = 1;
		switch(x) {
			case 1:
				System.out.println("x = 1");
				break;
			case 2:
				System.out.println("x = 2");
				break;
			case 3:
				System.out.println("x = 3");
				break;
		}
		
		int month = 2;
		switch(month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		}
		
		String m = "February";
		switch(m) {
		case "January":
			System.out.println("First month");
			break;
		case "February":
			System.out.println("Second month");
			break;
		default:
			System.out.println("Other month");
		}
		
		
		// Exercises
		Scanner s = new Scanner(System.in);
		
		// ex1:
		/*
		 * כתבו תוכנית הקולטת תו מהמשתמש
		 * התוכנית תשתמש במבנה switch
		 * לבדיקה האם נקלט אחד מהתוים הבאים:
		 * '@', '#', '$'
		 * אחרת, תודפס הודעת שגיאה
		 */
		/*char c = s.next().charAt(0);
		switch(c) {
			case '@':
				System.out.println("@");
				break;
			case 35:
				System.out.println("#");
				break;
			case '$':
				System.out.println("$");
				break;
			default:
				System.out.println("Other character");
		}*/
		
		
		// ex2:
		/*
		 * כתבו תוכנית הקולטת תו של סימן
		 * של אחת מארבע פעולות החשבון.
		 * התוכנית תדפיס למסך מחרוזת עם שם הפעולה.
		 * יש להוסיף פעולת ברירת מחדל לכל סימן אחר
		 */
		/*char symb = s.next().charAt(0);
		switch(symb) {
			case '+':
				System.out.println("Addition");
				break;
			case '-':
				System.out.println("Subtraction");
				break;
			case '*':
				System.out.println("Multiplication");
				break;
			case '/':
				System.out.println("Division");
				break;
			default:
				System.out.println("Other operand");
		}*/
		
		
		// ex3
		/*
		 * כתבו תוכנית הקולטת סימן של פעולת חשבון,
		 * ובנוסף קולטת שני מספרים שלמים.
		 * התוכנית תשתמש במבנה Switch
		 * בכדי להדפיס למסך את תוצאת הפעולה על המספרים.
		 */
		/*int a = s.nextInt();
		int b = s.nextInt();
		char oper = s.next().charAt(0);
		switch(oper) {
			case '+':
				System.out.println("Addition: " + (a+b));
				break;
			case '-':
				System.out.println("Subtraction: " + (a-b));
				break;
			case '*':
				System.out.println("Multiplication: " + (a*b));
				break;
			case '/':
				if(b != 0) {
					System.out.println("Division: " + (a/b));
				}
				else {
					System.out.println("Can't divide by zero!");
				}
				break;
			default:
				System.out.println("Other operand");
		}*/
		
		
		// ex4:
		/*
		 * כתבו תוכנית הקולטת מחרוזת עם שם של יום בשבוע.
		 * התוכנית תשתמש במבנה Switch
		 * כדי להדפיס למסך את היום הנוכחי וכל הימים שעוד לפנינו בשבוע 
		 */
		/*String day = s.nextLine();
		switch(day) {
			case "Sunday":
				System.out.println("Sunday is ahead..");
			case "Monday":
				System.out.println("Monday is ahead..");
			case "Tuesday":
				System.out.println("Tuesday is ahead..");
			case "Wednesday":
				System.out.println("Wednesday is ahead..");
			case "Thursday":
				System.out.println("Thursday is ahead..");
			case "Friday":
				System.out.println("Friday is ahead..");
			case "Saturday":
				System.out.println("Saturday is ahead..");
				break;
			default:
				System.out.println("Not a legal day name");
		}*/
		
		
		// ex5:
		/*
		 * כתבו תוכנית הקולטת מספר שלם מהמשתמש.
		 * התוכנית תשתמש במבנה Switch
		 * כדי לקבוע אם ספרת האחדות היא זוגית או אי-זוגית.
		 * על התוכנית להדפיס הודעה מתאימה למסך.
		 */
		/*
		int num = s.nextInt();
		int digit = num % 10;
		switch (digit%2) {
			case 0:
				System.out.println("Even");
			case 1:
				System.out.println("Odd");
		}*/
		/*
		 int num = s.nextInt();
		 switch (num % 10) {
			case 2:
			case 4:
			case 6:
			case 8:
				System.out.println("Even");
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 9:
				System.out.println("Odd");
				break;
			default:
				System.out.println("0 is non negative/positive");
		}*/
		
		
		// ex6:
		/*
		 * כתבו תוכנית הקולטת מהמשתמש מחרוזת עם מילת פקודה,
		 * עד אשר תקלט הפקודה "quit"
		 * התוכנית תשתמש במבנה Switch 
		 * ותכתוב הודעה למסך עבור הפקודות הבאות:
		 * "play", "forward", "backward"
		 */
		String command = "";
		do {
			command = s.nextLine();
			switch(command) {
				case "play":
					System.out.println("Let's play");
					break;
				case "forward":
					System.out.println("skip forward");
					break;
				case "backward":
					System.out.println("go backward");
					break;
			}
		} while ( ! command.equals("quit") );
		
		
		// ex7: 7-Boom
		/*
		 * יש לכתוב תוכנית המדפיסה מספרים למסך על פי המשחק 7-בום!
		 * התוכנית תדפיס מספרים בטווח 1-100,
		 * כך שבמקום כל המספרים המתחלקים ב-7
		 * תודפס המילה "Boom!".
		 */
		
		
		// ex8: bounce
		/*
		 * יש לכתוב תוכנית המדפיסה את כל המספרים הזוגיים
		 * . בטווח 1-30
		 * התוכנית תשתמש בפקודה continue.
		 */
		
		
		// ex9: conditions
		/*
		 * הגדרה: במשולש, סכום כל שתי צלעות תמיד גדול מהצלע השלישית.
		 * כתבו תוכנית המקבלת מהמשתמש 3 אורכי צלעות,
		 * ותכתוב למסך האם האורכים מתאימים לצלעות משולש, או לא.
		 */
		
	}

}
