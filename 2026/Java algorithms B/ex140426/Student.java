package ex140426;

public class Student {
    private String name;
    private double[] grades;

    public Student(String name){
        this.name = name;
        this.grades = new double[10];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = -1;
        }
    }
    public Student(Student other){  // בנאי העתקה
        this.name = other.name;
        this.grades = new double[10];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = other.grades[i];
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }


    public double averageGrade(){
        double avg = 0;
        for (int i = 0; i < grades.length; i++) {
            avg += grades[i];
        }
        avg /= grades.length;
        return avg;
    }
    public boolean isPassing(){
        boolean haveF = false;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 0 && grades[i] < 55){
                haveF = true;
                break;
            }
        }
        return !haveF && this.averageGrade() >= 60;
    }
    public void addGrade(double grd){
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] == -1){
                grades[i] = grd;
                break;
            }
        }
    }
}
