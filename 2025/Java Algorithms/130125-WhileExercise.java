package Ex130125;

import java.util.Scanner;

/*
 * Link to exercises: https://www.w3resource.com/java-exercises/basic/index.php
 */

public class WhileExercise {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		// ex57
		/*
		 * Write a Java program to accept an integer 
		 * and count the factors of the number.
		 * כתבו תוכנית הקולטת מספר שלם מהמשתמש וסופרת כמה מחלקים
		 * קיימים למספר. על התוכנית להדפיס למסך את מספר המחלקים.
		 */
		/*int num = s.nextInt();
		int counter = 0;
		
		int i = 1;
		while (i <= num) {
			if (num % i == 0) {
				counter++;
			}
			
			i++;
		}
		System.out.println(counter);*/
		
		
		// ex
		// כתבו תוכנית, הקולטת מהמשתמש 10 מספרים דו-ספרתיים
		// התוכנית תדפיס בסופה למסך את המספר הגדול ביותר שנקלט
		/*int a = 0;
		int max = 9;
		while(a < 5) {
			int myNum = s.nextInt();
			if (myNum > max) {
				max = myNum;
			}
			
			a++;
		}
		System.out.println(max);*/
		
		
		// ex64
		/*
		 * Write a Java program that accepts two integer values
		 *  between 25 and 75 and returns true if there is a common
		 *   digit in both numbers.
		 *   כתבו תוכנית הקולטת מהמשתמש שני מספרים שלמים בטווח 25 עד 75.
		 *   התוכנית תדפיס למסך true
		 *   אם קיימת ספרה משותפת לשני המספרים.
		 *   דגש! ספרה משותפת יכולה להיות באחדות במספר הראשון, ובעשרות במספר השני.
		 *   
		 *   Output:
		 *   n1 = 25, n2 = 75	=> true
		 *   n1 = 34, n2 = 48	=> true
		 *   n1 = 89, n2 = 80	=> true
		 *   n1 = 24, n2 = 79	=> false
		 * */
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n1_L = n1 / 10;
		int n1_R = n1 % 10;
		int n2_L = n2 / 10;
		int n2_R = n2 % 10;
		
		/*boolean result;
		if (n1_L == n2_L) {
			//System.out.println(true);
			result = true;
		}
		else if (n1_L == n2_R) {
			//System.out.println(true);
			result = true;
		}
		else if (n1_R == n2_L) {
			//System.out.println(true);
			result = true;
		}
		else if (n1_R == n2_R) {
			//System.out.println(true);
			result = true;
		}
		else {
			//System.out.println(false);
			result = false;
		}
		System.out.println(result);*/
		
		boolean result;
		if (n1_L == n2_L || n1_L == n2_R || n1_R == n2_L || n1_R == n2_R) {
			//System.out.println(true);
			result = true;
		}
		else {
			//System.out.println(false);
			result = false;
		}
		System.out.println(result);
		
		
		
		// ex something
		/*
		 * Write a Java program that prompts the user to
		 * enter a positive integer. It then calculates and
		 * prints the factorial of that number using a while loop.
		 * כתבו תכונית הקולטת מספר שלם מהמשתמש.
		 * התוכנית תחשב עצרת על המספר שנקלט.
		 * הסבר: פעולת עצרת מחשבת את מכפלת כל המספרים, מ-1 עד המספר האחרון.
		 * לדוגמא:
		 * 6! = 1*2*3*4*5*6
		 */
		
	}

}
