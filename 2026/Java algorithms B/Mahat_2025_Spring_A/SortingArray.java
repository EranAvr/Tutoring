package Mahat_2025_Spring_A;

public class SortingArray {
    public static void main(String[] args) {
        int[] arr = {1,5,2,7,9,-3,10,-2};

        // אלגוריתם Bubble-sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
