package Mahat_Summer_2024_B;

public class Letter extends MailItem {
    private boolean isCertified;
    private char size;

    @Override
    public double getRealPrice(){
        double totalPrice = this.price;

        if (isCertified){
            totalPrice += 10;
        }
        if (size == 'S'){
            totalPrice -= 2;
        }
        else if (size == 'L'){
            totalPrice += 3;
        }

        return totalPrice;
    }
}
