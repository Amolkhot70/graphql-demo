package com.ak.graphqlDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Author(Integer id,
                     String name) {

    public static List<Author> authors = Arrays.asList(
            new Author(1,"Vyas"),
            new Author(2,"Mohammad Ali Jinha"),
            new Author(3,"Jijus")
    );

    public static Optional<Author> getAuthorById(Integer id) {
        return authors.stream()
                .filter(b->b.id.equals(id))
                .findFirst();
    }
}
