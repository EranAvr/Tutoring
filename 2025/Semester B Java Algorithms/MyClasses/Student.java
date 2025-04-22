package MyClasses;

public class Student {
    // fields:
    private String name;
    private int age;
    private String gender;
    private float[] grades;


    // בנאי
    public Student(){
        this.name = "";
        this.age = -1;
        this.gender = "";
        this.grades = new float[5];
    }

    // getters and setters:
    public String getName(){
        return this.name;
    }
    public void setName(String _name){
        this.name = _name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float[] getGrades() {
        return grades;
    }

    public void setGrades(float[] grades) {
        this.grades = grades;
    }


}
