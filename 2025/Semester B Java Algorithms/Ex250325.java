public class Ex250325 {

    // Nested for loop

    public static void main(String[] args) {

        // Normal loop
        /*for (int i = 0; i < 10; i++) {
            // קוד לביצוע
            System.out.println(i + " ");
            // ...
            // ...
            // ...
        }*/


        // Nested loop
        for (int i = 0; i < 10; i++) {  // מעבר בין שורות
            System.out.print("i="+ i);

            for (int j = 0; j < 5; j++) {   // מעבר בין עמודות
                System.out.print("\tj=" + j);
            }
            System.out.println();
        }


        // ex1:
        /*
            כתבו קוד,
            אשר מדפיס לטרמינל ריבוע של כוכביות.
            הריבוע צריך להיות בעל 5 שורות
            ובעל 5 עמודות.
         */
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.print('*');
            }
            System.out.println();

        }

        // ex1:
        /*
            כתבו קוד,
            אשר מדפיס לטרמינל מלבן של @.
            הריבוע צריך להיות בעל 5 שורות
            ובעל 15 עמודות.
         */
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 15; j++) {
                System.out.print('@');
            }
            System.out.println();

        }
    }


}
