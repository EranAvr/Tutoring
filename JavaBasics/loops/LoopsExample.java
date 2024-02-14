import java.util.Scanner;

public class LoopsExample {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
       // While
/*
        // Infinite loop
        while (true) {
            System.out.println("I'm here");
        }

        // While loop with control-variable
        int num = 0;
        while (num < 10){
            System.out.println(++num);
        }

        // A simple User-Interface
        while (true){
            String cmd = s.next();
            if (cmd.equals("quit")){
                System.out.println("Bye bye..");
                break;
            }

            System.out.println("User entered: " + cmd);
        }




        //Do-While:
        String searchValue, KEY_TO_SEARCH = "get out";
        do {
            // loop body-
            searchValue = s.next();

            // condition-
        } while (! searchValue.equals(KEY_TO_SEARCH));




        // For:
        // 1. init variable
        // 2. stopping condition
        // 3. make step

        // Count from 0 to 9
        for (int i = 0 ; i < 10 ; i++) {
            System.out.println(i);
        }
        System.out.println("-----------");
        // Count only even-numbers from 0 to 9
        for (int i = 0 ; i < 10 ; i+=2) {
            System.out.println(i);
        }
        System.out.println("-----------");
        // Count multiplications of 10
        for (int i = 10 ; i < 1000000 ; i*=10) {
            System.out.println(i);
        }
        // Infinite loop with for-structure.
        // less recommended that while.
        for (int i = 0 ; ; ){
            System.out.println("Still printing..");
        }
        // Using 'continue' keyword to skip even numbers
        for (int i=0 ; i < 10; i++){
            if (i%2==0)
                continue;
            System.out.println(i);
        }
*/
        for(int i=0 ; i<10 ; i++){  // move between rows
            for(int j=0 ; j<10 ; j++){  // move between columns
                System.out.print("("+i+","+j+")\t");
            }
            System.out.println();
        }
    }
}
