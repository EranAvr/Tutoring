package Mahat_Spring_2024_B;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();

        // ex1:
        int num = rnd.nextInt(100, 1000);
        int min = num;
        for (int i=0; i<49; i++){
            num = rnd.nextInt(100, 1000);
            if (min > num){
                min = num;
            }
        }
        System.out.println(min);
        int sum = (num%10) + ((num/=10)%10) + (num/10);
        System.out.println(sum);
    }
}
