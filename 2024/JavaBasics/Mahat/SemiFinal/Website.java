package Mahat.SemiFinal;

public class Website {

    // a)
    private String name;
    private int num;    // number of items in main menu
    private float price;
    private boolean paid;

    // b)
    public Website(String _name, int _num, float _price, boolean _paid){
        this.name = _name;
        this.num = _num;
        this.price = _price;
        this.paid = _paid;
    }

    // c)
    public Website(Website otherWebsite){
        this.name = otherWebsite.name;
        this.num = otherWebsite.num;
        this.price = otherWebsite.price;
        this.paid = otherWebsite.paid;
    }

    // d)
    public void changePrice(float newPrice){
        this.price = newPrice;
    }

    // e)
    public void incPrice(){
        if (num > 20)
            this.price += 5;
    }

    // f)
    public boolean over100Price(){
        return this.price > 100;
    }

    // g)
    public void addItem(){
        this.num++;
    }

    // h)
    public void buildupName(String str){
        this.name += str;
    }

    // i)
    public String tostring(){
        /*
        // create text for 'paid' field, upfront-
        String result;
        if (this.paid)
            result = "all ready paid";
        else
            result = "not paid yet";
        // create and return the desired text-
        return "Website:" + this.name
                + " ,it includes " + this.num
                + " items in the front page the price is:" + this.price
                + "$ it's " + result;
        */

        return "Website:" + this.name
                + " ,it includes " + this.num
                + " items in the front page the price is:" + this.price
                + "$ it's " + ( this.paid ? "all ready paid" : "not paid yet" );
    }
}
