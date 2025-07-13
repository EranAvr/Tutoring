package Matkonet_July_2025;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ex8
        
    }
    
    // ex9
    public static String dup(String letters, String digits){
        // בדיקות תקינות
        if (letters.length() != digits.length()
        || letters.length() > 5 || digits.length() > 5)
            return null;
        for (int i = 0; i < letters.length(); i++) {
            if (letters.charAt(i) < 'A')
                return null;
            if (letters.charAt(i) > 'Z' && letters.charAt(i) < 'a')
                return null;
            if (letters.charAt(i) > 'z')
                return null;
        }
        for (int i = 0; i < digits.length(); i++) {
            if (digits.charAt(i) < '0' || digits.charAt(i) > '9')
                return null;
        }
        // בניית הפלט
        String res = "";
        for (int i = 0; i < letters.length(); i++) {
            char l = letters.charAt(i);
            int num = digits.charAt(i) - '0';
            for (int j = 0; j < num; j++) {
                res += l;
            }
        }
        return res;
    }

    // ex11
    public static void vote(int num){
        int[] arr = new int[num];
        Scanner s = new Scanner(System.in);

        //String id = s.nextLine();
        while (!s.nextLine().equals("999")){
            for (int i = 0; i < num; i++){
                if (s.nextInt() == 1)   // קליטה ובדיקה
                    arr[i]++;
            }

            /*
            קליטת בחירות של סטודנט
             */
            //id = s.nextLine();
        }
        // מציאת מקסימום במערך
        int maxVal = arr[0];
        int maxIdx = 0;
        for (int i = 0; i < num; i++) {
            if (arr[i] > maxVal){
                maxVal = arr[i];
                maxIdx = i;
            }
        }
        System.out.println("Maximum index: " + maxIdx);
        // חישוב ממוצע
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / num;
        for (int i = 0; i < num; i++) {
            if (arr[i] < avg)
                System.out.println("Less then avg. idx: " + i + " value: " + arr[i]);
        }
    }
}
