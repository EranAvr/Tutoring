package Mahat_Spring_2024_B;

public class Date {
    private int day;
    private int month;
    private int year;

    public boolean before(Date other){
        if( this.year > other.year )
            return false;
        if (this.year == other.year && this.month > other.month )
            return false;
        if ( this.year == other.year && this.month == other.month && this.day > other.day )
            return  false;
        return true;

        /*
            and:
            other = 20/4/2000
            this = 20/5/1999

            return this.year <= other.year
                && this.month <= other.month
                && this.day < other.day;

            or:
            other = 20/4/2000
            this = 20/3/2022

            return this.year <= other.year
                || this.month <= other.month
                || this.day < other.day;
         */
    }
}
