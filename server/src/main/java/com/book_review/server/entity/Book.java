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
  
}
