package ex190526;

public class Main {
    public static void main(String[] args) {
        // ex1
        /*
            כתבו פונ' רקורסיבית המדפיסה למסך
            את כל המספרים האי-זוגיים מ-n ועד 1
         */


        // ex2
        /*
            כתבו פונ' רקורסיבית המקבלת מחרוזת ומדפיסה למסך
            את המחרוזת בסדר הפוך.
         */


        // ex3
        /*
            כתבו פונ' רקורסיבית המקבלת מערך מספרים ומדפיסה למסך
            את ערכי המערך בסדר הפוך ובאותה השורה.
            שימו לב (!!) ניתן לבחור כרצונכם מה הפרמטרים של הפונ'.
         */


        // ex4
        /*
            כתבו פונ' רקורסיבית המקבלת מספר-שלם-חיובי ומדפיסה למסך
            את המספר בסדר ספרות הפוך.
         */


        // ex5
        /*
            כתבו פונ' המדפיסה למסך באופן רקורסיבי את לוח-הכפל
            של מספר שלם חיובי n.
            לדוגמא:
            printTable(7)
                7
                14
                21
                ...
                70
         */
    }


    // ex1
    public static void recPrintOdds(int n){
        if (n == 0)
            return;

        if (n%2==1)
            System.out.println(n);

        recPrintOdds(n-1);
    }

    // ex2
    public static void recPrintReverseString(String str){
        if (str.length() == 0)
            return;

        recPrintReverseString(str.substring(1));

        System.out.print(str.charAt(0));
    }

    // ex3
    public static void printReverseArray(int[] arr){
        recPrintReverseArray(arr, 0);
    }
    public static void recPrintReverseArray(int[] arr, int i){
        if (i == arr.length)
            return;

        recPrintReverseArray(arr, i+1);

        System.out.print(arr[i] + " ");
    }
}
