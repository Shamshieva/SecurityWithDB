package com.manas.service.serviceimpl;

import com.manas.entity.Book;
import com.manas.repository.BookRepository;
import com.manas.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(Long bookId) {
        return bookRepository.findById(bookId)
                .orElseThrow(() ->
                        new NoSuchElementException(String.format("Book with id %d not found",bookId)));
    }

    @Override
    public Book updateBook(Long bookId, Book book) {
        Book book1 = bookRepository.findById(bookId)
                .orElseThrow(() ->
                        new NoSuchElementException(String.format("Book with id %d not found",bookId)));
        book1.setName(book.getName());
        book1.setAuthor(book.getAuthor());
        book1.setPrice(book.getPrice());
//        bookRepository.save(book1);
        return book1;
    }

    @Override
    public String deleteBook(Long bookId) {
        boolean exists = bookRepository.existsById(bookId);
        if (!exists){
            throw new NoSuchElementException(String.format("Book with id %d not found",bookId));
        }
        bookRepository.deleteById(bookId);
        return String.format("Book with id:%d is deleted", bookId);
    }
}
