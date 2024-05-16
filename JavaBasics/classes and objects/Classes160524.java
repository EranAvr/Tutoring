package exercises;


class MyPoint{
    double x;
    double y;

}

class MyPointWithGetterSetter{
    double x;
    private double y;

    public double getY() {
        return y;
    }

    public void setY(double _y) {
        y = _y;
    }
}

class MyPositivePoint{
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        if (x < 0){
            this.x = (-1) * x;
        }
        else {
            this.x = x;
        }
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        if (y < 0){
            this.y = (-1) * y;
        }
        else {
            this.y = y;
        }
    }
}

class MyPointWithConstructor{
    private double x;
    private double y;

    public MyPointWithConstructor(){
        this.x = 1;
        this.y = 1;
    }
    public MyPointWithConstructor(double _x, double _y){
        this.x = _x;
        this.y = _y;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
}


public class Classes160524 {
    public static void main(String[] args) {
        // Simple 'MyPoint' instances:
        MyPoint p = new MyPoint();
        MyPoint p2 = new MyPoint();

        System.out.println(p);

        p.x = 5.2;
        System.out.println(p.x);


        MyPointWithGetterSetter pgs = new MyPointWithGetterSetter();
        pgs.setY(3.2);
        System.out.println(pgs.getY());


        MyPositivePoint pp = new MyPositivePoint();
        pp.setX(-5);
        pp.setY(-8.7);
        System.out.println(pp.getX());
        System.out.println(pp.getY());


        MyPointWithConstructor pwc = new MyPointWithConstructor();
        MyPointWithConstructor pwc2 = new MyPointWithConstructor(3.5, 4.5);
        System.out.println(pwc.getX());
        System.out.println(pwc2.getX());
    }
}
