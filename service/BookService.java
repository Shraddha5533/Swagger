package com.swagger.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swagger.entity.Book;
import com.swagger.repository.BookRepository;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public String saveBook(Book book) {
        bookRepository.save(book);
        return "Book saved with id " + book.getBookId();
    }

    public Book getBook(int bookId) {
        Optional<Book> book = bookRepository.findById(bookId);
        return book.orElse(null);
    }

    public List<Book> removeBook(int bookId) {
        bookRepository.deleteById(bookId);
        return bookRepository.findAll();
    }
}
