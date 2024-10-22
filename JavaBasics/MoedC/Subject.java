package MoedC;

public class Subject {
    private String nameOfSubject;
    private int minimumNumOfWorks;
    private int minimumGrade;
    private int points;

    public Subject(String name, int numOfWorks, int grade, int points){
        this.nameOfSubject = name;
        this.minimumNumOfWorks = numOfWorks;
        this.minimumGrade = grade;
        this.points = points;
    }

    public int getPoints(int numOfWorks, int grade){
        if(grade >= this.minimumGrade && numOfWorks >= this.minimumNumOfWorks){
            return points;
        }
        else {
            return 0;
        }
    }
}
