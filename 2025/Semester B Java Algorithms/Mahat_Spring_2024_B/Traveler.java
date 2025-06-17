package Mahat_Spring_2024_B;

public class Traveler {
    private String name;
    private Date expireDate;
    private String destination;
    private int payment;

    public String getName() {
        return name;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public String getDestination() {
        return destination;
    }

    public int getPayment() {
        return payment;
    }

    public boolean canGo(Date start, int price, String dest){
        return start.before(this.expireDate)
                && this.payment > price/2
                && this.destination.equals(dest);
    }
}
