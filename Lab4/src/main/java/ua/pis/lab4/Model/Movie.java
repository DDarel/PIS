package ua.pis.lab4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Date;
@Entity
public class Movie {
    @Id
    private int id;
    private String name;
    private int duration;
    private String director;
    private String posterPath;
    private Date rentStart;
    private Date rentEnd;

    public Movie() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public Date getRentStart() {
        return rentStart;
    }

    public void setRentStart(Date rentStart) {
        this.rentStart = rentStart;
    }

    public Date getRentEnd() {
        return rentEnd;
    }

    public void setRentEnd(Date rentEnd) {
        this.rentEnd = rentEnd;
    }

    public Movie(int id, String name, int duration, String director, String posterPath, Date rentStart, Date rentEnd) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.director = director;
        this.posterPath = posterPath;
        this.rentStart = rentStart;
        this.rentEnd = rentEnd;
    }

    public Movie(int id, String name, int duration, String director, Date rentStart, Date rentEnd) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.director = director;
        this.rentStart = rentStart;
        this.rentEnd = rentEnd;
    }
}
