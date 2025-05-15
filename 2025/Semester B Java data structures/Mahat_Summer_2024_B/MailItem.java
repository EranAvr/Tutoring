package Mahat_Summer_2024_B;

public class MailItem {
    protected String from;
    protected String to;
    protected double price;

    public MailItem() {
    }

    public MailItem(String from, String to, double price) {
        this.from = from;
        this.to = to;
        this.price = price;
    }

    public double getRealPrice(){
        return this.price;
    }
    public static String bigSender(MailItem[] items){
        if (items.length == 0)
            return null;
        MailItem mostExp = items[0];

        for (MailItem item : items){
            if (item.getRealPrice() > mostExp.getRealPrice())
                mostExp = item;
        }
        return mostExp.getFrom();
    }


    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
