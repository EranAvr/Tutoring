package Mahat_Spring_2024_B;

public class AIQData {
    private String date;
    private String city;
    private int popul;
    private int aiq;

    public int raiting(){
        if (this.aiq >= 0 && this.aiq <= 49)    // טווח ראשון
            return 1;
        else if (this.aiq >= 50 && this.aiq <= 99)    // טווח שני
            return 2;
        else if (this.aiq >= 100 && this.aiq <= 149)    // טווח שלישי
            return 3;
        else if (this.aiq >= 150 && this.aiq <= 199)    // טווח רביעי
            return 4;
        /*else if (this.aiq >= 200 && this.aiq <= 500)    // טווח חמישי
            return 5;*/
        else {
            return 5;
        }
    }
}
