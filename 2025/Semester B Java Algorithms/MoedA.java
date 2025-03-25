import java.util.Scanner;

public class MoedA {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//	----- Part 1 -----
		// ex1:
		/*int n, r, total;
		System.out.println("enter");
		n = in.nextInt();
		System.out.println("enter");
		r = in.nextInt();
		if (r%10 > n%)*/
		
		
		
		// ex3:
		// 1) input
		int temp, moist;
		temp = in.nextInt();
		moist = in.nextInt();
		// 2) condition
		if (moist > 60) {
			temp += 2;
		}
		// 3) output
		System.out.println(temp);
		
		
		//		----- Part 2 -----
		// ex1:
		int countGood = 0;
		
		for (int i=0; i<30; i++) {
			// input-
			int todayTemp = in.nextInt();
			// check temp-
			if (todayTemp < 10) {	// טמפרטורה נמוכה
				System.out.println("Too low!");
			}
			else if (todayTemp >= 10 && todayTemp <= 20) {	// טמפ טובה
				System.out.println("Good temp :-)");
				countGood++;
			}
			else {	// טמפ גבוהה
				System.out.println("Too high!");
			}
		}
		// output-
		System.out.println("Number of good days: " + countGood);
		
		
		// ex2:
		// כתבו פונקציה המדפיסה את כל המספרים התלת ספרתיים
		// אשר מתחלקים גם ב-7 וגם ב-3
		print7and3();
		
	}
	
	
	public static void print7and3() {
		for (int num = 100; num <= 999 ; num++) {
			if (num % 3 == 0 && num % 7 == 0) {
				System.out.println(num);
			}
		}
	}
}
