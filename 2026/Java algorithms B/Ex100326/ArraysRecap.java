package Ex100326;

import java.util.Scanner;

public class ArraysRecap {
    public static void main(String[] args) {
        /*
            קישור אל אתר התרגילים:
            https://studylib.net/doc/25916676/%D7%9Fidka%D7%9C%D7%92?p=40
         */
        System.out.println("Hello World!");
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];

    }

    // ex4
    public static void inputArray(int[] a){
        Scanner s = new Scanner(System.in);
        for(int i=0; i<a.length; i++){
            a[i] = s.nextInt();
        }
    }

    // ex5
    public static void printArray(int[] a){
        for (int i=0; i<a.length; i++){
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }

    // ex6
    public static void printBack(int[] a){
        for (int i=a.length-1; i>=0; i--){
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }

    // ex7
    public static double average(double[] dArr){
        double sum = 0;
        for (int i = 0; i < dArr.length; i++) {
            sum += dArr[i];
        }
        return sum / dArr.length;
    }

    // ex8
    public static int maxInArray(int[] a){
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }

    // ex9
    public static int difference(int[] a){
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
            if (a[i] < min)
                min = a[i];
        }
        return max - min;
    }

    // ex10
    public static boolean isSorted(int[] a){
        for (int i = 1; i < a.length; i++) {
            if (a[i-1] > a[i])
                return false;
        }
        return true;
    }

    // ex11
    public static int countNums(int[] a, int num){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= num)
                count++;
        }
        return count;
    }

    // ex12
    public static int countOdd(int[] a){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0)
                count++;
        }
        return count;
    }

    // ex13
    public static boolean isPalindrome(int[] a){
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] != a[a.length-1-i])
                return false;
        }
        return true;
    }

    // ex14
}
