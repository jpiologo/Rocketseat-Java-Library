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

        Library library = new Library();
        library.setBooks(List.of(theReplubic, theHobbit));

        while(!exit){
            System.out.println("\n====WELCOME TO JOHNY'S LIBRARY====\n");
            System.out.println("Plase, choose an option:");
            System.out.println("1- Lend a book");
            System.out.println("2- Exit");
            System.out.println("\n");
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    System.out.println("====LEND A BOOK!====");
                    List<Book> availableBooks = library.getAvailableBooks();
                    if(availableBooks.isEmpty()){
                        System.out.println("No books available at the moment.");
                    } else {
                        System.out.println("Available books:\n");
                        availableBooks.forEach(book -> {
                            System.out.println(book);
                            System.out.println("----------------------\n");
                        });
                        System.out.println("Select the book by ID: ");
                        int bookId = scanner.nextInt();
                        scanner.nextLine();
                        Book selectedBook = library.getBooks().stream().filter(book -> book.getId() == bookId).findFirst().orElse(null);
                        System.out.println("Type your first name: ");
                        String firstName = scanner.nextLine();
                        System.out.println("Type your last name: ");
                        String lastName = scanner.nextLine();
                        System.out.println(library.updateBookStatusById(bookId, Status.Unavailable));
                        Lending lending = new Lending(selectedBook, firstName, lastName, currentDate);
                        System.out.println(lending.getInfo());
                    }
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
