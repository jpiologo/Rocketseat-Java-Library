package model;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private static int counter = 0;

    int id;
    String title;
    List<Genre> genres = new ArrayList<>();
    Author author;
    Status status = Status.Avaible;

    public Book (String title, List<Genre> genres, Author author){
        this.id = ++counter;
        this.title = title;
        this.genres = genres;
        this.author = author;
    }

    public String getInfo(){
        return String.format(
                "ID: %d%nTitle: %s%nGenres: %s%nAuthor: %s%nStatus: %s%n",
                id,
                title,
                genres,
                author.getName(),
                status
        );
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
