import java.util.Scanner;

public class LoopsExercises {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

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
        int divide = s.nextInt();
        int divisor = 2;
        while (divisor < divide){
            if (divide % divisor == 0){
                System.out.println(divisor);
            }
            divisor++;
        }

    }
}
