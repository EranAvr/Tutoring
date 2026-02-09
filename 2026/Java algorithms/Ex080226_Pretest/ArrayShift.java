package Ex080226_Pretest;

import java.util.Arrays;

public class ArrayShift {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        shiftByK(a, 7);
    }

    public static void shiftByK(int[] arr, int k){
        // [1,2,3,4,5] k=2
        //k %= arr.length;
        int[] tempArr = new int[arr.length];
        // fill temp array:
        for (int i = 0; i < arr.length; i++) {
            tempArr[ (i+k)%arr.length ] = arr[i];
        }
        System.out.println(Arrays.toString(tempArr));
        // copy values to original:
    }
}
