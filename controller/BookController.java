package com.swagger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.swagger.entity.Book;
import com.swagger.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public String saveBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable int id) {
        return bookService.getBook(id);
    }

    @DeleteMapping("/{id}")
    public List<Book> deleteBook(@PathVariable int id) {
        return bookService.removeBook(id);
    }
}
