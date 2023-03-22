package com.manas.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter @Getter
@NoArgsConstructor
@Table(name = "books")
public class Book {

    @Id
    @SequenceGenerator(name = "book_id_gen", sequenceName = "book_id_seq", allocationSize = 1, initialValue = 2)
    @GeneratedValue(generator = "book_id_gen", strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private String author;

    private int price;

    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
}
