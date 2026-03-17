package ex170326;

public class Student {

    // Fields:
    private String id;
    private String name;
    private double grade;

    // Constructor
    public Student(String id, String name, double grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }


    // Getters and Setters:
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getGrade(){
        return this.grade;
    }
    public void setGrade(double grade){
        this.grade = grade;
    }

    public String toString(){
        return "ID: " + this.id + " Name: " + this.name + " Grade: " + this.grade;
    }
}
