package Ex161225;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // ex
        // כתבו תוכנית הקולטת מספר שלם
        // ומחשבת את סכום ספרותיו
        int x = s.nextInt();    // x = 123456
        int sum = 0;
        while (x > 0){
            sum += x % 10;
            x = x / 10;
            System.out.println(">> " + x + " " + sum);
        }
        System.out.println(sum);


    }
}
