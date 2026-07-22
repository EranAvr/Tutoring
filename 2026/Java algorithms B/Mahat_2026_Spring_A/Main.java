package Mahat_2026_Spring_A;

public class Main {
    public static void main(String[] args) {



        // ex7a
        /*
            output = [71, 23, 15, 25, 9]
         */
        // ex7b
        /*
            output = [9, 15, 23, 25, 71]
         */
        // ex7c
        /*
            הפונ' ממיינת את מספרי המערך המקורי,
            לפי גודל הספרה שנקבעת עפ"י exp.
            exp=1 - לפי אחדות
            exp=10 - לפי עשרות
         */

        // ex8c
        /*
            סיבכויות סעיף א' - O(1)
            סיבכויות סעיף ב' - O(n^2)
         */
    }

    // ex6a
    public static String turnLef(String str){
        return str.substring(1) + str.charAt(0);
    }
    public static boolean isKRolling(String s1, String s2, int k){
        k = k % s2.length();
        for (int i = 0; i < k; i++) {
            s2 = turnLef(s2);
        }
        return s1.equals(s2);
    }
    // ex6b
    public static int findRollingK(String s1, String s2){
        for (int k = 0; k < s2.length(); k++) {
            s2 = turnLef(s2);
            if (s1.equals(s2))
                return k+1;
        }
        return -1;
    }
    // ex6c
    public static boolean areAllRotations(String[] arr, String s){
        for (int i = 0; i < arr.length; i++) {
            if (findRollingK(s, arr[i]) == -1)
                return false;
        }
        return true;
    }


    // ex8a
    public static boolean isFlower(int[][] arr, int row, int col){
        // תנאי קצה לא חוקיים
        if (row==0 || row==arr.length-1 || col==0 || col==arr[0].length){
            /*
                לכל האינדקסים הללו, חלק מעלי הכותרת נמצאים
                באינדקסים לא חוקיים
             */
            return false;
        }
        int sum = arr[row-1][col-1] + arr[row+1][col-1]
                + arr[row-1][col+1] + arr[row+1][col+1];

        return sum == arr[row][col];
    }
    // ex8b
    public static int[] flowerHearts(int[][] arr){
        // ספירת כמות הלבבות במערך
        int count = 0;
        for (int i = 1; i < arr.length-1; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                if (isFlower(arr, i, j))
                    count++;
            }
        }
        // הקצאת מערך חד ממדי, ומילוי התאים
        if (count > 0){
            // הקצאה
            int[] hearts = new int[count];
            // איתור ושמירה במערך
            int k = 0;
            for (int i = 1; i < arr.length-1; i++) {
                for (int j = 1; j < arr[0].length; j++) {
                    if (isFlower(arr, i, j))
                        hearts[k++] = arr[i][j];
                }
            }
            // החזרת המערך
            return hearts;
        }
        return null;
    }
}
