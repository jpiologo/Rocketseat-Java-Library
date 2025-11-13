package model;

public enum Genre {
    Fantasy("Fantasy"),
    Adventure("Adventure"),
    Horror("Horror"),
    Noir("Noir"),
    Educational("Educational")
    ;

    private final String name;

    private Genre(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
