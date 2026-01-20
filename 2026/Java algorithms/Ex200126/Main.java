package Ex200126;

public class Main {
    public static void main(String[] args) {
        
    }

    /*
        כתבו פונ' המקבלת 3 מספרים ומחזירה
        את המס' הקטן ביותר
     */
    public static int findSmallest(int x, int y, int z){
        int small = x;
        if (y < small)
            small = y;
        if (z < small)
            small = z;
        return small;
    }

    /*
        כתבו פונ' המקבלת מערך של מספרים שלמים.
        הפונ' תחשב את ממוצע המספרים ותחזיר אותו כערך.
     */
    public static double calcAvg(int[] arr){
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
        }
        avg /= arr.length;
        return avg;
    }
}
