package Ex040225;

import java.util.Scanner;

public class MidTest {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		boolean good=true;
		int n,d;
		
		n=reader.nextInt();	// 8235
		d=reader.nextInt();	// 2
		
		while(n>0)
		{
			if(n%10==d) good=false;	// בודקים ספרה מימין
			n=n/10;	// מקצצים ספרה מימין
		}
		System.out.println(good);
	}
}
