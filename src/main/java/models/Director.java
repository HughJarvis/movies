package models;

import java.util.ArrayList;
import java.util.List;


public class Director {

    private Long Id;
    private String name;
    private List<Film> films;

    public Director(String name) {
        this.name = name;
        this.films = new ArrayList<Film>();
    }

    public Director() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
