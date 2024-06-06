package Mahat.SemiFinal;

public class Ex2 {
    public static void main(String[] args) {
        /*
            Algorithm:
            1) finding minimal value
            2) if - value is in the middle
                => swap value with first element
            3) if - value is in first cell
                => swap value with last element
         */

        // Code:
        int[] arr1 = {10, 12, 23, 4, 5, 6};
        int[] arr2 = {4, 12, 23, 10, 5, 6};

        ex2(arr1);
        ex2(arr2);

        printArray(arr1);
        printArray(arr2);


    }

    public static void ex2(int[] arr){
        // 1) find minimal
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[minIndex])
                minIndex = i;
        }
        // 2) swap to prior
        if (minIndex != 0){
            int temp = arr[minIndex];
            arr[minIndex] = arr[minIndex-1];
            arr[minIndex-1] = temp;
        }
        // 3) swap to ending
        else {
            int temp = arr[minIndex];
            arr[minIndex] = arr[arr.length-1];
            arr[arr.length-1] = temp;
        }

    }

    static public void printArray(int[] arr){
        for (int i=0; i < arr.length; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
}
