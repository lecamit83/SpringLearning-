package com.flightdev.springlearning.service;

import com.flightdev.springlearning.model.Author;

import java.util.List;
import java.util.Optional;

public interface IAuthorService  {
    List<Author> find();
    Optional<Author> findById(Integer authorId);
    void save(Author author);
}
