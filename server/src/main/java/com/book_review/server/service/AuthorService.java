package com.book_review.server.service;

import com.book_review.server.entity.Author;
import com.book_review.server.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

  private final AuthorRepository authorRepository;

  @Autowired
  public AuthorService(AuthorRepository authorRepository) {
    this.authorRepository = authorRepository;
  }

  public List<Author> getAuthorList() {
    return authorRepository.findAll();
  }
}
