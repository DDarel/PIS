package ua.pis.lab3.Model;

import javax.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "movie_id", nullable = false)
    private int id;
    @Column(name = "movie_name", nullable = false)
    private String name;
    @Column(name = "movie_duration", nullable = false)
    private int duration;
    @Column(name = "movie_director", nullable = false)
    private String director;
    @Column(name = "movie_poster_path", unique=true)
    private String posterPath;
    @Column(name = "movie_rent_start", nullable = false)
    private Date rentStart;
    @Column(name = "movie_rent_end", nullable = false)
    private Date rentEnd;

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

    public Movie(){}

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
