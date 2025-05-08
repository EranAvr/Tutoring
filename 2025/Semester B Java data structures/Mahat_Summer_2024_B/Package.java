package Mahat_Summer_2024_B;

public class Package extends MailItem{
    private int weight;
    private boolean isBreakable;

    @Override
    public double getRealPrice(){
        double totalPrice = this.price;

        if (this.weight >= 5){  // heavy package
            totalPrice += (weight - 5) * 3;
        }
        if (this.isBreakable){
            totalPrice += 15;
        }

        return totalPrice;
    }
}
