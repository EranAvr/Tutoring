package ex220726;


import java.util.Date;

public class Car {
    private String brand;
    private int speed;
    private int fuel;
    private Engine engine;

    public Car(){
        this.brand = "car";
        this.speed = 0;
        this.fuel = 100;
        this.engine = new Engine();
    }
    public Car(String brand){
        this.brand = brand;
        this.speed = 0;
        this.fuel = 100;
        this.engine = new Engine();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    // Methods:
    public void accelerate(){
        this.speed++;
    }
    public void brake(){
        this.speed = 0;
    }
    public void refuel(){
        this.fuel = 100;
    }

    public void changeEngine(Engine newEngine){
        this.engine = newEngine;
    }
    public void careTheEngine(){
        Date d = new Date();
        if (d.after(engine.getLastCare()))
            engine.setLastCare(d);
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                ", fuel=" + fuel +
                '}';
    }
}
