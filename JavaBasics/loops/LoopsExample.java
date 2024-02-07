import java.util.Scanner;

public class LoopsExample {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
       // While

        /*
        while (true) {
            System.out.println("I'm here");
        }
        */

        /*
        int num = 0;
        while (num < 10){
            System.out.println(++num);
        }
        */

        /*
        while (true){
            String cmd = s.next();
            if (cmd.equals("quit")){
                System.out.println("Bye bye..");
                break;
            }

            System.out.println("User entered: " + cmd);
        }
        */


        String searchValue;
        //Do-While:
        do {
            // loop body-
            searchValue = s.next();

            // condition-
        } while (! searchValue.equals("Eran"));




        // For:
        // 1. init
        // 2. condition
        // 3. step
        /*
        for (int i = 0 ; i < 10 ; i++) {
            System.out.println(i);
        }
        System.out.println("-----------");
        for (int i = 0 ; i < 10 ; i+=2) {
            System.out.println(i);
        }
        System.out.println("-----------");
        for (int i = 10 ; i < 1000000 ; i*=10) {
            System.out.println(i);
        }

        for (int i = 0 ; ; ){
            System.out.println("Still printing..");
        }
        */

        for (int i=0 ; i < 10; i++){
            if (i%2==0)
                continue;
            System.out.println(i);
        }
    }
}
