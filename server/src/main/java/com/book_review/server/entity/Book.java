package com.book_review.server.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  @Column(name = "title")
  private String title;

  @ManyToOne
  @JoinColumn(name = "author_id", nullable = false)
  private Author author;

  @Column(name = "description")
  private String description;

  @Column(name = "genre")
  private String genre;

  public Book() {
  }

  public Book(String title, Author author, String description, String genre) {
    this.title = title;
    this.author = author;
    this.description = description;
    this.genre = genre;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Author getAuthor() {
    return author;
  }

  public void setAuthor(Author author) {
    this.author = author;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  @Override
  public String toString() {
    return "Book{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", author=" + author +
            ", description='" + description + '\'' +
            ", genre='" + genre + '\'' +
            '}';
  }
}
