package Mahat_2024_Spring_A;

public class Calendar2024 {
    private int[] days;


    public int numOfDays(int day, int month){
        int sum = 0;

        for (int i = 0; i < month-1; i++) {
            sum += this.days[i];
        }
        sum += (day-1);

        return sum;
    }
}
