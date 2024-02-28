package exercises;

public class FunctionsExample {
    public static void main(String[] args) {
        examplePrint();

        decorateText("My Name");

        String result = decorateTextWithReturn("My Name");
        System.out.println(result);

        System.out.println(shorterDecorateTextWithReturn("My Name"));

        System.out.println(doSomething(3.2));
        System.out.println(doSomething(6));

        System.out.println("Maximum value for int: " + Integer.MAX_VALUE);
        System.out.println("Maximum value for float: " + Float.MAX_VALUE);
        System.out.println("Maximum value for double: " + Double.MAX_VALUE);


        String s1 = "Hello World";
        String s2 = "Hello World";
        System.out.println(areTheSame(s1, s2));
        //System.out.println(areTheSame());
    }

    public static void examplePrint(){
        System.out.println("This was printed from a function");
    }
    public static void decorateText(String str){
        String temp = "@@@ " + str + " @@@";
        System.out.println(temp);
    }
    public static String decorateTextWithReturn(String str){
        String temp = "@@@ " + str + " @@@";
        return temp;
    }
    public static String shorterDecorateTextWithReturn(String str){
        str = "@@@ " + str + " @@@";
        return str;
    }

    public static double doSomething(double num){
        return num * 10;
    }

    public static boolean areTheSame(String s1, String s2){
        return s1.equals(s2);
    }
}
