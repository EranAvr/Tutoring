package Ex130525;

public class Dog {
    // fields
    private String name;
    private String breed;

    // constructor
    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    // getters and setters
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getBreed(){
        return this.breed;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
}
