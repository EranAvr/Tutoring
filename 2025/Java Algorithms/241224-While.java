package Ex241224;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// Warm up exercise:
		// for given X and Y, decide what quarter they belong to.
		
		/*float x = s.nextFloat();
		float y = s.nextFloat();
		if (x > 0 && y > 0) {
			System.out.println("First quarter");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Second quarter");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Third quarter");
		}
		else if (x > 0 && y < 0) {
			System.out.println("Fourth quarter");
		}
		
		if (x > 0) {
			if (y > 0) {
				System.out.println("First quarter");
			}
			else if (y < 0) {
				System.out.println("Fourth quarter");
			}
		}
		else if (x < 0) {
			if (y > 0) {
				System.out.println("Second quarter");
			}
			else if (y < 0) {
				System.out.println("Third quarter");
			}
		}*/
		
		
		
		////////////////////////
		//	While Loop
		////////////////////////
		
		/*
		// step I:	initial variable-
		int controlVar = 0;
		
		// step II:	while condition-
		while ( controlVar < 5 ) {	// run code, as long as boolean expression returns 'true'
			System.out.println("Hello World! " + controlVar);
			
			// step III: update variable-
			//controlVar = controlVar + 1;
			//controlVar += 1;
			controlVar++;
		}
		System.out.println("While loop finished!");
		*/
		
		// ex1
		// Write a Java program to print numbers from 0 to 10 and 10 to 0
		// using two while loops.
		/*int num = 0;
		while (num <= 10) {
			System.out.println(num);
			num++;
		}
		num--;
		while (num >= 0) {
			System.out.println(num);
			num--;
		}*/
		
		// ex2:
		// Write a Java program that prompts the user to input a series 
		// of integers until the user enter 0, using a while loop.
		// Calculate and print the sum of all the positive integers entered.
		// כתבו לולאה שתקלוט מספרים מהמשתמש, עד שיוכנס 0.
		// הלולאה תחשב סכום של כל המספרים החיוביים, ובסוף התוכנית תדפיס את הסכום למסך.
		/*int numFromUser = -1;
		int sum = 0;
		while (numFromUser != 0) {
			numFromUser = s.nextInt();
			
			if (numFromUser > 0) {
				sum += numFromUser;
			}
		}
		System.out.println("Sum is " + sum);*/
		
		// ex4:
		// Write a Java program that prompts the user to input a
		// series of numbers until they input a duplicate number.
		// כתבו לולאה שתקלוט מספרים מהמשתמש, עד אשר יקלטו
		// שני מספרים רצופים זהים.
		int num1 = s.nextInt();
		int prevNum = num1 + 10;	// math trick to be sure that: num1 != prevNum == true
		
		while (num1 != prevNum) {
			prevNum = num1;
			num1 = s.nextInt();
		}
		
		// ex5:
		// Write a Java program that generates a random number
		// between 1 and 20 and asks the user to guess it.
		// Use a while loop to give the user multiple chances
		// until they guess the correct number.
		int rand = (int)(Math.random() * 20) + 1;
		
	}

}
