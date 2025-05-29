package Mahat_Summer_2024_B.Helpl4U;

import java.util.Queue;

public class Service {
    // אוסף מסוג תור להחזקת הממתינים לשירות
    // בחרנו באוסף תור מכיוון שסדר הכנת/הוצאת איברים
    // בדיוק מסתדר לנו עם דרישות המערכת
    private Queue<Caller> callers;

    // ex11e
    private int count;
    private final int standNum;
    public static int maxCallers = 0;   // שומר מס' לקוחות מקסימלי
    public static int maxStand = -1; // שומר את מס' העמדה שהגיעה ללקוחות מקסימליים

    public Service(int myNum) {
        this.standNum = myNum;
        this.count = 0;
    }

    void addCaller (Caller c){
    }
    Caller callback(){
        /*Caller temp = this.callers.remove();
        return temp;*/

        this.count++;   // עבור לקוח שהוצאנו מהתור כדי לטפל בו בפועל
        if (this.count > maxCallers){
            maxCallers = count;
            maxStand = standNum;
        }

        return this.callers.remove();
    }
    int getNumOfCallers(){}


    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
}
