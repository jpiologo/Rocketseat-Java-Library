import model.Author;
import model.Book;
import model.Genre;
import model.Lending;

import java.time.LocalDate;
import java.util.List;

public class LibrarySoftware {
    static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        Author tolkien = new Author("J.R.R Tolkien", List.of(Genre.Fantasy, Genre.Adventure), false);
        Author plato = new Author("Plato", List.of(Genre.Educational), false);

        Book theHobbit = new Book("The Hobbit", List.of(Genre.Adventure, Genre.Fantasy), tolkien);
        Book theReplubic = new Book("The Republic", List.of(Genre.Educational), plato);

        Lending lending1 = new Lending(theHobbit, "Joao", "Piologo", currentDate);

        System.out.println(theHobbit.getInfo());
        System.out.println(theReplubic.getInfo());
    }
}
