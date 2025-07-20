package Mahat_Summer_2023_B;

public class Main {
    public static void main(String[] args) {

    }

    public static boolean isOrderedByKRemain(int[] arr, int k){
        for (int i = 1; i < arr.length; i++) {
            int r1 = arr[i] % k;
            int r2 = arr[i-1] % k;
            if (r1 > r2)
                return false;
        }
        return true;
    }
    public static int[] buildOrderedByKRemain(int[] arr, int k){
        int[] orderedArr = new int[arr.length];

        int r = 0;
        int inIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != -1 && arr[j] % k == r){
                    orderedArr[inIdx] = arr[j];
                    arr[j] = -1;
                    inIdx++;
                }
            }
            r++;
        }
        return orderedArr;
    }
}
