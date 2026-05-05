package ex050526;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // ex1
        /*
            כתבו פונ' המקבלת שני מספרים שלמים חיוביים n,m כפרמטרים.
            הפונ' תחזיר מערך דו-ממדי עם n שורות ו-m עמודות,
            שכל תאיו מכילים מספרים רנדומלים
         */

        // ex2
        /*
            a)
            כתבו פונ' המקבלת שני מערכים דו-ממדיים mat1, mat2 כפרמטרים.
            הפונ' תחזיר מערך דו-ממדי חדש, באותו הגודל, שתאיו מכילים
            את חיבור התאים המתאימים מהמערכים mat1, mat2.
            * המערכים mat1, mat2 חייבים להיות באותו הגודל!!
            1 2     +   5 6     =   6 8
            3 4         7 8         10 12

            b)
            שפרו את הפונ' כך:
            הוסיפו פרמטר שלישי המתקבל ע"י הפונ', אשר יקבע את
            מצב עבודתה: חיבור או חיסור.
            הפונ' תבצע חיבור/חיסור בין המטריצות בהתאם למצב הנבחר.
         */

        // ex3
        /*
            כתבו פונ' המקבלת מטריצה (מערך דו ממדי) של מספרים שלמים,
            ומחזירה את מטריצת ה-transpose שלה.
            כל שורה במטריצת הקלט הופכת להיות עמודה במטריצת התוצאה.
         */
        int[][] mat = randMatrix(5,5);
        System.out.println("--------------");
        printMatrix( mat );
        printMatrix( transpose(mat) );
        System.out.println("--------------");


        // ex4
        /*
            אלכסון ראשי הוא אלכסון התאים שבהם i==j.
            משולש עליון הוא כל התאים במערך שנמצאים מעל האלכסון הראשי.

            כתבו פונ' המקבלת מערך דו-ממדי של מספרים שלמים,
            ומחזירה את סכום המשולש העליון של המערך.
         */

        // ex5
        /*
            מטריצת זהות היא מערך דו-ממדי, אשר בו האלכסון הראשי
            מכיל ערך 1 בכל תאיו, וכל שאר תאי המערך מכילים ערך 0.

            כתבו פונ' בוליאנית המקבלת מערך דו-ממדי ובודקת האם הוא
            מטריצת זהות.
         */

        // ex6
        /*
            כתבו פונ' המקבלת מערך דו-ממדי המכיל בתאיו את
            הערכים 0, 1 בלבד.
            הפונ' תדפיס למסך את כל עמודות המערך שיש להן סכום ייחודי.
            לדוגמא:
            2D-Array:
                1 0 1 0
                0 1 0 1
                1 0 0 1
                1 1 0 0
            Sums:
                3 2 1 2
            Result:
                print first and third columns
                נדפיס למסך את העמודות הראשונה והשלישית (אינדקסים j=0,2)
         */
        
        // ex7
        /*
            כתבו פונ' המקבלת שתי מטריצות mat1, mat2.
            הפונ' תחזיר מטריצת תוצאת המכפלה בין שני המערכים.
            שימו לב! יש להכיר את הנוסחא
            למכפלת מטריצות.
            https://www.w3resource.com/c-programming-exercises/array/c-array-exercise-21.php

         */
    }
    // Helper functions:
    public static void printMatrix(int[][] mat){
        for (int i = 0; i < mat.length; i++) {  // מעבר על שורות הטבלה
            for (int j = 0; j < mat[0].length; j++) {   // מעבר על עמודות הטבלה
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();   // הדפסה ריקה לירידת שורה
        }
    }



    // ex1
    public static int[][] randMatrix(int n, int m){
        Random rnd = new Random();

        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {   // לכל שורה i
            for (int j = 0; j < m; j++) {   // לכל עמודה j
                mat[i][j] = rnd.nextInt(11);
            }
        }
        return mat;
    }

    // ex2a
    public static int[][] addMatrices(int[][] mat1, int[][] mat2){
        if (mat1.length != mat2.length || mat1[0].length != mat2[0].length)
            return null;

        int[][] res = new int[mat1.length][mat1[0].length];
        //                        עמודות           שורות
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return res;
    }
    // ex2b
    public static int[][] combineMatrices(int[][] mat1, int[][] mat2, boolean mode){
        if (mat1.length != mat2.length || mat1[0].length != mat2[0].length)
            return null;

        int factor = 1;
        if (!mode)
            factor *= -1;
        int[][] res = new int[mat1.length][mat1[0].length];
        //                        עמודות           שורות
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                res[i][j] = mat1[i][j] + factor*mat2[i][j];
            }
        }
        return res;
    }

    // ex3
    public static int[][] transpose(int[][] mat){
        int newRows = mat[0].length;
        int newCols = mat.length;
        int[][] res = new int[newRows][newCols];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                res[j][i] = mat[i][j];
            }
        }
        return res;
    }

    // ex4
    public static int upperTriangle(int[][] mat){
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = i+1; j < mat[0].length; j++) {
                sum += mat[i][j];
            }
        }
        return sum;
    }

    // ex5
    public static boolean isIdentityMatrix(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i==j && mat[i][j]!=1)
                    return false;
                else if (i!=j && mat[i][j]!=0)
                    return false;
            }
        }
        return true;
    }

}
