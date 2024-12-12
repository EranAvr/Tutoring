package exercises;

public class Arrays090524 {
    public static void main(String[] args) {

        // Exercises:
        // Link: https://www.w3resource.com/java-exercises/array/index.php

        // Creation of empty 2D array (also called table).
        // Here, we specify rows=2 and columns=3.
        int[][] table = new int[2][3];
        // write the value '5' to the table's cell,
        // in row-index = 1 and column-index = 2
        table[1][2] = 5;
        // print specific cells
        System.out.println(table[1][2]);
        System.out.println(table[1][1]);

        // Using Initializer list, to create a table with selected values at start.
        int[][] table2 =    {{1, 2, 3},
                            {4, 5, 6}};
        // print specific cells
        System.out.println(table2[0][1]);
        System.out.println(table2[1][2]);


        System.out.println("--------------------------");
        // Testing our transpose() function.
        printTable(table2);
        int[][] result = transpose(table2);
        printTable(result);
        printTableWithMiniFor(result);



        System.out.println("--------------------------");
        int[][] table3 =    {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};
        System.out.println("Before:");
        printTable(table3);
        swapRows( table3 , 0, 2);
        System.out.println("After:");
        printTable(table3);

    }

    // Some helper methods:
    static public void printTable(int[][] arr){
        // This method traverse on the table, by rows (outer loop) and columns (inner loop).
        // This means that we read each line, and for each line we read all of its columns,
        // before moving to the next row.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + ",");
            }
            System.out.println();
        }
    }
    static public void printTableWithMiniFor(int[][] arr){
        // Implementing printTable, but with shorten loops.
        for (int[] tempArr : arr){
            for (int n : tempArr){
                System.out.print(n + ",");
            }
            System.out.println();
        }
    }

    static public int[][] transpose(int[][] arr){
        // Create new empty array, with flipped dimensions.
        // That means: original rows => new table columns,
        //              original columns => new table rows.
        // That way, we have an empty array with the desired shape,
        // and we just need to fill it with values.
        int[][] temp = new int[arr[0].length][arr.length];

        // Traversing the original table, read its values,
        // and write each value to the new table after flipping the indexes of rows and columns.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                temp[j][i] = arr[i][j];
            }
        }

        // Return the new table we created
        return temp;
    }


    static public void swapRows(int[][] arr, int index1, int index2){
        // The general idea follows swapping between two values,
        // BUT, because objects/arrays referenced by address, then
        // what we actually swap is the addresses of two different
        // rows (which are actually regular arrays).

        // holding one of the rows (array address) in temp variable-
        int[] tempArr = arr[index1];
        // save one row into the other-
        arr[index1] = arr[index2];
        // save first row, from temp-var, into the second one-
        arr[index2] = tempArr;
    }

}
