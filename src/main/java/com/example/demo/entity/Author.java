package com.example.demo.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String authorFirsName;
    private String authorLastName;

    @ManyToMany
    private Set<Book> book;

    public Author(){
        book = new HashSet<Book>();
    }

    public long getId() {
        return id;
    }

    public String getAuthorFirsName() {
        return authorFirsName;
    }

    public void setAuthorFirsName(String authorFirsName) {
        this.authorFirsName = authorFirsName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public Set<Book> getBook() {
        return book;
    }

    public void setBook(Set<Book> book) {
        this.book = book;
    }

    public void addBook(Book addbook){
        book.add(addbook);
    }
}
