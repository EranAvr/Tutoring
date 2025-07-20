package Mahat_Summer_2024_B;

public class CityData {
    private Property[] arr;

    public double totalDiscount(){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {

            double acc = arr[i].account();
            if (arr[i].getDiscount() == 0)
                sum += 0;
            if (arr[i].getDiscount() == 1)
                sum += acc * 0.1;
            if (arr[i].getDiscount() == 2)
                sum += acc * 0.5;
            if (arr[i].getDiscount() == 3)
                sum += acc;
        }
        return sum;
    }
}
