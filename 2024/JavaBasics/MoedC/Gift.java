package MoedC;

public class Gift {
    private int code;
    private double price;
    private char type;

    public Gift(int code, double price, char type) {
        this.code = code;
        this.price = price;
        this.type = type;
    }

    public int getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public char getType() {
        return type;
    }

    // setters
    public void setType(char t){
        if(t == 'M' || t == 'F' || t == 'U' || t == 'K'){   // רק אם t תקין
            this.type = t;
        }
    }

    // methods:
    public boolean isForMan(){
        if (this.getType() == 'M' || this.getType() == 'U'){
            return true;
        }
        return false;
    }
}
