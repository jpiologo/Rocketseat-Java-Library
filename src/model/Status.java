package model;

public enum Status {
    Available("Available"),
    Unavailable("Unavailable")
    ;

    private final String description;

    private Status(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
