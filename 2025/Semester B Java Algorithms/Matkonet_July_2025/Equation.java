package Matkonet_July_2025;

public class Equation {
    private double a;
    private double b;
    private double c;

    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getFx(double x){
        return a * x*x + b * x + c;
    }

    public double [] getRoots (){
        double x1 = ((-1*b) + Math.sqrt(b*b - 4*a*c)) / 2*a;
        double x2 = ((-1*b) - Math.sqrt(b*b - 4*a*c)) / 2*a;
        double[] arr = new double[2];
        arr[0] = x1;
        arr[1] = x2;
        return arr;
    }
}
