package Ex301225;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // ex1
        /*String str = s.nextLine();
        char c = s.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c)
                count++;
        }
        System.out.println(count);*/

        // ex2
        // version 1:
        /*String str = s.nextLine();
        char c = s.next().charAt(0);
        int idx = -1;
        for (int i = str.length()-1; i >= 0; i--) {
            if (str.charAt(i) == c){
                idx = i;
                break;
            }
        }
        System.out.println(idx);*/

        // version 2:
        /*String str = s.nextLine();
        char c = s.next().charAt(0);
        int idx = str.length()-1;
        while (str.charAt(idx--) != c && idx > -1); // FIX
        System.out.println(idx);*/

        // ex3
        /*String str = s.nextLine();
        int n = s.nextInt();
        if (n <= str.length()){
            for (int i = 0; i < n; i++) {
                str += str.charAt(i);
            }
        }
        System.out.println(str);*/

        // ex4
        /*String str = s.nextLine();
        int countAt = 0;
        int idxAt = -1;
        int idxDot = -1;

        for (int i = str.length()-1; i >= 0; i--) {
            if (str.charAt(i) == '@'){
                idxAt = i;
                countAt++;
            }
            if (str.charAt(i) == '.')
                idxDot = i;
        }

        char first = str.charAt(0);
        char last = str.charAt(str.length()-1);
        if (countAt==1 && idxDot>-1 && idxAt<idxDot
        && first!='@' && first!='.'
        && last!='@' && last!='.'){
            System.out.println("Good email");
        }
        else {
            System.out.println("Invalid email");
        }*/


        // ex5
        /*String str = s.nextLine();
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c -= 32;
                temp += c;
            }
            else
                temp += c;
        }
        str = temp;
        System.out.println(str);*/

        // ex6
        String str = s.nextLine();
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            res *= 10;
            res += digit;
        }
        System.out.println(res);


    }
}
