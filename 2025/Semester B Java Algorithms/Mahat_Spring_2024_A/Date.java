package Mahat_Spring_2024_A;

public class Date
{
    private int day; // )31 - מייצגת את היום )שלמים בין 1 ל
    private int month; // )12 - מייצגת את החודש )שלמים בין 1 ל
    private int year; // ) מייצגת את השנה )שלמים חיוביים בני ארבע ספרות

    public Date(int day, int month, int year)
    {
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

    public boolean after(Date other){
        /*if (this.year > other.year ||
            this.month > other.month ||
            this.day > other.day){
            return true;
        }
        else {
            return false;
        }*/
        return this.year > other.year || this.month > other.month || this.day > other.day;
    }
}
