package com.manas.service;

import com.manas.entity.Book;

import java.util.List;

public interface BookService {
    Book saveBook(Book book);

    List<Book> getAllBooks();

    Book getBookById(Long bookId);

    Book updateBook(Long bookId, Book book);

    String deleteBook(Long bookId);

}
