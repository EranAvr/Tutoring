package ex220726.orders;

public class Order {
    private String code;
    private boolean status;
    private int time;
    private double price;

    public Order() {
        this.code = "";
        this.status = false;
        this.time = 0;
        this.price = 0.0;
    }
    public Order(String code, boolean status, int time, double price) {
        this.code = code;
        this.status = status;
        this.time = time;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    // Methods:
    public void extendTime(int t){
        this.time += t;
    }
    public void changeStatus(){
        /*if (this.status == true)
            this.status = false;
        else
            this.status = true;*/

        this.status = !this.status;
    }
    public double calcTotalPrice(){
        if (this.time > 2)
            this.price *= 1.1;

        return this.price;
    }
}
