package com.hellokoding.springboot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bookId;
    private String title;
    private Long page;
    private String author;

    public String getAuthor() {
        return this.author;
    }

    public Book setAuthor(String author) {
        this.author = author;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public Book setPage(Long page) {
        this.page = page;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public Book setTitle(String title) {
        this.title = title;
        return this;
    }

    public Long getBookId() {
        return this.bookId;
    }

    public Book setBookId(Long bookId) {
        this.bookId = bookId;
        return this;
    }
}
