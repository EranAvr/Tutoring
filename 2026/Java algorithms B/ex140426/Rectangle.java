package ex140426;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double w, double h){   // בנאי פרמטרי
        this.width = w;
        this.height = h;
    }
    public Rectangle(Rectangle other){  // בנאי העתקה
        this.width = other.width;
        this.height = other.height;
    }

    public double getWidth(){
        return this.width;
    }
    public void setWidth(double w){
        this.width = w;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double h){
        this.height = h;
    }


    public double area(){
        return this.width * this.height;
    }
    public double perimeter(){
        return 2*this.width + 2*this.height;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
