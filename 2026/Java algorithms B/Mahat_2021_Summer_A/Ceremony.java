package Mahat_2021_Summer_A;

import java.util.Scanner;

public class Ceremony {
    private int winner;
    private int[] scores;

    public Ceremony(){
        this.winner = 0;
        this.scores = new int[30];
    }

    public void doChoices(){
        Scanner s = new Scanner(System.in);

        while (true){
            // נקלוט
            int choice1 = s.nextInt();
            int choice2 = s.nextInt();
            int choice3 = s.nextInt();

            // בדיקת תנאי עצירה
            if (choice1==0 && choice2==0 && choice3==0)
                break;

            // עדכון מערך הניקוד
            this.scores[choice1-1] += 5;
            this.scores[choice2-1] += 3;
            this.scores[choice3-1] += 1;
        }
    }

    public int winner(){
        //int max = scores[0];
        int idx = 0;

        for (int i = 0; i < this.scores.length; i++) {
            if (this.scores[i] > this.scores[idx]){
                //max = this.scores[i];
                idx = i;
            }
        }

        return idx + 1;
    }
}
