package model;

public enum Status {
    Avaible("Avaible"),
    Unavaible("Unavaible")
    ;

    private final String description;

    private Status(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
