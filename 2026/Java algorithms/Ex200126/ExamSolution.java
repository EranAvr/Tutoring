package Ex200126;

import java.util.Scanner;

public class ExamSolution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // ex1
        /*int[] arr = {120, 60, 17, 12, 6, 3};
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % arr[i+1] == 0)
                count++;
        }
        System.out.println(count + " Good neighbors");*/

        // ex2
        int count = 0;
        for (int i = 0; i < 3; i++) {
            String str = s.nextLine();

            char first = str.charAt(0);
            char last = str.charAt(str.length()-1);
            if (first>='0' && first<='9' &&
                last>='0' && last<='9'){
                int sum = (first-'0')+(last-'0');

                System.out.println(sum);

                if (sum == 10)
                    count++;
            }
        }
        System.out.println(count);
    }
}
