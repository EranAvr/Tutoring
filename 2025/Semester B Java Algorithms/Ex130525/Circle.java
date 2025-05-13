package Ex130525;

public class Circle {
    private double radius;

    public Circle(double r){
        this.radius = r;
    }

    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double r){
        this.radius = r;
    }

    public double area(){
        return Math.PI * radius * radius;
    }
    public double circumference(){
        return 2 * Math.PI * radius;
    }
}
