package com.example.jpa_relation_test.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class BookStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String location;
    @Column(nullable = false)
    private String name;
    @OneToMany
    List<Book> books = new ArrayList<>();
    @OneToMany
    List<Member> members = new ArrayList<>();
}
