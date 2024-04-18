package exercises;

import java.sql.Array;

public class Arrays180424 {
    public static void main(String[] args) {
        // Built-in Classes for primitive types:
        int x = 5;
        double d = 2.3;

        int res = Integer.valueOf("45");
        System.out.println(res);
        int max = Integer.max(23, 32);
        System.out.println(max);

        String str = "aBCd";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());


        // Example for making a validation on String/Array input:
        // We create a boolean variable with true value,
        // then we make checks to validate that everything is ok.
        // If we detect an error we should enter the if-condition,
        // change variable value to false and break out from the process.
        boolean allIsGood = true;   //
        // traditional for-loop -
        for (int i=0 ; i<str.length(); i++){
            // we iterate over our string, to make validations
            if(false){

                // validation code could go here...

                allIsGood = false;
                break;
            }
        }
        // syntax for shorten for-loop -
        for (char c : str.toCharArray()){
            System.out.println(c);
        }


        // Empty initialization -
        int[] integers = new int[5];
        String[] strings = new String[5];
        printArray(integers);
        printStringsArray(strings);
        // Array with inline initialization -
        int[] init = {1, 3, 5, 19, 29};
        printArray(init);


        System.out.println("---------------- Exercises Output -------------------");
        // Exercises:
        // Link: https://www.w3resource.com/java-exercises/array/index.php

        // ex7
        int[] ints = {1, 3, 5, 19, 29};
        printArray( printStringsArray(ints, 1) );
        printArray( printStringsArray(ints, 3) );
        // ex10
        findMinAndMax(ints);
        // ex12
        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
        findDups(my_array);


    }


    // Functions to print int/String arrays:
    static public void printArray(int[] arr){
        for (int i=0; i < arr.length; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
    static public void printStringsArray(String[] arr){
        // shorten for-loop
        for (String s : arr){   // for-each String s, from the Strings-array we received.
            System.out.print(s + ",");
        }
        System.out.println();
    }




    // Exercises:

    // Task: Write a function, that receives an array and an index,
    // and returns a new array without the specified element.
    static public int[] printStringsArray(int[] arr, int index){
        int[] newArr = new int[arr.length-1];

        int j = 0;
        for (int i=0 ; i < arr.length; i++){
            if (arr[i] != arr[index]) {
                newArr[j] = arr[i];
                j++;
            }
        }

        return newArr;
    }

    // Simple function to find maximum and minimum values
    // in an array.
    // We iterate through it once, and look for min and max
    // at the same time.
    static public void findMinAndMax(int[] arr){
        int iAmMin = arr[0];
        int iAmMax = arr[0];

        for (int i=0 ; i < arr.length; i++){
            // searching for minimum:
            if (iAmMin > arr[i]){
                iAmMin = arr[i];
            }
            // searching for maximum:
            if (iAmMin < arr[i]){
                iAmMin = arr[i];
            }
        }

        System.out.println("Max: " + iAmMin);
        System.out.println("Min: " + iAmMax);
    }

    // Here, we check every cell in the array,
    // and compare it with all the others.
    // Notice: to prevent double-counting, we run
    // the j-index from i and on...
    static public void findDups(int[] arr){
        int count;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == arr[i])
                    count++;
            }
            if (count == 2)
                System.out.println(arr[i]);
        }
    }
    // Here, we repeat the same algorithm,
    // but this time we use String.equals() to compare
    // between two strings.
    static public void findDupsOnStrings(String[] arr){
        int count;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j].equals(arr[i]))
                    count++;
            }
            if (count == 2)
                System.out.println(arr[i]);
        }
    }
}
