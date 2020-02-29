package com.flightdev.springlearning.dao;

import com.flightdev.springlearning.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorDAO extends CrudRepository<Author, Integer> { }
