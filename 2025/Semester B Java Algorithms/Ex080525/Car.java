package Ex080525;

/*
    Building Need For Speed 16
 */

public class Car {
    // fields
    private String model;
    private int engineSize;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    // constructors
    public Car(String model, int engineSize, String color, int maxSpeed){
        this.model = model;
        this.engineSize = engineSize;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    // getters and setters
    public String getModel(){
        return this.model;
    }
    public void setModel(String newModel){
        this.model = newModel;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
