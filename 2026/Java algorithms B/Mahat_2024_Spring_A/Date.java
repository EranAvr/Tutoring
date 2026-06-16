package Mahat_2024_Spring_A;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    /////////////////////////////////////////
    ////////     Our methods    /////////////
    /////////////////////////////////////////

    public boolean after(Date other){
        // נחזיר true אם this גדול/מאוחר יותר
        if(this.year > other.year)
            return true;
        if(this.year < other.year)
            return false;

        if (this.month > other.month)
            return true;
        if(this.month < other.month)
            return false;

        return this.day > other.day;
    }





}
