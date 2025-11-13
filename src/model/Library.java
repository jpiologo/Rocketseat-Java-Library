package model;

import java.util.Comparator;
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

    public void setLendings(Lending lending) {
        lendings.add(lending);
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<Book> getAvailableBooks(){
        return books.stream().filter(book -> book.status == Status.Available).sorted(Comparator.comparing(Book::getId)).toList();
    }

    public String updateBookStatusById(int id, Status newStatus) {
        for (Book book : books) {
            if (book.getId() == id) {

                if (book.getStatus() == Status.Unavailable) {
                    return "Book is already lent!";
                }

                book.setStatus(newStatus);
                return "Transaction successful!";
            }
        }

        return "Book with ID " + id + " not found.";
    }
}
