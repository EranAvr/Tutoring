package ex220726.orders;

import java.util.Arrays;

public class Restaurant {
    private String name;
    private Order[] orders;
    private int numOfOrders;

    public Restaurant() {
        this.name = "";
        this.orders = new Order[10];
        this.numOfOrders = 0;
    }

    public Restaurant(String name, int size) {
        this.name = name;
        this.orders = new Order[size];
        this.numOfOrders = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    public int getNumOfOrders() {
        return numOfOrders;
    }

    public void setNumOfOrders(int numOfOrders) {
        this.numOfOrders = numOfOrders;
    }


    // Methods:
    public void addOrder(Order o){
        // גישה עדיפה כדי למצוא מערך מלא
        // חוסכת חישובים
        if (numOfOrders == this.orders.length){
            System.out.println("Order was NOT added");
            return;
        }

        boolean flag = false;
        for (int i=0; i<this.orders.length ; i++){
            if (orders[i] == null){
                flag = true;
                orders[i] = o;
                this.numOfOrders++;
                System.out.println("Order was added");
                return;
            }
        }

        // גישה פשוטה
        if (!flag)
            System.out.println("Order was NOT added");
    }

    public void cleanOrders(){
        for (int i = 0; i < this.orders.length; i++) {
            if (orders[i] != null && orders[i].isStatus()){
                orders[i] = null;
                this.numOfOrders--;
            }
        }
    }

    public double sumPrices(){
        double sum = 0;
        for (int i = 0; i < this.orders.length; i++) {
            if (orders[i] != null)
                sum += orders[i].calcTotalPrice();
        }
        return sum;
    }


    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", orders=" + Arrays.toString(orders) +
                ", numOfOrders=" + numOfOrders +
                '}';
    }
}
