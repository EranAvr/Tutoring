package Ex230125_Recap;

import java.util.Random;

public class MyRandom {
	public static void main(String[] args) {
		// Random:
		Random rnd = new Random();
		
		System.out.println(rnd.nextInt());
		int someRand = rnd.nextInt();
		System.out.println("My random: " + someRand);
		
		int numTo50 = rnd.nextInt(50);
		System.out.println("Random between 0-49: " + numTo50);
		
		int n20To60 = rnd.nextInt(20, 60);
		System.out.println("Random between 20-59: " + n20To60);
		
		
		
		// Float to Integer:
		double PI = 3.14;
		System.out.println(PI);
		int piNum = (int)PI;
		System.out.println(piNum);
	}

}
