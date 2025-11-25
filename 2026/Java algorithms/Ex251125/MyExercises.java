package Ex251125;

import java.util.Scanner;

public class MyExercises {
    public static void main(String[] args) {
        // https://www.tau.ac.il/~csedu/yesodotoop/java_files/chapter7_java.pdf

        Scanner s = new Scanner(System.in);

        // ex 7.15
        int dup = 1;
        for (int i = 0; i < 5; i++) {
            int num = s.nextInt();
            if (num < 10)
                dup *= num;
        }
        System.out.println(dup);
        
        // ex 7.18
        int n = s.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (1.0 / i);
        }
        System.out.println(sum);
    }
}
