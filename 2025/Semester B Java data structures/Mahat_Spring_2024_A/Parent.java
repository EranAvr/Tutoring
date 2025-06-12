package Mahat_Spring_2024_A;

public class Parent {
    // Statics:
    protected static int year;
    public static void setYear(int year){
        Parent.year = year;
    }

    // Fields:
    protected String fName;
    protected String lName;
    protected char gender;
    protected String city;

    // Constructors:
    public Parent(String fName, String lName, char gender){
        this.fName = fName;
        this.lName = lName;
        this.gender = gender;
        this.city = "Beer-Sheva";
    }
    public Parent(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
        this.gender = 'f';
        this.city = "Beer-Sheva";
    }

    // Methods:
    public String getName(){
        return this.fName + " " + this.lName;
    }
    public void updateCity(String city){
        this.city = city;
    }
    public void printDetails(){
        if (this.gender == 'f') System.out.print("Mother");
        else System.out.print("Father");
        System.out.print(" " + getName() + " ");
    }
    public void printCity(){
        System.out.println("lives in " + this.city);
    }
}
