package Mahat_Spring_2024_A;

public class Worker {
    private String name;
    private Date birthday;

    public Worker(String name, int day, int month, int year){
        this.name = name;
        this.birthday = new Date(day, month, year);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
