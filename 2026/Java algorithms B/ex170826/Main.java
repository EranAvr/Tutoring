package ex170826;

public class Main {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},
                        {4,5,6,7},
                        {7,8,9,10}};
        printWithCondition(mat);

        //printByRows(mat);
        printByCols(mat);
    }

    /*
        תרגיל:
        כתבו פונ' המקבלת מערך דו-ממדי ומדפיסה-
        עבור i זוגי נדפיס ערכים זוגיים
        ועבור i אי-זוגי נדפיס ערכים אי-זוגיים
     */
    public static void printWithCondition(int[][] mat){
        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[0].length; j++) {
                if (i%2==0 && mat[i][j]%2==0)
                    System.out.print(mat[i][j] + " ");
                else if (i % 2 == 1 && mat[i][j] % 2 == 1)
                    System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }


            /*
        תרגיל:
        כתבו פונ' המקבלת מערך דו-ממדי ומדפיסה-
        עבור i זוגי נדפיס תאים עם j זוגי
        ועבור i אי-זוגי נדפיס תאים עם j אי-זוגי
     */
    public static void printWithCondition2(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            //int start = i % 2;    // לא צריך את המשתנה עזר. אפשר לאתחל את j ישירות
            for (int j = i % 2; j < mat[0].length; j+=2) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void printByRows(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.println(mat[i][j]);
            }
        }
    }
    public static void printByCols(int[][] mat){
        for (int j = 0; j < mat[0].length; j++) {
            for (int i = 0; i < mat.length; i++) {
                System.out.println(mat[i][j]);
            }
        }
    }
}
