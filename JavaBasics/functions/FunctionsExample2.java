package exercises;

public class FunctionsExample2 {
    public static void main(String[] args) {
        // variable for debugging-
        int c;
        c = 7;

        // Simple function-
        someFunc();
        //funcWithError();

        c = 17;

        funcWithParam(10);

        int res1 = funcReturnInt();
        System.out.println("funcReturnInt() is saying: " + res1);

        int res2 = mult(5, 7);
        System.out.println("mult() is saying: " + res2);

        String res3 = decorate("My Name", 5);
        System.out.println("res3 is: " + res3);
        decorate2("My Name", 3);



        // Overloading-
        funcWithParam(21.7);
        funcWithParam(10, 21.7);
    }

    public static void someFunc(){
        System.out.println("This is someFunc");
    }

    public static void funcWithError(){
        int e = 3 / 0;
    }

    public static int funcReturnInt(){
        return 11;
    }

    public static int mult(int a, int b){
        return a * b;
    }

    public static String decorate(String text, int numOfAsterix){
        String temp = "";
        // first asterix
        for (int i=0 ; i < numOfAsterix; i++){
            temp += '*';
        }
        // add original text
        temp += text;
        // end asterix
        for (int i=0 ; i < numOfAsterix; i++){
            temp += '*';
        }
        return temp;
    }
    public static void decorate2(String text, int numOfAsterix){
        String tempAsterix = "";

        // asterix
        for (int i=0 ; i < numOfAsterix; i++){
            tempAsterix += '*';
        }

        System.out.println(tempAsterix + " " + text + " " + tempAsterix);
    }





    public static void funcWithParam(int x){
        System.out.println("This function received Integer parameter: " + x);
    }
    public static void funcWithParam(double y){
        System.out.println("This function received Double parameter: " + y);
    }

    public static void funcWithParam(int x, double y){
        System.out.println("This function received Double parameter1: " + x +" and parameter2: "+ y);
    }
}
