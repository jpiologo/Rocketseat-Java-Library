package model;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private static int counter = 0;

    int id;
    String name;
    List<Genre> literaryGenres = new ArrayList<>();
    boolean stillWrites;

    public Author(String name, List<Genre> literaryGenres, boolean stillWrites) {
        this.id = ++counter;
        this.name = name;
        this.literaryGenres = literaryGenres;
        this.stillWrites = stillWrites;
    }

    public String getName() {
        return name;
    }

    public List<Genre> getLiteraryGenres() {
        return literaryGenres;
    }

    public boolean isStillWrites() {
        return stillWrites;
    }

    public String getInfo() {
        return String.format(
                "ID: %d%nAuthor: %s%nLiterary Genres: %s%nStill writes? %s%n",
                id,
                name,
                literaryGenres.stream().map(Genre::getName).toList(),
                stillWrites
        );
    }
}
