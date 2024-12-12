package com.SemiFinal;

public class Library {
    private String libraryName;
    private Book books[];

    public Library(String _libName){
        this.libraryName = _libName;
        this.books = new Book[100];
    }

    public int countDetectiveBooks(){
        int count = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof Mystery && ( (Mystery)books[i] ).category == "Detective" ){
                count++;

            }
        }
        return count;
    }
}
