package com.example.demo.controller;

import com.example.demo.entity.Author;
import com.example.demo.entity.Book;
import com.example.demo.repository.AuthorRepository;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    AuthorRepository authorRepository;
    @Autowired
    BookRepository bookRepository;

    @GetMapping("/")
    public String homepage(){

        Author author1 = new Author();
        author1.setAuthorFirsName("Henok");
        author1.setAuthorLastName("Besha");

        Author author2 = new Author();
        author2.setAuthorFirsName("Semeneh");
        author2.setAuthorLastName("Genzeb");

        Author author3 = new Author();
        author3.setAuthorFirsName("Abezer");
        author3.setAuthorLastName("Zergaw");

        Book book1 = new Book();
        book1.setTitle("Java");
        book1.setYear(1700);

        Book book2 = new Book();
        book2.setTitle("HTML");
        book2.setYear(1800);

        Book book3 = new Book();
        book3.setTitle("JavaScript");
        book3.setYear(1900);

        bookRepository.save(book1);
        bookRepository.save(book2);
        bookRepository.save(book3);

        author1.addBook(book1);
        author1.addBook(book2);
        author1.addBook(book3);

        author2.addBook(book1);
        author2.addBook(book2);

        author3.addBook(book3);

        authorRepository.save(author1);
        authorRepository.save(author2);
        authorRepository.save(author3);



        return "homepage";
    }
}
