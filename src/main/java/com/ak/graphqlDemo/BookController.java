package com.ak.graphqlDemo;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @QueryMapping
    public List<Book> books(){
        return Book.books;
    }

    @QueryMapping
    public Optional<Book> bookById(@Argument Integer id){
        return Book.getBookById(id);
    }

    @SchemaMapping
    public Optional<Author> author(Book book){
        return Author.getAuthorById(book.authorId());
    }
}
