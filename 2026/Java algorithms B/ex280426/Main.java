package ex280426;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // יצירת מערך דו ממדי
        int[][] matrix = {  {1,2,3},
                            {4,5,6},
                            {7,8,9}};
        // פנייה אל תאים של מערך דו ממדי
        System.out.println(matrix[1][0]);
        System.out.println(matrix[2][2]);

        // ex1
        /*
            כתבו פונ' המקבלת מערך דו ממדי, ומדפיסה אותו למסך כטבלה.
            כל שורה במערך תודפס בשורה נפרדת, והעמודות יודפסו זו לצד זו
         */
        printMatrix(matrix);
        System.out.println("---------");

        // ex2
        /*
            כמו תרגיל (1), אבל הפעם העמודות (!!) מודפסות בסדר הפוך
         */
        printReverseCols(matrix);
        System.out.println("---------");

        // ex3
        /*
            כמו תרגיל (1), אבל הפעם השורות (!!) מודפסות בסדר הפוך
         */
        printReverseRows(matrix);
        System.out.println("---------");

        // ex4
        /*
            כמו תרגיל (1), אבל גם השורות וגם העמודות מודפסות בסדר הפוך
         */
        printReverseMatrix(matrix);
        System.out.println("---------");

        // ex5
        /*
            כתבו פונ' המקבלת מערך דו-ממדי מטיפוס int
            ומחזירה את הערך המקסימלי שבו
         */

        // ex6
        /*
            כתבו פונ' המקבלת כפרמטרים שני מספרים שלמים חיוביים n, m.
            הפונ' תיצור מערך דו-ממדי בגודל n*m, ותמלא אותו בערכים
            רנדומליים בטווח 0-255.
            על הפונ' להחזיר כערך את המערך שיצרה.
         */

        // ex7
        /*
            כתבו פונ' המקבלת מערך דו-ממדי mat ומספר שלם num.
            הפונ' תוסיף לכל תאי המערך את הערך num
         */

        // ex8
        /*
            כתבו פונ' המקבלת מערך דו-ממדי mat בגודל n (שורות) על m (עמודות).
            הפונ תייצר ותחזיר מערך חדש עם m שורות ו-n עמודות.
            כל שורה מהמערך המקורי הופכת להיות עמודה במערך החדש.
         */

    }

    // ex1
    public static void printMatrix(int[][] mat){
        for (int i = 0; i < mat.length; i++) {  // מעבר על שורות הטבלה
            for (int j = 0; j < mat[0].length; j++) {   // מעבר על עמודות הטבלה
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();   // הדפסה ריקה לירידת שורה
        }
    }

    // ex2
    public static void printReverseCols(int[][] mat){
        for (int i = 0; i < mat.length; i++) {  // מעבר על שורות הטבלה
            for (int j = mat[0].length-1; j >= 0; j--) {   // מעבר על עמודות הטבלה
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();   // הדפסה ריקה לירידת שורה
        }
    }

    // ex3
    public static void printReverseRows(int[][] mat){
        for (int i = mat.length-1; i >= 0; i--) {  // מעבר על שורות הטבלה
            for (int j = 0; j < mat[0].length; j++) {   // מעבר על עמודות הטבלה
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();   // הדפסה ריקה לירידת שורה
        }
    }

    // xe4
    public static void printReverseMatrix(int[][] mat){
        for (int i = mat.length-1; i >= 0; i--) {  // מעבר על שורות הטבלה
            for (int j = mat[0].length-1; j >= 0; j--) {   // מעבר על עמודות הטבלה
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();   // הדפסה ריקה לירידת שורה
        }
    }

    // ex5
    public static int findMax(int[][] mat){
        int max = mat[0][0];    // יצירת משתנה עזר, ואיתחול שלו
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] > max) // אם מצאנו מקסימום חדש
                    max = mat[i][j];    // נשמור מקסימום במשתנה עזר
            }
        }
        return max; // נחזיר ערך מקסימלי
    }

    // ex6
    public static int[][] createRandomImage(int n, int m){
        int[][] image = new int[n][m];
        Random rnd = new Random();

        for (int i = 0; i < image.length; i++) {  // מעבר על שורות הטבלה
            for (int j = 0; j < image[0].length; j++) {
                image[i][j] = rnd.nextInt(256);
            }
        }

        return image;
    }

    // ex7
    public static void changeBrightness(int[][] image, int num){
        for (int i = 0; i < image.length; i++) {  // מעבר על שורות הטבלה
            for (int j = 0; j < image[0].length; j++) {
                image[i][j] += num;
            }
        }
    }
}
