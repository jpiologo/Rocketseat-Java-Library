import model.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class LibrarySoftware {
    static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);

        Author tolkien = new Author("J.R.R Tolkien", List.of(Genre.Fantasy, Genre.Adventure), false);
        Author plato = new Author("Plato", List.of(Genre.Educational), false);

        Book theHobbit = new Book("The Hobbit", List.of(Genre.Adventure, Genre.Fantasy), tolkien);
        Book theReplubic = new Book("The Republic", List.of(Genre.Educational), plato);

        Lending lending1 = new Lending(theHobbit, "Joao", "Piologo", currentDate);

        Library library = new Library();
        library.setBooks(List.of(theReplubic, theHobbit));

        while(!exit){
            System.out.println("====WELCOME TO JOHNY'S LIBRARY====\n");
            System.out.println("Plase, choose an option:");
            System.out.println("1- Lend a book");
            System.out.println("2- Exit");
            System.out.println("\n");
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    System.out.println("====LEND A BOOK!====");
                    break;
                case 2:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid character");
            }
        }
    }
}
