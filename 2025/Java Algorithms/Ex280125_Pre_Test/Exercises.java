package Ex280125_Pre_Test;

import java.util.Scanner;
import java.util.Random;

public class Exercises {
	public static void main(String[] args) {
		/*
		// First way-
		for(int i=0, j=2; i<10 && j<10  ; i++, j+=2) {
			System.out.println("i = " + i);
			System.out.println("j = " + j);
		}
		
		System.out.println("---------");
		
		// Second way (easier)-
		int j = 3;
		for (int i=0; i<10; i++) {
			System.out.println("i = " + i);
			System.out.println("j = " + j);
			j *= 2;
		}
		*/
		
		
		
		
		// For-loop Exercises:

		// Formulas:
		// ממוצע על סדרת מספרים 1,3,4,6,9
		// יחושב על פי:
		// (1+3+4+6+9) / 5
		// sum / count
		
		Scanner s = new Scanner(System.in);
		Random rnd = new Random();

		// ex1:
		/*
		 * Write a program in Java to read 10 numbers from the user,
		 * and find their sum and average.
		 *  כתבו תוכנית הקולטת מהמשתמש 10 מספרים
		 *  התוכנית תדפיס למסך את סכומם ואת הממוצע שלהם.
		 */
		
		/*int sum = 0;
		for(int i=0; i<10; i++) {
			int num = s.nextInt();
			sum += num;
		}
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+sum/10.0);*/
		
		
		// ex2:
		/*
		 * Write a Java program to accept an integer
		 * and count the factors of the number.
		 * כתבו תוכנית הקולטת מספר שלם מהמשתמש.
		 * התוכנית תספור כמה מחלקים קיימים למספר, ותדפיס
		 * את תוצאת הספירה למסך.
		 * המחלקים כוללים את 1 ואת המספר עצמו. לדוגמא
		 * input= 25
		 * output= 3 (1,5,25)
		 */
		
		/*int n = s.nextInt();
		int count = 0;
		for (int i=1; i <= n; i++) {
			// בדיקה האם השארית שווה לאפס, ואז מצאנו מחלק טבעי
			if (n % i == 0) {
				count++;
			}
		}
		System.out.println("Count = " + count);*/
		
		
		
		// ex3:
		/*
		 * Write a Java program to accept an integer
		 * and checks if it's prime number.
		 * מספר ראשוני הוא מספר שמתחלק רק (!!) ב-1 ובעצמו
		 * 
		 * כתבו תוכנית הקולטת מספר שלם מהמשתמש,
		 * ובודקת האם המספר הוא ראשוני.
		 * התוכנית תדפיס ערך בוליאני true/false בהתאם לתוצאה
		 * 
		 * מספרים ראשוניים לדוגמא: 5, 7, 11, 13, 17, 19, 23, 31
		 */
		
		/*int n1 = s.nextInt();	// n1=4
		boolean result = true;
		
		for (int i=2; i < n1; i++) {
			if (n1 % i == 0) {
				result = false;
			}
		}*/
		
		
		
		
		// General Exercises:
		
		/*
		 * אנו משתמשים ב-Random ליצירת מספרים רנדומליים
		 * נייצר מספר רנדומלי עם הפונ' nextInt 
		 */
		int myRand = rnd.nextInt();		// מספר רנדומלי חופשי
		myRand = rnd.nextInt(10);		// מספר רנדומלי בטווח 0-9
		myRand = rnd.nextInt(7, 20);	// מספר רנדומלי בטווח 7-19
		
		// ex:
		/*
		 * כתבו תוכנית אשר מדמה הטלה של קוביה.
		 * התוכנית תגריל מספר רנדומלי בטווח 1-6 ותדפיס אותו למסך.
		 */
		/*int dice = rnd.nextInt(1, 7);
		System.out.println("Dice = " + dice);*/
		
		
		// ex:
		/*
		* כתבו תוכנית אשר מדמה הטלה של 2 קוביות.
		* התוכנית תבצע 5 הטלות של צמד הקוביות, ועבור כל הטלה תרשום למסך
		* האם ערכי הקוביות זהה (דאבל) או לא.
		* כלומר, בכל הטלה יש לבדוק אם יצא אותו מספר בשתי הקוביות
		*/
		for (int i=0; i<5; i++) {
			int dice1 = rnd.nextInt(1, 7);
			int dice2 = rnd.nextInt(1, 7);
			
			System.out.println("Dice1="+dice1+" Dice2="+dice2);	// לנוחות שלנו
			
			if(dice1 == dice2) {
				System.out.println("Double");
			}
		}
		
		
		
	}

}
