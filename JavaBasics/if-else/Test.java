import java.util.Scanner;
import java.lang.Math;

public class Test {
    public static void main(String[] args) {
        System.out.print("This is Text class");
        System.out.println("!");
        System.out.println(4);
        System.out.println(4.24);
        System.out.println(true);
        System.out.println(System.out);

        System.out.println("----------------");
        boolean b = false;
        char c = 'a';
        char anotherChar = c;
        anotherChar -= 32;
        int x = 5;
        double d = Math.PI;
        String str = "This is a java exercise";

        System.out.println(b);
        System.out.println(c);
        System.out.println(anotherChar);
        System.out.println(x);
        System.out.println(d);
        System.out.println(str);

        Scanner s = new Scanner(System.in);
        /*
        System.out.println("-------IO-------");

        String inStr = s.nextLine();
        double inDub = s.nextDouble();
        boolean inBool = s.nextBoolean();

        System.out.println(inStr);
        System.out.println(inDub);
        System.out.println( (int)inDub );
        System.out.println(inBool);
        */
        double y = 3.0 / 5;
        System.out.println(y);
        String sentence = "Hello " + 5 + " World";
        sentence += "!";
        System.out.println(sentence);

        System.out.println("-------Boolean-------");
        // Bool operators:
        System.out.println('a' == 'a');
        System.out.println('a' != 'b');
        System.out.println(3 < 6);
        System.out.println(9 < 6);
        System.out.println(6 <= 6);
        System.out.println(9 >= 6);

        System.out.println('g' > 'a' && 'g' < 'z');
        /*
        a   b   res

        0   0   0
        0   1   0
        1   0   0
        1   1   1
         */
        System.out.println(9 > 6 || 100 < 7);
        /*
        a   b   res

        0   0   0
        0   1   1
        1   0   1
        1   1   1
         */
        System.out.println(4 < 40 && 10*10 <= 100 || 40 >= 1 && 100 > 'a');
        System.out.println(!true);

        System.out.println("-------If-Else-------");
        boolean b1 = true;
        if (b1) {
            System.out.println("This is a if-block");
        }
        if (!b1){
            System.out.println("This is also a if-block");
        }
        else {
            System.out.println("This is a else-block");
        }

        System.out.println("-------If-Else-------");
        int n = s.nextInt();
        if (n % 2 == 0 && n >= 1000)
            System.out.println(n + " is Super even");
        else if (n > 50)
            System.out.println("Bigger than 50");
        else if (n % 2 == 0)
            System.out.println(n + " is even");
        else if (n % 2 != 0)
            System.out.println(n + " is odd");
        else
            System.out.println("None of the above");

        System.out.println("-------If-Else-------");
        int m = s.nextInt();
        if (m % 2 == 0){
            System.out.println(m + " is even");
            if (m >= 0 && m < 100)
                System.out.println("0-99");
            else if (m >= 100 && m < 1000)
                System.out.println("100-999");
            else
                System.out.println("Bigger than 999");
        }
        else{
            System.out.println(m + " is odd");
            if (m == 1 || m == 3 || m == 5 || m == 7)
                System.out.println("This is small PRIME number");
            else
                System.out.println("Just an even number");
        }
    }
}
