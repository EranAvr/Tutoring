import java.util.Scanner;

public class LoopsExercises {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
/*
        // Calculate sum of 10 numbers given by the user.
        int sum = 0;
        for (int i=1 ; i<=10 ; i++){
            sum += s.nextInt();
        }
        System.out.println(sum);

        // Read input number from user, and print multiplication-table
        // of that number.
        int myMult = s.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println(myMult * i);
        }

        // Read a number from user,
        // print all factors (divisors) of this number.
        // Count them and print them.
        int divide = s.nextInt();
        int divisor = 2, counter = 0;
        while (divisor < divide){
            if (divide % divisor == 0){
                System.out.println(divisor);
                counter++;
            }
            divisor++;
        }
        System.out.println("Number of divisors: " + counter);


        // Read a number from user,
        // check if number is composite?
        int checked = s.nextInt();
        int divisor = 2;
        while (divisor < checked/2){
            if (checked % divisor == 0){
                System.out.println("Divisor found: " + divisor);
                break;
            }
            divisor++;
        }
        // 1 2 3 4 5 6 7 8 9 10 11 12


        // Find root of input number:
        int powered = s.nextInt();
        for (int i=1 ; i < powered/2 ; i++){
            if (i*i == powered){
                System.out.println("Root found: " + i);
                break;
            }
        }


        // Find factorial of number:
        // factorial(n) = 1 * 2 * 3 * 4 * ....... * (n-1) * n ;
        int n = s.nextInt();
        int mult=1, index=1;
        while (index <= n){
            mult = mult * index;
            index++;
        }
        System.out.println(mult);

        int mult2 = 1;
        for (int i=1 ; i<=n ; i++){
            mult2 *= i;
        }
        System.out.println(mult2);


        // Write program that prints 'fibonacci sequence',
        // until a given limit entered by the user:
        // Example: 1, 1, 2, 3, 5, 8, 13, 21, 34.....
        int num = s.nextInt();
        int first = 1, second = 1;
        System.out.print(first + " " + second);
        for (int i=0 ; i<num-2 ; i++){
            second = first + second;
            first = second - first;
            System.out.print(" " + second);
        }




        // Print multiplication-table of 10.
        for(int i=1 ; i<=10 ; i++){  // move between rows
            for(int j=1 ; j<=10 ; j++){  // move between columns
                System.out.print( (i*j) + "\t" );
            }
            System.out.println();
        }
 */

        // Print the next patterns:
        /*
        **********
        **********
        **********
        **********
        */
        for (int i=0 ; i<4 ; i++){
            System.out.println("**********");
        }
        System.out.println("---------------");
        /*
         *
         **
         ***
         ****
         *****
         */
        for(int i=0 ; i<5 ; i++){  // move between rows
            for(int j=0 ; j<=i ; j++){  // move between columns
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------");
        /*
             *
            **
           ***
          ****
         *****
         */
        final int NUM = 5;
        for(int i=1 ; i <= NUM ; i++) {  // move between rows
            for (int j = 1; j <= NUM; j++) {  // move between columns
                if(j <= NUM-i){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
       
    }
}
