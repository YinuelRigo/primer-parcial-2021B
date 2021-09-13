package edu.uaslp.examen;

import java.util.ArrayList;

public class BookCollection {

    private String name;
    private ArrayList<Book> books;

    public void BookCollection(String name){
        this.name = name;
    }

    public String getName(String name) {
        return this.name;
    }

    public void addBook(Book book){

    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public int getStars() {
        int stars=0;

        return(stars);
    }
}
