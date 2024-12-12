package com.SemiFinal;

import java.util.Date;

public class Book {
    private static int ID = 0;
    protected String title;
    protected Author author;
    protected Date publication;
    protected int serialNumber;

    public Book(String _title, Author _author, Date _date){
        this.title = _title;
        this.author = _author;
        this.publication = _date;

        this.serialNumber = ++ID;
    }

    public boolean sameAuthor(Object obj){
        return this.author == ((Book) obj).author;
    }
}
