package Mahat_Spring_2025_B;

public class Main {

    public static boolean isOrderedValues(int[] arr){
        int lastIdx = 0;
        while (lastIdx < arr.length && arr[lastIdx]%2 != 0)
            lastIdx++;

        int lastEven = arr[lastIdx];
        lastIdx++;

        while (lastIdx < arr.length){
            if (arr[lastIdx] % 2 == 0){
                if(arr[lastIdx] < lastEven)
                    return false;
                lastEven = arr[lastIdx];
            }
            lastIdx++;
        }
        return true;
    }
}

