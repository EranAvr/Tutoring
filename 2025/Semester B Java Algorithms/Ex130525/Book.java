package Ex130525;

public class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.ISBN = isbn;
    }

    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
