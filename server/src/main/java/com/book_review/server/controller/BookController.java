package com.book_review.server.controller;

import com.book_review.server.entity.Book;
import com.book_review.server.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

  private BookService bookService;

  @Autowired
  public BookController(BookService bookService) {
    this.bookService = bookService;
  }

  @GetMapping("/book")
  public List<Book> getBooks() {
    return bookService.getAllBooks();
  }
}
