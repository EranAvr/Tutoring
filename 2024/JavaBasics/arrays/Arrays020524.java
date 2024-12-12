package exercises;

public class Arrays020524 {
    public static void main(String[] args) {

        // Exercises:
        // Link: https://www.w3resource.com/java-exercises/array/index.php

        // ex16
        // Q: Write a Java program to remove duplicate elements from an array.
        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
        printArray(my_array);
        printArray(removeDups(my_array));

        // ex24
        // Q: Write a Java program to find a missing number in an array.
        int[] numbers = new int[]{1, 2, 3, 4, 6, 7};
        printArray(numbers);
        System.out.println(isSequence(numbers));

        // ex42
        // Q: Write a Java program to separate 0s and 1s in an array of 0s and 1s into left and right sides.
        int nums[] = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};
        printArray(nums);
        printArray(separate01(nums));
    }

    // Some helper methods:
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



    // Exercises Implementations:

    static public int[] removeDups(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    // mark duplicate values with special value '-1':
                    arr[i] = arr[j] = -1;
                }
            }
        }
        // count how many instances of '-1' are in the array:
        int globalCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1)
                globalCount++;
        }
        // build a new array, shorter in length:
        int newSize = arr.length - globalCount;
        int[] newArray = new int[newSize];
        // copy all valid values to new array:
        int newIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1){
                newArray[newIndex] = arr[i];
                newIndex++;
            }
        }
        // return new array as output:
        return newArray;
    }

    static public boolean isSequence(int[] arr){

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i-1] != 1){
                System.out.println("Last valid value: " + arr[i-1]);
                return false;
            }
        }
        return true;
    }

    static public int[] separate01(int[] arr){
        /*
            In this solution, we use what's called "Counting Array".
            A counting-array is an array of counters,
            i.e. an array which evey cell in it, is used as a counter variable.

            The general idea, is to create a countin-array of zeros '0',
            when it's indexes are the values of the original array.
            Every value in the original array, MUST have a matching index in the counting-array.

            That way, every value we read from original-array, is exactly the index
            of this value's counter cell, in the counting-array.

            Video tutorial: https://www.youtube.com/watch?v=OKd534EWcdk&ab_channel=CSDojo
         */

        // create a counter array:
        int[] countersArray = new int[2];
        // counting values occurrences:
        for (int value : arr) {
            // each value we read from 'arr', is the index in 'countersArray'.
            countersArray[value]++;
        }
        // now we are rewriting the array, but in a sorted order:
        int writingIndex = 0;
        for (int i = 0; i < countersArray.length; i++) {

            for (int j = 0; j < countersArray[i]; j++) {
                arr[writingIndex] = i;
                writingIndex++;
            }
        }
        // return sorted array as result:
        return arr;
    }
}
