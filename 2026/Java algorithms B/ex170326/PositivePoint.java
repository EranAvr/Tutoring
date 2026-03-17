package ex170326;

public class PositivePoint {
    private double x;
    private double y;

    public PositivePoint(double x, double y){
        /*if (x < 0)
            x = 0;
        this.x = x;

        if (y < 0)
            y = 0;
        this.y = y;*/
        this.setX(x);
        this.setY(y);
    }

    public double getX(){
        return this.x;
    }
    public void setX(double x){
        /*if (x >= 0)
            this.x = x;
        else {
            this.x = 0;
        }*/
        if (x < 0)
            x = 0;
        this.x = x;
    }

    public double getY(){
        return this.y;
    }
    public void setY(double y){
        if (x < 0)
            x = 0;
        this.x = x;
    }

    public String toString(){
        return "(" + this.x + ", " + this.y + ")";
    }
}
