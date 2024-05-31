package exercises.Mahat;

public class Mahat_300524_2 {
    public static void main(String[] args) {
        int[] arr = {5, 11, 4, 100, 23, 12};

        // helper variables:
        int largestIndex = 0;
        int largestValue = arr[0];
        // searching for largest value in array:
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largestValue){
                largestIndex = i;
                largestValue = arr[i];
            }
        }

        // swap values:
        int temp = arr[largestIndex];
        arr[largestIndex] = arr[arr.length-1];
        arr[arr.length-1] = temp;
    }

}
