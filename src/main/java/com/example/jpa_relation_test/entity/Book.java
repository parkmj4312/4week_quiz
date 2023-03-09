package com.example.jpa_relation_test.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String author;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private int price;
    @Column(nullable = false)
    private Long quantity;
    @ManyToOne
    @JoinColumn(name = "book_store_id", nullable = false)
    private BookStore bookStore;
    @OneToMany
    List<Purchase> purchases = new ArrayList<>();
}
