package Mahat_Summer_2023_A;

public class Room {
    protected int num;
    protected int beds;
    protected double price;

    public int getNum() {
        return num;
    }

    public int calcCleaningTime(){
        return beds * 5 + floorAndDust();
    }
    public int floorAndDust(){
        return 10;
    }
}
