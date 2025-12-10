package Ex091225;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // ex7.28
        int grade=0, count=0;

		/*do{
		    grade = s.nextInt();
		    if (grade >= 60 && grade < 101)
		        count++;
		} while (grade < 101);*/
		/*while(grade != 101){
		    grade = s.nextInt();
		    if (grade >= 60 && grade < 101)
		        count++;
		}
		System.out.println(count);*/

        // ex7.29
		/*int countA = 0, countB = 0;
		char c = 0;
		while(c != '#'){
		    c = s.nextChar();
		    if(c == 'A')
		        countA++;
		    if(c == 'B')
		        countB++;
		}
		int f = countA + countB;
		if(countA > f/2)
		    System.out.println("Alon has won! :-)");
		else
			System.out.println("Alon has lost... :(");*/


        // ex7.30
        //      1               2               3
        int countMouse = 0, countLion = 0, countAnt = 0;
        int num = -1;
        // part I
        while(num != 0){
            num = s.nextInt();
            if(num == 1)
                countMouse++;
            else if(num == 2)
                countLion++;
            else if(num == 3)
                countAnt++;
        }
        // part II
        double p = countLion*1.0 / (countLion+countMouse+countAnt) * 100;
        // part III
        System.out.println(p);
        if(p < 30)
            System.out.println("Watch out!");
        else if(p >= 31 && p <= 70)
            System.out.println("Small warning");
        else
            System.out.println("All is good...");

    }

}