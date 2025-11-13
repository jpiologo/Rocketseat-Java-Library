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

    public String getInfo(){
        return String.format(
                "Book: %s%nLender name: %s %s%nLending date: %tF",
                book.getTitle(),
                lenderFirstName,
                lenderSurname,
                lendingDate
        );
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
