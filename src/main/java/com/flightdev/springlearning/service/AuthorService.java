package com.flightdev.springlearning.service;

import com.flightdev.springlearning.dao.AuthorDAO;
import com.flightdev.springlearning.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService implements IAuthorService {
    @Autowired
    private AuthorDAO authorDAO;

    @Override
    public List<Author> find() {
        return (List<Author>) authorDAO.findAll();
    }

    @Override
    public Optional<Author> findById(Integer authorId) {
        return authorDAO.findById(authorId);
    }

    @Override
    public void save(Author author) {
        authorDAO.save(author);
    }
}
