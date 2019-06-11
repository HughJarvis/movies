package models;

import java.util.ArrayList;
import java.util.List;

public class Film {

    private Long Id;
    private String title;
    private Director director;
    private List<Actor> actors;

    public Film(String title, Director director) {
        this.title = title;
        this.director = director;
        this.actors = new ArrayList<Actor>();
    }

    public Film() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }
}
