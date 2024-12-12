package exercises;

public class Mahat230524 {
    public static void main(String[] args) {
        int[] array1 = {1,-4,4,9,2};
        int[] array2 = {9,2,0,-1,3,11,23};

        printArray(multiply(array1, array2));
        printArray(multiplyBetter(array1, array2));
    }
    static public void printArray(int[] arr){
        for (int i=0; i < arr.length; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    public static int[] multiply(int[] arr1, int[] arr2){
        int[] result;

        if (arr1.length > arr2.length){
            int k = arr2.length;    // small
            int m = arr1.length;    // large

            result = new int[m];

            for (int i = 0; i < k; i++) {
                result[i] = arr1[i] * arr2[i];
            }
            for (int i = k; i < m; i++) {
                result[i] = arr1[i];
            }
        }
        else {
            int k = arr1.length;    // small
            int m = arr2.length;    // large

            result = new int[m];

            for (int i = 0; i < k; i++) {
                result[i] = arr1[i] * arr2[i];
            }
            for (int i = k; i < m; i++) {
                result[i] = arr2[i];
            }
        }

        return result;
    }

    public static int[] multiplyBetter(int[] arr1, int[] arr2){

        if (arr1.length > arr2.length){
            int k = arr2.length;    // small
            //int m = arr1.length;    // large

            for (int i = 0; i < k; i++) {
                arr1[i] = arr1[i] * arr2[i];
            }
            return arr1;
        }
        else {
            int k = arr1.length;    // small
            //int m = arr2.length;    // large

            for (int i = 0; i < k; i++) {
                arr2[i] = arr1[i] * arr2[i];
            }
            return arr2;
        }
    }
}
