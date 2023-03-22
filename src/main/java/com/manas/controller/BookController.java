package com.manas.controller;

import com.manas.entity.Book;
import com.manas.service.BookService;
import jakarta.annotation.security.PermitAll;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PreAuthorize("hasAuthority('ADMIN')")
    @PostMapping
    public Book saveBook(@RequestBody Book book){
        return bookService.saveBook(book);
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'VENDOR', 'CUSTOMER')")
    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }


    @PreAuthorize("hasAnyAuthority('ADMIN', 'VENDOR','CUSTOMER')")
    @GetMapping("/{bookId}")
    public Book getBookById(@PathVariable Long bookId){
        return bookService.getBookById(bookId);
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'VENDOR')")
    @PutMapping("/{bookId}")
    public Book updateBook(@PathVariable Long bookId, @RequestBody Book book){
        return bookService.updateBook(bookId, book);
    }

    @PreAuthorize("hasAnyAuthority('ADMIN', 'VENDOR')")
    @DeleteMapping("/{bookId}")
    public String deleteBook(@PathVariable Long bookId){
        return bookService.deleteBook(bookId);
    }

}
