package Mahat_Spring_2024_B;

public class Toy {
    private int code;
    private int age;
    private double price;
    private boolean isPossible;

    public Toy(int code, int age, double price, boolean isPossible) {
        this.code = code;
        this.age = age;
        this.price = price;
        this.isPossible = isPossible;
    }

    // a)
    public Toy(int code, double price){
        this.code = code;
        this.price = price;
        this.age = 10;
        this.isPossible = false;
    }

}
