package com.SemiFinal;

import java.util.Date;

public class CookBook extends Book {
    private String fieldOfCooking;

    public CookBook(String _title, Author _author, Date _date, String _field){
        super(_title, _author, _date);

        this.fieldOfCooking = _field;
    }
}
