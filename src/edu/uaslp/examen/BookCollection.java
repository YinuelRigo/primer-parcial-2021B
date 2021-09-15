package edu.uaslp.examen;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {

    private String name;
    private List<Book> books = new ArrayList<>();

    public BookCollection(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public int getStars() {
        int stars = 0;

        for(Book book: books){
            stars += book.getStars();
        }

        stars=stars/books.size();

        return(stars);
    }
}