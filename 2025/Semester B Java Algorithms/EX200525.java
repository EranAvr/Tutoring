public class EX200525 {
    public static void main(String[] args) {
        // Recursion Exercises
        // url: https://www.w3resource.com/c-programming-exercises/recursion/index.php

        // Simple Example:
        /*
            פונ' רקורסיבית קוראת לעצמה.
            כל קריאה מחודשת אל עצמה, פותחת איזור אחסון חדש בזיכרון,
            עבור אותה הפעלה של הפונ'.
            ז"א שכל קריאה מחודשת אל הפונ' כאילו קראה לפונ' אחרת ונפרדת.
            איזור האחסון בזכרון נקרא "מסגרת זכרון"
         */

        failRecursion(1);
        // rest of the code goes here...
        /*
            ברגע שנסיים את הרקורסיה,
            והיא תקופל ותיסגר לגמרי (כל המסגרות נסגרו ונמחקו)
            אנו חוזרים אחורה אל המקום שבו הפעלנו את הפונ' מלכתחילה.
            מכאן, ולאחר הרקורסיה, נמשיך את ריצת הקוד כרגיל.
         */


        // Exercises
        // ex1
        /*
            Write a program in Java to print the first 50
            natural numbers using recursion.
            תוכנית רקורסיבית להדפסת 50 המספרים הטבעיים הראשונים
         */
        countTo50(1);
        countTo50(20);

        // ex
        /*
            כתבו פונ' רקורסיבית שמקבלת מספר טבעי n כפרמטר,
            ומדפיסה למסך את המספרים 1 עד n
         */
        countToN(30);

        // ex4
        /*
            Write a program in Java to print the array elements
            using recursion.

         */
        int[] arr = {10,20,30,40,50};
        printArr(0, arr);

        // ex2
        /*
            Write a program in Java to calculate the sum of numbers
            from 1 to n using recursion.
            כתבו פונ' רקורסיבית המקבלת מספר טבעי n כפרמטר,
            ומחזירה את סכום המספרים מ-1 ועד n.

            Input:
            n = 5
            Expected Output:
            The sum of numbers from 1 to 5 :
            15
         */
    }

    // methods:
    public static void failRecursion(int x){
        if (x == 10){
            return;
        }

        System.out.println("Recursion call " + x);
        x = x + 1;

        failRecursion(x);
    }



    // -------- Exercises --------
    // ex1
    public static void countTo50(int x){
        System.out.println("Count " + x);
        if (x == 50)
            return;

        x++;
        countTo50(x);
    }

    // ex
    public static void countToN(int n){
        if (n <= 0)
            return;

        countToN(n-1);
        System.out.println(n);
    }

    // ex4
    public static void printArr(int i, int[] arr){
        if (i >= arr.length)
            return;

        System.out.println("arr["+i+"] = " + arr[i]);
        printArr(i+1, arr);
    }
}
