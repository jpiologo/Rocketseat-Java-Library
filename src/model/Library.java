package model;

import java.util.List;

public class Library {
    List<Book> books;
    List<Lending> lendings;
    List<Author> authors;

    public List<Book> getBooks() {
        return books;
    }

    public List<Lending> getLendings() {
        return lendings;
    }

    public List<Author> getAuthors() {
        return authors;
    }
}
