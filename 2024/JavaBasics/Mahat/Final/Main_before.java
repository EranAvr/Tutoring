package Mahat.Final;

import java.util.Scanner;

public class Main_before {
    public static void main(String[] args) {

    }

    // ex8a)
    public static int sumDigits(int num){
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    // ex8b)
    public static boolean validArray(int[] arr){
        /*
        for (int i = 0; i < arr.length-1; i++) {
            if (sumDigits(arr[i]) != sumDigits(arr[i+1]))
                return false;
        }
        return true;*/

        int firstSumDigits = sumDigits(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (firstSumDigits != sumDigits(arr[i]))
                return false;
        }
        return true;
    }
    // ex8c)
    public static void checkArrays(int N){
        Scanner s = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 20; i++) {
            int sizeOfArray = s.nextInt();
            int[] myArr = new int[sizeOfArray];

            for (int j = 0; j < sizeOfArray; j++) {
                myArr[j] = s.nextInt();
            }

            if (validArray(myArr) == true){
                System.out.println("Array is valid!");
                count++;
            }
        }
        System.out.println("Number of valid arrays: " + count);
    }

    public static void ex9(int N){
        Scanner s = new Scanner(System.in);
        int[] teamCounters = new int[20];

        for (int i = 0; i < N; i++) {   // calculate statistics
            int aPlayer = s.nextInt();
            int bPlayer = s.nextInt();

            teamCounters[aPlayer-1]++;
            teamCounters[bPlayer-1] += 1;
        }
        // a)
        int countUnpopular = 0;
        for (int i = 0; i < teamCounters.length; i++) {
            if (teamCounters[i] == 0)
                countUnpopular++;
        }
        System.out.println(countUnpopular);
        // b)
        int maxValue = teamCounters[0];
        int maxPlayerIdx = 0;
        for (int i = 0; i < teamCounters.length; i++) {
            if (teamCounters[i] > maxValue){
                maxValue = teamCounters[i];
                maxPlayerIdx = i;
            }
        }
        System.out.println("Number of favorite: " + maxPlayerIdx+1);
    }

    public static void ex10(){
        Scanner s = new Scanner(System.in);
        int[] boysCounter = new int[200];

        for (int i = 0; i < 180; i++) {  // main loop
            /*
                לולאה ראשית, אשר רצה על מס' הבנות בבית-ספר.
                כל איטרציה מייצגת בחירה של ילדה יחידה בבית ספר.
             */

            for (int j = 10; j > 0; j--) {
                /*
                    עבור כל ילדה, אנו מבצעים 10 בחירות.
                    כל בחירה מקבלת ניקוד הולך-ויורד, החל מ-10 (לבחירה ראשונה) ועד 1 (לבחירה אחרונה).
                 */
                int boyIdx = s.nextInt();
                boysCounter[boyIdx] += j;
            }
        }

        // a) King of prom: find max value in array
        int maxVal = 0;
        int maxIdx = 0;
        for (int i = 0; i < boysCounter.length; i++) {
            if (boysCounter[i] > maxVal){
                maxVal = boysCounter[i];
                maxIdx = i;
            }

        }
        // find boys above average:
        int avg = 0;
        for (int element : boysCounter) {
            avg += element;
        }
        avg /= boysCounter.length;
        for (int i=0; i< boysCounter.length; i++) {
            if (boysCounter[i] > avg)
                System.out.println("Boy above average: " + i);
        }
        // find boys with zero score:
        int counter = 0;
        for (int i = 0; i < boysCounter.length; i++) {
            if(boysCounter[i] == 0)
                counter++;
        }
        System.out.println("Number of boys with zero score: " + counter);
    }
}
