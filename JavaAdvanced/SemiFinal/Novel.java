package com.SemiFinal;

import java.util.Date;

public class Novel extends Book{
    protected String novelType;

    public Novel(String _title, Author _author, Date _date, String _novelType){
        super(_title, _author, _date);

        this.novelType = _novelType;
    }

    public boolean sameAuthor(Object obj){
        return this.author == ((Book) obj).author;
    }
}
