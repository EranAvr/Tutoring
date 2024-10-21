package MoedC;


class Engine{
    private String type;

    public String getType(){
        return this.type;
    }
    public void setType(String t){
        this.type = t;
    }
}

class Car{
    private int year;
    private Engine eng;

    public Car(int y){
        this.year = y;
        this.eng = new Engine();
    }

    public int getYear(){
        return this.year;
    }
    public void setYear(int y){
        this.year = y;
    }
    public Engine getEngine(){
        return this.eng;
    }
    public void setEngine(Engine eng){
        this.eng = eng;
    }
}

public class Ex211024_b {
    public static void main(String[] args) {
        // ex1
        // Write class Engine with the attributes: String type
        // Write class Car with the attributes: int year, Engine eng

        Car bimba = new Car(1990);
        Car bangBang = new Car(2024);

        System.out.println(bimba);
        System.out.println(bimba.getYear());
        System.out.println(bimba.getEngine());
        System.out.println( bimba.getEngine().getType() );

        bimba.getEngine().setType("V8");
        System.out.println( bimba.getEngine().getType() );
    }
}
