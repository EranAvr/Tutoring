package Ex171224;

import java.util.Scanner;

public class Conditions {
	// main function. program starts here-
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// Templates:
		if ( 1 == 1 ) {
			// only if condition is true - execute the code
			System.out.println("Condition is true");
		}
		
		if ( 1 == 5 ) {
			System.out.println("Inside if block");
		}
		
		
		if ( 10 < 4 ) {
			System.out.println("Inside if block");
		}
		else {
			System.out.println("Inside else block");
		}
		
		// Conditions with variables:
		int num = 0;
		
		if (num > 10) {
			System.out.println("check 1: num Larger than 10");
		}
		
		num = 20;
		if (num > 10) {
			System.out.println("check 2: num Larger than 10");
		}
		
		// Ex0: read integer from user, and print if positive or negative-
		int myNum = s.nextInt();
		if (myNum > 0) {
			System.out.println("Positive");
		}
		if (myNum < 0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Zero");
		}
		
		// Ex1: Write a Java program to accept two integers and
		// 		check whether they are equal or not.
		int number1 = s.nextInt();
		int number2 = s.nextInt();
		
		if (number1 == number2) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");
		}
		
		// Ex2: Write a Java program to check whether a given number
		// 		is even or odd.
		int someNum = s.nextInt();
		if ( someNum % 2 == 0 ) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
		
	}

}
