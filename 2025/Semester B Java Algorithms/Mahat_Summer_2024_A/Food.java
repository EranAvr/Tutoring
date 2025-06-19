package Mahat_Summer_2024_A;

public class Food {
    private String name;
    private double price;
    private boolean isMilk;
    private int rating;

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public boolean isMilk() {
        return isMilk;
    }
    public int getRating() {
        return rating;
    }

    public boolean canChange(Food other){
        /*if (this.isMilk == other.isMilk && this.rating == other.rating && this.price >= other.price)
            return true;
        return false;*/
        return this.isMilk == other.isMilk
                && this.rating == other.rating
                && this.price >= other.price;
    }

    public static void changes(Food[] arr, Food newFood){
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i].canChange(newFood) )
                System.out.println(arr[i].getName());
        }
    }

    public static void offers(Food[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i].getPrice() + arr[j].getPrice() < 100)
                    System.out.println(arr[i].getName() + " " + arr[j].getName());
            }
        }
    }
}
