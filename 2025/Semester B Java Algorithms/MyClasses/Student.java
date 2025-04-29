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
    public Student(int a){}
    public Student(int a, float b){}
    public Student(float a, int b){}

    public Student(Student student2){
        this.name = student2.name;
        this.age = student2.age;
        this.gender = student2.gender;
        this.grades = student2.grades;  // Not good copy! אנחנו לא משכפלים מערך אלא רק מעבירים רפרנס
    }

    // getters and setters:
    public String getName(){
        return this.name;
    }
    public void setName(String _name){
        System.out.println("this=" + this);
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
