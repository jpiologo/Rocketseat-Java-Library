package model;

import java.util.List;

public class Library {
    private List<Book> books;
    private List<Lending> lendings;
    private List<Author> authors;

    public List<Book> getBooks() {
        return books;
    }

    public List<Lending> getLendings() {
        return lendings;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void setLendings(List<Lending> lendings) {
        this.lendings = lendings;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
