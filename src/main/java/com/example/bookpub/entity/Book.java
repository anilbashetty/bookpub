package com.example.bookpub.entity;

import javax.persistence.*;
import java.util.List;

/**
 * @author anilb
 */
@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long Id;
    private String isbn;
    private String title;
    private String description;

    @ManyToOne
    private Author author;
    @ManyToOne
    private Publisher publisher;
    @ManyToMany
    private List<Reviewer> reviewer;

    protected Book() {

    }

    public Book (String isbn, String title, Author author, Publisher publisher) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public List<Reviewer> getReviewer() {
        return reviewer;
    }

    public void setReviewer(List<Reviewer> reviewer) {
        this.reviewer = reviewer;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Id=" + Id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
