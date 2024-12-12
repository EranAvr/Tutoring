package exercises;


import java.util.Scanner;

public class SemesterBIntro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        switch (num){
            case 5:
                System.out.println("num is 5");
                break;
            case 10:
                System.out.println("num is 10");
            case 15:
                System.out.println("num is 15");
                break;
            default:
                System.out.println("Detected another number: " + num);
                break;
        }

        // for negatives-
        if (num <0){
            if (num % 2 == 0){
                System.out.println("Number is negative, and even");
            }
            if (num % 2 != 0){
                System.out.println("Number is negative, and odd");
            }
        }
        // for positives in range-
        else if (num>=0 && num<10){
            System.out.println("Number is positive, between 0 and 9");
        }
        else {
            System.out.println("Number is positive, larger than 9");
        }

        int i;
        for (i=0; i< 10; i++){
            System.out.println("Looping with for-loop #" + i);
        }

        int x = 0;
        while (x < 10){
            System.out.println("Looping with while-loop #" + x);
            x++;
        }

        System.out.println("Calling an overloaded method without parameters-");
        System.out.println(myFunc());
        System.out.println("Calling an overloaded method with single parameter-");
        System.out.println(mult2(5));
        System.out.println("Calling another method (not overloaded) with String parameter-");
        System.out.println(mult2("abc"));
    }

    // overloading-
    private static int myFunc(){
        return 1;
    }
    private static int mult2(int num){
        return 2 * num;
    }
    // another method-
    private static String mult2(String str){
        return str + str;
    }
}
