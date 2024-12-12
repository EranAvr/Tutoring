package exercises.Mahat;

import java.util.Scanner;

public class M2023b {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* Testing: */

        // ex1
        findSmallestAndLargest();

        // ex2a
        String str = "AbbAc1A";
        boolean result = isValid(str);
        System.out.println(result);
        // ex2b
        testIsValid();
    }





    /* Method Implementations: */
    public static void findSmallestAndLargest(){
        Scanner s = new Scanner(System.in);
        int smallest = 99;  // start with the highest value
        int largest = -99;  // start with the lowest value
        while (true){
            int num = s.nextInt();
            if (num < -99 || num > 99)   // if the number has 3 digits
                break;

            if (num < smallest) // if smaller number was found
                smallest = num;
            if(num > largest)   // is larger number was found
                largest = num;
        }
        System.out.println("Smallest number: " + smallest + " Largest number: " + largest);
    }

    // ex2a
    public static boolean isValid (String s){
        if (s.length() % 2 == 0)
            return false;
        if ( s.charAt(0) != s.charAt(s.length()/2) || s.charAt(0) != s.charAt(s.length()-1) )
            return false;

        return true;
    }
    // ex2b
    public static void testIsValid(){
        Scanner s = new Scanner(System.in);
        int countValid = 0; // count good results
        int countInvalid = 0;   // count bad results

        int N = 23;
        for (int i=0; i<N; i++){
            String str = s.nextLine();
            if (isValid(str)){
                countValid++;
            } else {
                countInvalid++;
            }
        }
        System.out.println("Count valid strings: " + countValid);
        System.out.println("Count Invalid strings: " + countInvalid);
    }

    // ex3:
    public static void isBalancedArray(int[] arr){
        /*
        int count = 0;
        boolean isThereAZero = false;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                isThereAZero = true;
            }
            if (arr[i] > 0)
                count++;
            else if (arr[i] < 0)
                count--;

        }
        if (count == 0 && !isThereAZero){    // all is good
            // print array as is..
        }
        else {    // error was found
            // print array in reverse..
        }

         */
        int count = 0;  // Counter for positive and negative numbers.
                        // We increment (+1) the counter for positive numbers,
                        // and decrement (-1) for negatives.

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                count = arr.length * 3; // If we find a zero, we give 'count' a very large value,
                                        // that way it will never be 0 by increment/decrement operations.
            }
            if (arr[i] > 0)
                count++;
            else if (arr[i] < 0)
                count--;

        }
        if (count == 0){    // all is good
            // print array as is...
        }
        else {    // error was found
            // print array in reverse...
        }
    }
}
