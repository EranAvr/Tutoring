package Mahat_Spring_2024_A;

public class Arrays {
    public static void main(String[] args) {
        /*
        int[] arr = {1,2,3,4,5};
        char[] chars = {'#', '@', '5', 'a'};

        System.out.println(arr[2]);

        int[][] table = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] table2 = { {1,2}, {3,4}, {5,6} };
        // table2[0] => {1,2}
        // table2[1] => {3,4}
        // table2[3] => {5,6}
        System.out.println(table2[1]);

        int[] second = table2[1];
        System.out.println(second[0]);
        System.out.println(second[1]);
        */


        // Exercises

        // ex74:
        /*
            Write a Java program to test if 10 appears as the first or last element of an array of integers. The array length must be broader than or equal to 2.
            Sample Output:
            Test Data: array = 10, -20, 0, 30, 40, 60, 10
         */
        int[] arr1 = {3,15,67,80,10};
        /*for (int i=0; i < arr1.length; i++){
            if (arr1[i] == 10 && i == 0){   // 10 נמצא בתא הראשון
                System.out.println("10 is in first cell");
            }
            if (arr1[i] == 10 && i == arr1.length-1){   // 10 נמצא בתא האחרון
                System.out.println("10 is in last cell");
            }
        }*/
        /*if (arr1[0] == 10){   // 10 נמצא בתא הראשון
            System.out.println("10 is in first cell");
        }
        if (arr1[arr1.length-1] == 10){   // 10 נמצא בתא האחרון
            System.out.println("10 is in last cell");
        }*/


        // ex75:
        /*
            Write a Java program to test if the first and last elements
            of an array of integers are the same.
            The array length must be broader than or equal to 2.
         */
        /*int[] arr2 = {3,15,67,80,10,5,3};
        if (arr2[0] == arr2[ arr2.length-1 ]){
            System.out.println("First and last are equals");
        }*/


        // ex76:
        /*
            Write a Java program to test if the first and
            last element of two integer arrays are the same.
            The array length must be greater than or equal to 2.
            Test Data:
                array1 = 50, -20, 0, 30, 40, 60, 12
                array2 = 45, 20, 10, 20, 30, 50, 11, 12
         */
        /*int[] array1 = {50, -20, 0, 30, 40, 60, 12};
        int[] array2 = {45, 20, 10, 20, 30, 50, 11, 12};
        if (array1[0] == array2[0]){
            System.out.println("First cells are equals");
        }
        if (array1[ array1.length-1 ] == array2[ array2.length-1 ]){
            System.out.println("Last cells are equals");
        }*/


        // ex77:
        /*
            Write a Java program to create an array of length 2
            from two integer arrays with three elements.
            The newly created array will contain the first and last
            elements from the two arrays.
            Test Data:
                array1 = 50, -20, 0
                array2 = 5, -50, 10
            Sample Output:
                New Array: [50, 10]
         */
        /*int[] array1 = {50, -20, 0};
        int[] array2 = {5, -50, 10};

        // int[] arr = new int[10]; יצירת מערך ריק בגודל 10 תאים

        int[] arr = new int[2];
        arr[0] = array1[0];
        arr[1] = array2[ array2.length-1 ];*/


        // ex78:
        /*
            Write a Java program to test that a given array of integers
            of any length contains a 4 or a 7.
         */
        /*int[] array1 = {50, -20, 0,45,890, 7, -56, 23,21, 100};
        for (int i=0; i < array1.length; i++){
            if (array1[i] == 7 || array1[i] == 4){
                System.out.println("Found value of "+array1[i]+" in index "+i);
            }
        }*/


        // ex80:
        /*
            Write a Java program to get the largest value
            between the first and last elements of an array of integers.
         */
        /*int[] array1 = {50, -20, 0,45,890, 7, -56, 23,21, 100};
        if (array1[0] > array1[ array1.length-1 ]){ // הראשון גדול יותר
            System.out.println("First element is larger: " + array1[0]);
        }
        if (array1[0] < array1[ array1.length-1 ]){  // האחרון גדול יותר
            System.out.println("Last element is larger: " + array1[array1.length-1]);
        }
        else {
            System.out.println("Elements are equals");
        }*/


        // ex81:
        // Swap algorithm - אלגוריתצם החלפת ערכים
        /*
            Write a Java program to swap the first and last elements
            of an array (length must be at least 1).
         */
        /*int[] array1 = {50, -20, -56, 23, 21, 100};

        int num = array1[0];    // שמור ערך ראשון בצד
        array1[0] = array1[ array1.length-1 ];  // תעביר ערך אחרון אל התא הראשון
        array1[ array1.length-1 ] = num;    // שים את הערך הראשון בתא האחרון
        */


        // ex:
        /*
            נתון מערך מספרים שלמים.
            יש להדפיס למסך את הערך הגדול ביותר במערך.
         */
        /*int[] array1 = {50, -20, 56, -23, 21, 100, 45, 21};
        int num = array1[0];

        for (int i=0; i<array1.length; i++){
            if (num < array1[i]){
                num = array1[i];
            }
        }
        System.out.println("Largest number in array is " + num);*/


        // ex83:
        /*
            Write a Java program to multiply the corresponding elements
            of two integer arrays.
            Arrays are of equal lengths.
            Array1: [1, 3, -5, 4]
            Array2: [1, 4, -5, -2]
            Result: [1, 12, 25, -8]
         */
        /*int[] array1 = {1, 3, -5, 4};
        int[] array2 = {1, 4, -5, -2};

        int[] result = new int[array1.length];

        for (int i=0; i<array1.length; i++){
            result[i] = array1[i] * array2[i];
        }*/


        // ex:
        /*
            כתבו פונקציה אשר מקבלת כפרמטר מערך מספרים שלמים.
            הפונ' תדפיס למסך את כל ערכי המערך, על פי הסדר.
         */
        int[] array1 = {50, -20, 56, -23, 21, 100, 45, 21};
        printArray(array1); // הפעלה של פונ' ומסירת המערך שלנו אליה


        // ex:
        /*
            כתבו קוד אשר מדפיס מחרוזת למסך,
            כשכל תו מודפס בשורה נפרדת.
         */
        String str = "Hello World!";
        for (int i=0; i<str.length(); i++){ // לולאה הרצה לפי אורך מחרוזת
            System.out.println( str.charAt(i) );
        }
    }

    public static void printArray(int[] arr){   // פונ' המקבלת מערך כפרמטר
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();   // ירידה אל שורה חדשה
    }
}
