package Mahat_Summer_2024_B;

public class Property {
    private String num;
    private String id;
    private String address;
    private double area;
    private int discount;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }




    double account(){
        return 0;
    }

    public double realAccount(){
        double acc = account();
        double dis;

        switch (discount){
            case 0:
                dis = 0;
                break;
            case 1:
                dis = 0.1 * acc;
                break;
            case 2:
                dis = 0.5 * acc;
                break;
            case 3:
                dis = acc;
                break;
            default:
                dis = 0;
        }

        return acc - dis;
    }
}
