package ex190526;

public class Main2 {
    public static void main(String[] args) {
        // ex1
        /*
            כתבו פונ' רקורסיבית המחזירה את סכום המספרים
            מ-1 ועד n.
         */

        // ex2
        /*
            כתבו פונ' רקורסיבית לחישוב n-עצרת.
            עצרת היא מכפלת כל המספרים מ-1 ועד n.
         */

        // ex3
        /*
            כתבו פונ' רקורסיבית המחשבת ומחזירה
            את סכום המספרים הזוגיים (!!) מ-1 ועד n.
         */

        // ex4
        /*
            כתבו פונ' רקורסיבית המקבלת שני מספרים שלמים חיוביים: a, b
            הפונ' תחזיר את מכפלת כל המספרים בין a לבין b.
         */

        // ex5
        /*
            כתבו פונ' רקורסיבית המקבלת שני פרמטרים של מס' שלמים חיוביים: a, b
            הפונ' תחזיר את הערך של a^b (כלומר a בחזקת b)
         */

        // ex6
        /*
            כתבו פונ' רקורסיבית המקבלת מס' שלם חיובי רב-ספרתי num.
            הפונ' תחזיר את מס' הספרות של המספר num
         */

        // ex7
        /*
            כתבו פונ' רקורסיבית המקבלת מס' שלם חיובי רב-ספרתי num.
            הפונ' תחזיר את מס' הספרות הזוגיות (!!) של המספר num
         */
    }

    // ex1
    public static int recSumToN(int n){
        if (n == 0)
            return n;

        /*int sum = n + recSumToN(n-1);
        return sum;*/
        return n + recSumToN(n-1);
    }

    // ex2
    public static int recFactorial(int n){
        if (n == 1)
            return n;

        return n * recSumToN(n-1);
    }

    // ex3
    public static int recSumEvens(int n){
        if (n == 0)
            return n;

        int sum = recSumEvens(n-1);
        if (n%2==0) // טוב לי
            return n + sum;

        return sum;
    }
}
