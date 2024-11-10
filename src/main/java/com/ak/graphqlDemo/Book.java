package com.ak.graphqlDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Book(Integer id,
                   String name,
                   Integer pageCount,
                   Integer authorId) {

    public static List<Book> books = Arrays.asList(
            new Book(1,"BhagwatGeeta",560,1),
            new Book(2,"Quran",650,2),
            new Book(3,"Bible",980,3)
    );

    public static Optional<Book> getBookById(Integer id) {
        return books.stream()
                .filter(b->b.id.equals(id))
                .findFirst();
    }
}
