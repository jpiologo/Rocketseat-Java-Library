package model;

import java.time.LocalDate;

public class Lending {
    Book book;
    String lenderFirstName;
    String lenderSurname;
    LocalDate lendingDate;

    public Lending(Book book, String lenderName, String lenderSurname, LocalDate lendingDate) {
        this.book = book;
        this.lenderFirstName = lenderName;
        this.lenderSurname = lenderSurname;
        this.lendingDate = lendingDate;
    }
}
