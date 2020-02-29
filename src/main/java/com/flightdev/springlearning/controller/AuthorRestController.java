package com.flightdev.springlearning.controller;

import com.flightdev.springlearning.model.Author;
import com.flightdev.springlearning.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AuthorRestController {

    private AuthorService authorService;

    @Autowired
    public AuthorRestController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping(value = "/authors", method = RequestMethod.GET)
    public List<Author> find() { return authorService.find(); }

    @RequestMapping(value = "/authors/{author_id}", method = RequestMethod.GET)
    public Optional<Author> findById(@PathVariable("author_id") Integer authorId) {
        return authorService.findById(authorId);
    }

    @RequestMapping(value = "/authors", method = RequestMethod.POST)
    public void save(@RequestBody Author author) {
        authorService.save(author);
    }

}
