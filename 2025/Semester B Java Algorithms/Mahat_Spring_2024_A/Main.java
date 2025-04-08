package Mahat_Spring_2024_A;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // ex1:
        int countOdd = 0;
        /*
            נוסחא לספירת איטרציות בלולאה: אחרון - ראשון + 1
            29 - 0 + 1 = 30
         */
        for (int i=0; i<30; i++){
            int num = s.nextInt();
            // b)
            if (num % 2 == 1){
                countOdd++;
            }
            // a) 3 digits number
            if (num >= 100 && num <= 999){
                /*int sum = num % 10;
                sum *= (num /= 10) % 10;
                sum *= num / 10;*/
                int sum = (num % 10) * ((num /= 10) % 10) * (num / 10);
                System.out.println("mult digits is " + sum);
            }
        }
        System.out.println("Number of odd inputs: " + countOdd);

        // ex2:
        String str = s.nextLine();
        int countBig = 0, countNotSmall = 0;
        while (str.length() >= 6){
            if (str.length() % 2 == 1){
                System.out.println("Mid char: " + str.charAt(str.length()/2));
            }
            if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z'){
                countBig++;
            }
            int lastIdx = str.length()-1;
            if (str.charAt(lastIdx) < '0' || str.charAt(lastIdx) > '9'){
                countNotSmall++;
            }
            str = s.nextLine();
        }
        System.out.println("Starts with A-Z: " + countBig);
        System.out.println("Ends without a digit: " + countNotSmall);

        // ex3:

    }

    // Methods:

    // ex3a:
    public static boolean isArranged(int[] arr){
        int minOfBigs = arr[0];  // ערך מינימלי מבין הגדולים (אינדקסים זוגיים)
        for (int i=0; i<arr.length; i+=2){
            if (minOfBigs > arr[i]){
                minOfBigs = arr[i];
            }
        }
        int maxOfSmalls = arr[1];    // ערך מקסימלי מבין הקטנים (אינדקסים אי-זוגיים)
        for (int i=1; i<arr.length; i += 2){
            if (maxOfSmalls < arr[i]){
                maxOfSmalls = arr[i];
            }
        }
        /*if (maxOfSmalls < minOfBigs){
            return true;
        }
        else {
            return false;
        }*/
        return maxOfSmalls < minOfBigs;
    }
    // ex3b:
    public static void fill(int[]arr, int a, int b){
        Random rnd = new Random();

        //int pivot = a + b / 2;
        int pivot = rnd.nextInt(a, b+1);

        for (int i=0; i< arr.length; i++){
            if (i % 2 == 0){    // אינדקסים זוגיים
                arr[i] = rnd.nextInt(pivot, b+1);
            }
            else {  // אינדקסים אי-זוגיים
                arr[i] = rnd.nextInt(a, pivot);
            }
        }
    }
}
