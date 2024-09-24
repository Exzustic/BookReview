package com.book_review.server.controller;

import com.book_review.server.entity.Author;
import com.book_review.server.service.AuthorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

  private final AuthorService authorService;

  public HelloController(AuthorService authorService){
    this.authorService = authorService;
  }

  @GetMapping("/")
  public String hello() {
    return "Hello World";
  }

  @GetMapping("/authors")
  public List<Author> getAuthors() {
    return authorService.getAuthorList();
  }
}
