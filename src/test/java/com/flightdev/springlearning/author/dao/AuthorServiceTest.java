package com.flightdev.springlearning.author.dao;

import com.flightdev.springlearning.dao.AuthorDAO;
import com.flightdev.springlearning.model.Author;
import com.flightdev.springlearning.service.IAuthorService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthorServiceTest {
    @Autowired
    private IAuthorService authorService;
    @MockBean
    private AuthorDAO authorRepository;

    private Author authorOne, authorTwo;
    private final Integer authorOneId = 9879, authorTwoId = 9880;
    private final List<Author> authors = new ArrayList<>();

    @Before
    public void setup() {
        authorOne = new Author(authorOneId, "Author One");
        authorTwo = new Author(authorTwoId, "Author Two");

        authors.add(authorOne);
        authors.add(authorTwo);

        Mockito.when(authorRepository.findAll()).thenReturn(authors);

    }
    @Test
    public void testFindAllAndReturnAuthorList() {
        List<Author> authors = authorService.find();
        assertNotNull(authors);
        assertEquals(2, authors.size());
    }
}
