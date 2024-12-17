package Ex101224;

import java.util.Scanner;

public class Basics {
	public static void main(String[] args) {
		// inline comment. stays in this line
		
		/* 
		 Multiple line comment
		 We can write long
		 text in here..
		 */
		
		// OUTPUT:
		
		System.out.println(2 + 3 + 5 + 12 + 56);
		
		// boolean:
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		
		
		int num = 1;	// single-line assignment
		int ageOfEranYesterday;
		ageOfEranYesterday = 34;	// separate-line assignment
		System.out.println(ageOfEranYesterday);
		
		
		double pi = 3.14;
		double e;
		e = 2.17;
		System.out.println(pi);
		
		
		char c1 = 'a';
		char c2 = '1';
		char c3 = '@';
		char c4 = '$';
		System.out.println(c4);
		
		
		String empty = "";
		String single = "a";
		String str = "My name is Jeff";
		str = "new string";
		System.out.println(str);
		String str2 = "srxgSRGW35645$%&%^%&5etWGWetye45%^";
		
		
		// INPUT:
		Scanner s = new Scanner(System.in);	// Scanner object gives us input commands
		
		int value = s.nextInt();	// read an integer from user
		System.out.println(value);	// print the given number to the screen
		
		boolean inputBool = s.nextBoolean();
		System.out.println(inputBool);
		
		double inputDub = s.nextDouble();
		System.out.println(inputDub);
		
		String inputStr = s.nextLine();
		System.out.println(inputStr);
	}
}
