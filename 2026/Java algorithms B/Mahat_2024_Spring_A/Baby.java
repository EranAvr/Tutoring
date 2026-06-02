package Mahat_2024_Spring_A;

public class Baby {
    private String name;
    private double[] height; // מדידת גובה חודשית
    private double[] weight; // מדידת משקל חודשית


    // methods:
    // ex4a
    public void setData(int month, double h, double w){
        this.height[month-1] = h;
        this.weight[month-1] = w;
    }
    // ex4b
    public double avgWeight(){
        double sum = 0;
        int count = 0;
        for (int i = 0; i < weight.length; i++) {
            if (weight[i] != 0){
                sum += weight[i];
                count++;
            }
        }
        if (count == 0)
            return count;
        return sum / count;
    }
    // ex4c
    public double getLastBmi(){
        int lastIdx = this.weight.length-1;

        while (lastIdx >= 0 && this.weight[lastIdx] == 0)
            lastIdx--;

        if (lastIdx < 0)    // אינדקס לא חוקי - אין מדידות בכלל
            return 0;
        double bmi = weight[lastIdx] / (height[lastIdx] * height[lastIdx]);
        return bmi;
    }
}
