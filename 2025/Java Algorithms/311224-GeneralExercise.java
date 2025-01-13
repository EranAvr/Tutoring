package Ex311224;

import java.util.Scanner;

/*
 * Link to exercises: https://www.w3resource.com/java-exercises/basic/index.php
 */

public class GeneralExercise {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		// ex49:
		/*
		 Write a Java program to accept a number and check 
		 whether the number is even (זוגי) or not. Prints 1 if the 
		 number is even or 0 if odd.
		 */
		// 1. יצירת משתנה
		// 2. קליטת ערך של מספר שלם
		// 3. נכתוב תנאי if עבור בדיקת זוגיות
		// 3.1. אם זוגי - נדפיס 1
		// 3.2. אם אי זוגי - נדפיס 0
		/*int num;
		num = s.nextInt();
		if (num % 2 == 0) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}*/
		
		
		// ex50:
		/*
		 Write a Java program to print numbers between 1 and 100
		  divisible by 3, 5 and both.
		  כתבו תוכנית בג'אווה אשר תבצע 3 לולאות על המספרים 1-100.
		  לולאה ראשונה: תדפיס מספרים המתחלקים ב-3
		  לולאה שניה: תדפיס מספרים המתחלקים ב-5
		  לולאה שלישית: תדפיס מספרים המתחלקים גם ב-3 וגם ב-5
		 */
		// 1. ניצור משתנה בקרה מטיפוס מספר שלם
		// 2. ניצור לולאה אשר רצה על המספרים 1-100 (בעזרת המשתנה בקרה)
		// 3. נכתוב תנאי בתוך הלולאה לבדיקת חלוקה ב-3
		// 3.1. אם המספר מתחלק ב-3 אז נדפיס אותו
		// 3.2. אחרת- נמשיך למספר הבא (לא נעשה כלום)
		/*System.out.println("Divided by 3:");
		int n1 = 1;
		while (n1 <= 100) {
			if (n1 % 3 == 0) {
				System.out.print(n1 + ", ");
			}
			n1++;
		}
		System.out.println("\nDivided by 5:");
		n1 = 1;
		while (n1 <= 100) {
			if (n1 % 5 == 0) {
				System.out.print(n1 + ", ");
			}
			n1++;
		}
		System.out.println("\nDivided by 3 AND by 5:");
		n1 = 1;
		while (n1 <= 100) {
			if (n1 % 3 == 0 && n1 % 5 == 0) {
				System.out.print(n1 + ", ");
			}
			n1++;
		}*/
		
		
		// my ex 1:
		// כתבו תוכנית ג'אווה הקולטת מספר-שלם (int) בעל 6 ספרות המציין זמן. כלומר בפורמט- 
		// HHmmss
		// התוכנית תדפיס למסך את המחרוזת-
		// HH:mm:ss
		// הדרכה- חישבו כיצד ניתן לשלוף את הספרות הרצויות אל תוך משתנים
		int n3 = 123456;
		/*System.out.println("n3 % 10 = " + n3 % 10);
		System.out.println("n3 % 100 = " + n3 % 100);
		System.out.println("n3 % 1000 = " + n3 % 1000);
		System.out.println("n3 % 10000 = " + n3 % 10000);
		System.out.println("n3 % 100000 = " + n3 % 100000);
		System.out.println("n3 % 1000000 = " + n3 % 1000000);*/
		
		int seconds = n3 % 100;
		int leftNumber = n3 / 100;	// save left part of number
		n3 = leftNumber;			// update n3 with left part
		// n3 /= 100;	// the /= operator is a shorthand for lines 89-90
		
		int minutes = n3 % 100;
		leftNumber = n3 / 100;
		n3 = leftNumber;
		
		int hours = n3;	// only hours remained in variable 'n3'
		System.out.println(hours + ":" + minutes + ":" + seconds);
		
		// my ex 2:
		// כתבו תוכנית בג'אווה, אשר תקלוט מספר שלם מהמשתמש
		// התוכנית תבצע בדיקה האם המספר הוא ראשוני או לא.
		// יש להדפיס הודעה מתאימה למסך (בין אם כן ובין אם לא)

	}

}
