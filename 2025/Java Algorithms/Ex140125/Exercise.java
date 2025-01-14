package Ex140125;

import java.util.Scanner;
import java.util.Random;

public class Exercise {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		/*
		 * https://www.w3resource.com/c-programming-exercises/while-loop/index.php
		 */
		
		// ex4:
		// Write a Java program that prompts the user to input 
		// a series of numbers until they input a duplicate number.
		// Use a while loop to check for duplicates.
		// כתבו תוכנית בג'אווה אשר תקלוט מספרים שלמים מהמשתמש.
		// התוכנית תמשיך בקליטה שלה (באופן אינסופי) עד שיקלטו שני מספרים רצופים השווים זה לזה
		// 1. נקלוט 2 מספרים בתור התחלה
		// 2. לולאה כל עוד המספרים שונים זה מזה
		// 3. נקלוט מספר חדש
		// 4. נשמור ערך אחרון במשתנה הראשון, וערך חדש במשתנה השני
		/*int firstNum = s.nextInt();
		int lastNum = s.nextInt();
		while (firstNum != lastNum) {
			firstNum = lastNum;
			lastNum = s.nextInt();
		}
		System.out.println("First: " + firstNum + " last: " + lastNum);*/
		
		
		
		/*	 !! Random numbers !!	*/
		Random rand = new Random();	// rand is a random generator - משתנה לייצור מספרים רנדומלים
		int r1 = rand.nextInt();
		double r2 = rand.nextDouble();
		System.out.println("r1="+r1+" r2="+r2);
		
		/*
		 * num % 4 => numbers between 0 and 3
		 * num % 9 => numbers between 0 and 8
		 * num % 15 => numbers between 0 and 14
		 */
		// create random number between 0 and 20
		int r11 = rand.nextInt();
		if (r11 < 0) {
			r11 = r11 * -1;
		}
		int result = r11 % 21;
		System.out.println(result);
		
		// ex5:
		/*
		 * Write a Java program that generates a random number
		 *  between 1 and 10 and asks the user to guess it.
		 *  Use a while loop to give the user multiple chances
		 *  until they guess the correct number.
		 *  כתבו תוכנית ג'אווה אשר תייצר מספר רנדומלי בטווח 1-10 (כולל 1 ו-10)
		 *  התוכנית תריץ לולאה לקליטת ניחושים של מספר שלם מהמשתמש.
		 *  הלולאה תעצור ותסיים רק כאשר המשתמש ניחש נכון.
		 */
		/*int rnd = rand.nextInt();
		if (rnd < 0) {
			rnd *= -1;	// same as: rnd = rnd * -1
		}
		int res = rnd % 10;
		res++;
		
		int guess = s.nextInt();
		while (res != guess) {
			guess = s.nextInt();
		}
		System.out.println("Success! res="+res+" guess="+guess);*/
		
		
		// ex
		// כתבו תוכנית הקולטת מהמשתמש מספר שלם חיובי. num
		// התוכנית תדפיס למסך את סכום כל המספרים מ-1 ועד num
		// הערה: הסכום כולל את num
		/*int num = s.nextInt();
		int sum = 0;
		
		int i = 1;
		while (i <= num) {
			sum += i;
			
			i++;
		}
		System.out.println("Sum = "+sum);*/
		
		// ex
		// כתבו תוכנית הקולטת מספר מהמשתמש
		// התוכנית תדפיס את תוצאת העצרת על המספר
		// 5! = 1*2*3*4*5
		// num! = 1*2*3*4*.....*num
		int num = s.nextInt();
		int factorial = 1;
		
		int i = 1;
		while (i <= num) {
			// factorial = factorial * i
			factorial *= i;
			
			i++;
		}
		System.out.println("Factorial = "+factorial);
	}

}
