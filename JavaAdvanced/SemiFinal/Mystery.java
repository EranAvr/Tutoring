package com.SemiFinal;

import java.util.Date;

public class Mystery extends Novel {
    protected String category;

    public Mystery(String _title, Author _author, Date _date, String _novelType, String _category){
        super(_title, _author, _date, _novelType);

        this.category = _category;
    }
}
