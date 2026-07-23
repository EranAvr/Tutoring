package ex220726;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Mercedes", null);

        c1.accelerate();
        c1.accelerate();
        c1.accelerate();

        c2.accelerate();

        System.out.println(c1);
        System.out.println(c2);


        //String str = c2.toString();


        // --------- תרגיל כיתה ------------
        // 1
        Car c = new Car();

        // 2
        Engine e = new Engine();

        // 3
        c.setEngine(e);

        // 4


        // 5
        System.out.println( c.getEngine() );

        // 6
        c.getEngine().setTurbo(true);
    }
}
