package ex170326;

public class Book {
    // fields
    private String author;
    private String title;
    private int pages;

    // constructor
    public Book(String author, String title, int pages){
        this.author = author;
        this.title = title;
        this.pages = pages;
    }

    // getters and setters
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public int getPages(){
        return this.pages;
    }
    public void setPages(int pages){
        this.pages = pages;
    }

    // toString
    public String toString(){
        return "Author: " + this.author +
                " Title: " + this.title +
                " Pages: " + this.pages;
    }
}
