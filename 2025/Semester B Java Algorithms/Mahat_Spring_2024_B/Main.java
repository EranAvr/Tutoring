package Mahat_Spring_2024_B;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner s = new Scanner(System.in);

        // ex1:
        /*int num = rnd.nextInt(100, 1000);
        int min = num;
        for (int i=0; i<49; i++){
            num = rnd.nextInt(100, 1000);
            if (min > num){
                min = num;
            }
        }
        System.out.println(min);
        int sum = (num%10) + ((num/=10)%10) + (num/10);
        System.out.println(sum);*/


        // ex2
        /*int countEvenLen = 0;
        while (true){
            String str = s.nextLine();
            if (str.isEmpty())
                continue;
            if (str.charAt(0) == str.charAt(str.length()-1)){
                break;
            }
            int countA = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'A')
                    countA++;
            }
            System.out.println("countA = " + countA);
            if(str.length() % 2 == 0)
                countEvenLen++;
        }
        System.out.println("countEvenLen = " + countEvenLen);*/


        // ex3a
        // מימוש למטה
        int[] arr = {12, 3, 7, 15, 5, 12, 6};
        System.out.println(isBalanced(arr) + " " + isBalanced2(arr));
        int[] arr2 = {12, 3, 7, 15, 5, 12, 7};
        System.out.println(isBalanced(arr2) + " " + isBalanced2(arr2));
        // ex3b
        int[] arr3 = fill(10, 1, 100);
        for (int n : arr3)
            System.out.print(n + " ");
        System.out.println("\nis 'arr3' balanced? " + isBalanced2(arr3));

    }

    // Methods:
    public static boolean isBalanced(int[] arr){
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) // even index
                sumEven += arr[i];
            else    // odd index
                sumOdd += arr[i];
        }
        return sumEven == sumOdd;
    }


    public static boolean isBalanced2(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // subtract even-places and add odd-places
            sum += ((i%2) * arr[i]) - ((i+1)%2 * arr[i]);
        }
        return sum == 0;
    }

    public static int[] fill(int size, int x, int y){
        Random rnd = new Random();
        int[] arr = new int[size];
        int count = 0;
        do {
            count++;
            for (int i = 0; i < size; i++) {    // fill array with numbers
                arr[i] = rnd.nextInt(x, y+1);
            }
        } while ( !isBalanced(arr) );

        System.out.println("Number of trials: " + count);
        return arr;
    }

    // ex4
    public static void countProducts(){
        Scanner s = new Scanner(System.in);
        int[] counters = new int[4];

        while (true){
            int code = s.nextInt(); // code = מס' קטלוג
            if (code == 0)
                break;
            int q = s.nextInt();    // q = כמות

            int digit = code / 100;
            counters[digit-1] += q;
        }

        int total = 0;
        for (int i = 0; i < counters.length; i++) {
            System.out.println("Class " + (i+1) + " quantity = " + counters[i]);
            total += counters[i];
        }
        System.out.println("Total = " + total);
    }
}
