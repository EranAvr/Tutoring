package ex140426;

public class DemoClass {
    private String name;
    private int num;
    private double floatingValue;

    public DemoClass(){
        this.name = "empty";
        this.num = 1;
        this.floatingValue = 2.71;
    }
    public DemoClass(DemoClass other){  // בנאי העתקה
        this.name = other.getName();
        this.num = other.getNum();
        this.floatingValue = other.getFloatingValue();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getFloatingValue() {
        return floatingValue;
    }

    public void setFloatingValue(double floatingValue) {
        this.floatingValue = floatingValue;
    }

    @Override
    public String toString() {
        return "DemoClass{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", floatingValue=" + floatingValue +
                '}';
    }
}
